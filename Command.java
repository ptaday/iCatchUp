/**
 * @author Pushkar Taday
 */


/**
 * This is an interface. When implemented all the method in the body have to be overridden.
 */
public interface Command {

    /**
     * Checks whether command is valid or not
     * @param stack
     * takes in the stack that has to be checked
     * @return
     * a boolean value based on conditions
     */
    public boolean validCommand(CommandStack stack);

    /**
     * his method returns screen information regarding the command
     * @return
     * a string containing the screen command
     */
    public String toString();

    /**
     * his method returns stack information regarding the command
     * @return
     * a string containing the stack trace
     */
    public String toShortString();

}
