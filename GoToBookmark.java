/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

import java.util.Scanner;

public class GoToBookmark implements Command {

    /**
     * This class represent Follow Link option in the safari menu
     */

    private String bookmark;

    /**
     * This is a parameterized constructor for this class
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     */

    public GoToBookmark (Scanner scanner)
    {
        scanner.nextLine();
        bookmark=scanner.nextLine();
        System.out.println();
    }

    /**
     * Checks whether the 'F' command is valid or not to be added in the specified stack
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
     * his method returns screen information for the 'F' command in Safari
     * @return
     * a string containing the screen command for 'F' command
     */

    public String toString()
    {
        return "Showing results for "+bookmark;
    }

    /**
     * his method returns stack information for the 'F' the command in Safari
     * @return
     * a string containing the stack trace for 'F' command
     */

    public String toShortString() {
        return "->F:"+bookmark;
    }
}
