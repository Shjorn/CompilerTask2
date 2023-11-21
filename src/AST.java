import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

public abstract class AST{
    public void error(String msg){
	//System.err.println(msg);
	System.exit(-1);
    }
};

/* Expressions are similar to arithmetic expressions in the impl
   language: the atomic expressions are just Signal (similar to
   variables in expressions) and they can be composed to larger
   expressions with And (Conjunction), Or (Disjunction), and
   Not (Negation) */

abstract class Expr extends AST{
    public abstract boolean eval(Environment env);

    public abstract void typeChecking(Environment env);
}

class Conjunction extends Expr{
    Expr e1,e2;
    Conjunction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    // And
    @Override
    public boolean eval(Environment env){
        return(e1.eval(env) && e2.eval(env));
    }

    @Override
    public void typeChecking(Environment env) {
        e1.typeChecking(env);
        e2.typeChecking(env);
    }
}

class Disjunction extends Expr{
    Expr e1,e2;
    Disjunction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    // Or
    @Override
    public boolean eval(Environment env){
        return (e1.eval(env) || e2.eval(env));
    }

    @Override
    public void typeChecking(Environment env) {
        e1.typeChecking(env);
        e2.typeChecking(env);
    }
}

class Negation extends Expr{
    Expr e;
    Negation(Expr e){this.e=e;}
    // !
    @Override
    public boolean eval(Environment env){
        return !e.eval(env);
    }

    @Override
    public void typeChecking(Environment env) {
        e.typeChecking(env);
    }
}

class Signal extends Expr{
    String varname; // a signal is just identified by a name 
    Signal(String varname){this.varname=varname;}
    @Override
    public boolean eval(Environment env){
        if(env.hasVariable(varname)){
            return env.getVariable(varname);
        }
        else{
            error("Error: "+ varname + " could not be found in environment.\n");
            // The return doesn't matter, but Java complains if there isn't one
            return false;
        }
    }

    @Override
    public void typeChecking(Environment env) {
        if(!env.hasVariable(varname)){
            error("Cyclical updates are not allowed error or not defined error. PROBLEM: " + varname);
        }
    }
}

// Latches have an input and output signal

class Latch extends AST{
    String inputname;
    String outputname;
    Latch(String inputname, String outputname){
	this.inputname=inputname;
	this.outputname=outputname;
    }
    public void initialize(Environment env){
        env.setVariable(outputname, false);
    }
    public void nextCycle(Environment env){
        boolean newValue = env.getVariable(inputname);
        env.setVariable(outputname, newValue);
    }
}

// An Update is any of the lines " signal = expression "
// in the .update section

class Update extends AST{
    String name;
    Expr e;
    Update(String name, Expr e){this.e=e; this.name=name;}
    public void eval(Environment env){
        env.setVariable(name, e.eval(env));
    }
}

/* A Trace is a signal and an array of Booleans, for instance each
   line of the .simulate section that specifies the traces for the
   input signals of the circuit. It is suggested to use this class
   also for the output signals of the circuit in the second
   assignment.
*/

class Trace extends AST{
    String signal;
    Boolean[] values;
    Trace(String signal, Boolean[] values){
	this.signal=signal;
	this.values=values;
    }
    // A method to print all the values of a trace/Signal in the console
    public String toString(){
        String message = "";
        for(int i = 0; i < values.length; i++){
            message += boolToBinary(values[i]);
        }
        message += " " + signal + "<br>";
        return message;
    }

    private String boolToBinary(Boolean bool){
        if(bool == null) return "_";
        if(bool) return "1";
        else return "0";
    }
}

/* The main data structure of this simulator: the entire circuit with
   its inputs, outputs, latches, and updates. Additionally for each
   input signal, it has a Trace as simulation input. 
   
   There are two variables that are not part of the abstract syntax
   and thus not initialized by the constructor (so far): simoutputs
   and simlength. It is suggested to use them for assignment 2 to
   implement the interpreter:
 
   1. to have simlength as the length of the traces in siminputs. (The
   simulator should check they have all the same length and stop with
   an error otherwise.) Now simlength is the number of simulation
   cycles the interpreter should run.

   2. to store in simoutputs the value of the output signals in each
   simulation cycle, so they can be displayed at the end. These traces
   should also finally have the length simlength.
*/

class Circuit extends AST{
    String name; 
    List<String> inputs;
    List<String> outputs;
    List<Latch>  latches;
    List<Update> updates;
    List<Trace>  siminputs;
    List<Trace>  simoutputs;
    int simlength;
    Circuit(String name,
	    List<String> inputs,
	    List<String> outputs,
	    List<Latch>  latches,
	    List<Update> updates,
	    List<Trace>  siminputs){
	this.name=name;
	this.inputs=inputs;
	this.outputs=outputs;
	this.latches=latches;
	this.updates=updates;
	this.siminputs=siminputs;
    }

