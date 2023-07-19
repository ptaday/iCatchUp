/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

import java.util.Scanner;

/**
 * This class represents Plan a Route option in the maps menu
 */

public class PlanRoute implements Command{

    private String source;
    private String destination;
    public int planRouteCounter=0;

    /**
     * This is a parameterized constructor for this class
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     */

    public PlanRoute(Scanner scanner)
    {
        scanner.nextLine();
        System.out.print("Enter the source:");
        source=scanner.nextLine();
        System.out.print("Enter the destination:");
        destination=scanner.nextLine();
        System.out.println();
    }

    /**
     * It is an accessor method for source member variable
     * @return
     * String containing the source
     */
    public String getSource() {
        return source;
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
     * Checks whether the 'P' command is valid or not to be added in the specified stack
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
     * his method returns screen information for the 'P' command in Maps
     * @return
     * a string containing the screen command for 'P' command
     */

    public String toString()
    {
       return "Planning route from "+this.source+" to "+this.destination;
    }

    /**
     * his method returns stack information for the 'P' the command in Maps
     * @return
     * a string containing the stack trace for 'P' command
     */
    public String toShortString() {
        return "->P:"+this.source+"-"+this.destination;
    }

}
