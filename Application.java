/**
 * @author Pushkar Taday
 */


import java.util.Scanner;

public abstract class Application {
    /**
     * This method is a mutator method which helps the switch case to run
     * @param c
     * char data type which acts a switch variable
     */
    public abstract void setCharacter(char c);

    /**
     * This method helps the command to be read and added into the stack
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     * @throws InvalidCommandException
     * if the command is invalid for the given stack
     */
    public abstract void readCommand(Scanner scanner)throws InvalidCommandException;

    /**
     * This method allows the user to go to the previous command
     * @throws EmptyStackException
     * if the stack is empty
     */
    public abstract void goBack()throws EmptyStackException;

    /**
     * This method acts as an accessor method for stack
     * @return
     * the stack which is currently being referenced
     */
    public abstract CommandStack getStack();

}