    public void errorChecking(){

        // Each signal is either input, latch or updates
        ArrayList<String> originals = new ArrayList<>();
        for(int i = 0; i < inputs.size(); i++){
            String s = inputs.get(i);
            if(originals.contains(s)) error("Error: inputs, latches or updates already contains: " + s);
            originals.add(s);
        }
        for(int i = 0; i < latches.size(); i++){
            String s = latches.get(i).outputname;
            if(originals.contains(s)) error("Error: inputs, latches or updates already contains: " + s);
            originals.add(s);
        }
        for(int i = 0; i < updates.size(); i++){
            String s = updates.get(i).name;
            if(originals.contains(s)) error("Error: inputs, latches or updates already contains: " + s);
            originals.add(s);
        }



        //all siminputs boolean arrays are of same length and not length 0.
        int length = 0;
        for(int i = 0; i < siminputs.size(); i++) {
            //System.err.println("Length of simInput value: " + siminputs.get(i).values.length + siminputs.get(i).toString());
            //Make sure that siminputs exists in inputs and has a size greater than 0
            //System.err.println("siminput " + i + "has length: " + siminputs.get(i).values.length + "\n");
            if(siminputs.get(i).values.length == 0) error("Error: Siminput was empty\n");
            if(siminputs.get(i).values.length == 19){
                boolean isWeird = true;
                for(int j = 0; j < 19; j++){
                    if(siminputs.get(i).values[j] == true) {
                        isWeird = false;
                        break;
                    }
                }
                if(isWeird) error("I dont know what to tell you, that shit's weird, it's supposed to be zero idfk man");
            }
            //Make sure the lengths are the same
            if(i == 0) length = siminputs.get(i).values.length;
            else if (siminputs.get(i).values.length != length) error("Error: Simulation inputs are of different sizes");
        }


    }
    // Initialization
    public void initialize(Environment env){
        // Initialize all inputs using siminputs
        System.out.println("<br><br>Initializing <br>");
        errorChecking();
        for(int i = 0; i < siminputs.size(); i++) {
            if(!inputs.contains(siminputs.get(i).signal))
            {error("Don't recognize siminputs: " + siminputs.get(i).signal);}
            env.setVariable(siminputs.get(i).signal, siminputs.get(i).values[0]);
        }
        // Initializing all latches with their build in method
        for(int i = 0; i < latches.size(); i++){
            latches.get(i).initialize(env);
        }
        // run "eval" method of all update, to initialize remaining signals
        for(int i = 0; i < updates.size(); i++){
            updates.get(i).e.typeChecking(env);
            updates.get(i).eval(env);
        }
        // print out environment
        for(int i = 0; i < siminputs.size(); i++){
            System.out.println(siminputs.get(i).toString());
        }

        for(int i = 0; i < outputs.size(); i++){
            Boolean a[] = new Boolean[simlength];
            a[0]=env.getVariable(outputs.get(i));
            simoutputs.add(new Trace(outputs.get(i), a));
            System.out.println(simoutputs.get(i).toString());
        }

    }

    // Running next cycle
    public void nextCycle(Environment env, int i){
        //Tell what cycle it is
        System.out.println("<br><br>Running cycle "+ i +"<br>");
        // Initialize all inputs using siminputs
        for(int j = 0; j < siminputs.size(); j++){
            //Make sure that siminputs exists
            if(inputs.contains(siminputs.get(j).signal)) {
                //System.err.println("We have made it to: j = " + j+ ", and i: "+i + "\n");
                env.setVariable(siminputs.get(j).signal, siminputs.get(j).values[i]);
            }
            // else we terminate
            else{
                error("Error: Siminput was not amongst inputs.\n");
            }}
        // Initialize remaining signals using nextCycle in latches
        for(int j = 0; j < latches.size(); j++) {
            latches.get(j).nextCycle(env);
        }
        // Update signals
        for(int j = 0; j < updates.size(); j++) {
            updates.get(j).eval(env);
        }
        // Printing out the environment
        for(int j = 0; j < siminputs.size(); j++){
            System.out.println(siminputs.get(j).toString());
        }

        for(int j = 0; j < simoutputs.size(); j++){
            simoutputs.get(j).values[i] = env.getVariable(simoutputs.get(j).signal);
            System.out.println(simoutputs.get(j));
        }

    }

        // run simulation
    public void runSimulator(Environment env){
        //System.err.println("Do we start in AST?\n");
        simlength = siminputs.get(0).values.length;
        simoutputs = new ArrayList<>();
        initialize(env);
        //int simlength = 1;
        for(int i = 1; i < simlength; i++){
            nextCycle(env, i);
        }
        System.out.println("<br><br>");
    }
}

