/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

import java.util.Scanner;

/**
 * This class represents Find a Place option in the maps menu
 */

public class FindPlace implements Command {

    private String destination;

    /**
     * This is a parameterized constructor for this class
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     */

    public FindPlace (Scanner scanner)
    {
        scanner.nextLine();
        destination=scanner.nextLine();
        System.out.println();
    }

    /**
     * It is an accessor method for destination member variable
     * @return
     * String containing the destination
     */
    public String getDestination() {
        return destination;
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
            if (stack.peek() instanceof GoogleSomething || stack.peek() instanceof FollowLink || stack.peek() instanceof GoToBookmark)
                return false;
        } catch (EmptyStackException e) {
            return true;
        }
            return true;
    }

    /**
     * his method returns screen information for the 'F' command in Maps
     * @return
     * a string containing the screen command for 'F' command
     */

    public String toString()
    {
     return "Showing results for "+destination;
    }

    /**
     * his method returns stack information for the 'F' the command in Maps
     * @return
     * a string containing the stack trace for 'F' command
     */
    public String toShortString() {
        return "->F:"+destination;
    }
}
