/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

/**
 * This class represent Start Navigation option in the maps menu
 */

public class StartNavigation implements Command {

    private String source;
    private String destination;

    /**
     * his is a parameterized constructor for this class
     * @param commandStack
     * takes in stack to check and then input for navigation
     */
    public StartNavigation (CommandStack commandStack)
    {
        try {
            if(commandStack.isEmpty()==false) {
                if (commandStack.stack.get(commandStack.getCount()-1) instanceof FindPlace) {
                    destination = ((FindPlace) commandStack.peek()).getDestination();

                } else if (commandStack.stack.get(commandStack.getCount()-1) instanceof PlanRoute) {
                    source = ((PlanRoute) commandStack.peek()).getSource();
                    destination = ((PlanRoute) commandStack.peek()).getDestination();
                } else
                    System.out.println("No route or destination!\n");
            }
            else
            {
                System.out.println("No route or destination!\n");
            }
        }
        catch(EmptyStackException e)
        {

        }
    }

    /**
     * Checks whether the 'N ' command is valid or not to be added in the specified stack
     * @param stack
     * takes in the stack that has to be checked
     * @return
     * a boolean value based on conditions
     */

    public boolean validCommand(CommandStack stack) {
        try {
            if (stack.isEmpty()
                    ||stack.peek() instanceof GoogleSomething
                    || stack.peek() instanceof FollowLink
                    || stack.peek() instanceof GoToBookmark||stack.peek() instanceof StartNavigation)
                return false;
        } catch (EmptyStackException e) {
            return false;
        }
        return true;
    }

    /**
     * his method returns screen information for the 'N' command in Maps
     * @return
     * a string containing the screen command for 'N' command
     */
    public String toString() {

        if(source==null)
            return "Navigating to "+destination;

        else
            return "Navigating from "+source+" to "+destination;
    }

    /**
     * his method returns stack information for the 'N' the command in Maps
     * @return
     * a string containing the stack trace for 'N' command
     */
    public String toShortString() {

        if(source==null)
            return "->N:"+destination;

        else
         return "->N:"+this.source+"-"+this.destination;

    }
}
