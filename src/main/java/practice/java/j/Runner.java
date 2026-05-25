package practice.java.j;

/**
 * Static Keyword Challenge - Runner
 * 
 * Your task is simply to change the variable global_var from Class to the value
 * of 'in' given in the parameters. As you do so, notice that you're interacting
 * with the CLASS and not an OBJECT. This is due to the static keyword.
 */
public class Runner {
    /**
     * @param in the String value you should change global_var to in.
     */
    public void changeClassVar(String in) {
        Class.global_var = in;
    }
}
