/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

import java.util.ArrayList;

/**
 * This class represents stack for all the commands
 */

public class CommandStack {

    public ArrayList<Command>stack=new ArrayList<Command>();

    public int count=0;

    /**
     * This method allows user to add command into the stack
     * @param command
     * Takes in command to be added into the stack
     * @throws InvalidCommandException
     * if the command is invalid for the stack
     */
    public void push(Command command) throws InvalidCommandException
    {

      if(command.validCommand(this))
      {
          stack.add(count,command);
          count++;

      }
      else
      {
          throw new InvalidCommandException("Command is not valid");
      }
    }

    /**
     * This methods helps to remove the topmost command from the stack
     * @return
     * topmost command from the stack
     * @throws EmptyStackException
     * if the stack is empty
     */
    public Command pop() throws EmptyStackException
    {
        if(count==0)
            throw new EmptyStackException("Nothing on the stack");

        Command remove= stack.remove(count-1);

        --count;

        return remove;

    }

    /**
     * the method helps access the topmost command in the stack
     * @return
     * the topmost element in the stack
     * @throws EmptyStackException
     * if the stack is empty
     */

    public Command peek() throws EmptyStackException
    {
        if(count==0)
            throw new EmptyStackException("Nothing on the stack");

        Command remove= stack.get(count-1);

        return remove;

    }

    /**
     * The method helps to keep a count of number of commands in the stack
     * @return
     * number of commands in the specified stack
     */

    public int getCount() {
        return count;
    }

    /**
     * This method check whether the stack of command is empty or not
     * @return
     * boolean value determined on whether stack is empty or not
     */

    public boolean isEmpty()
    {
        if(count==0)
            return true;

        else
            return false;
    }

    /**
     * This method helps return message to be displayed on the screen for the current command
     * @return
     * Returns a String representation of the Command that will be displayed on the screen
     */
   public String getScreenCommand()
    {
        try {
           return "Current Screen: "+this.peek().toString();
        }

        catch (EmptyStackException e)
        {
            System.out.println(e.getMessage());
        }
        return null;

    }

    /**
     * The method helps return the stack trace
     * @return
     * Returns a String representation of the stack
     */

    public String toString()
    {
         String s="";

        for(int i=0; i<this.stack.size();i++) {

            s = s + this.stack.get(i).toShortString();
        }
        return s;
    }

}
