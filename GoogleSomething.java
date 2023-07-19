/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

import java.util.Scanner;

/**
 * This class represent Google Something option in the safari menu
 */

public class GoogleSomething implements Command {

    private String query;

    /**
     * This is a parameterized constructor for this class
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     */

    public GoogleSomething (Scanner scanner)
    {
        scanner.nextLine();
        query=scanner.nextLine();
        System.out.println();
    }

    /**
     * Checks whether the 'G' command is valid or not to be added in the specified stack
     * @param stack
     * takes in the stack that has to be checked
     * @return
     * a boolean value based on conditions
     */

    public boolean validCommand(CommandStack stack) {
        try {
            if (stack.peek() instanceof FindPlace || stack.peek() instanceof PlanRoute || stack.peek() instanceof StartNavigation)
                return false;
        } catch (EmptyStackException e) {
            return true;
        }
        return true;
    }

    /**
     * his method returns stack information for the 'G' the command in Safari
     * @return
     * a string containing the stack trace for 'G' command
     */

    public String toShortString() {
        return "->G:"+ query;
    }

    /**
     * his method returns screen information for the 'G' command in Safari
     * @return
     * a string containing the screen command for 'G' command
     */

    public String toString()
    {
        return "Google: "+query;
    }
}
