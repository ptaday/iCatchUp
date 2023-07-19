/**
 * @author Pushkar Taday
 */


import java.util.Scanner;

/**
 * This class represent Follow Link option in the safari menu
 */

public class FollowLink implements Command{

    private String link;

    /**
     * This is a parameterized constructor for this class
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     */
    public FollowLink (Scanner scanner)
    {
        scanner.nextLine();
        link=scanner.nextLine();
        System.out.println();
    }

    /**
     * Checks whether the 'L' command is valid or not to be added in the specified stack
     * @param stack
     * takes in the stack that has to be checked
     * @return
     * a boolean value based on conditions
     */
    public boolean validCommand(CommandStack stack) {
        try {
            if (stack.isEmpty()
                    ||stack.peek() instanceof FindPlace
                    || stack.peek() instanceof PlanRoute
                    || stack.peek() instanceof StartNavigation)
                return false;
        } catch (EmptyStackException e) {
            return false;
        }
        return true;
    }
    /**
     * his method returns screen information for the 'L' command in Safari
     * @return
     * a string containing the screen command for 'L' command
     */
    public String toString()
    {
        return link;
    }

    /**
     * his method returns stack information for the 'L' the command in Safari
     * @return
     * a string containing the stack trace for 'L' command
     */
    public String toShortString() {
        return "->L:"+link;
    }
}
