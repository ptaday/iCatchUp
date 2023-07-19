/**
 * @author Pushkar Taday
 */


import java.util.Scanner;

public class Safari extends Application {

    private CommandStack stack=new CommandStack();
    public Command command;
    char c;

    /**
     * This method is a mutator method which helps the switch case to run
     * @param c
     * char data type which acts a switch variable
     */
    @Override
    public void setCharacter(char c) {
      this.c=c;
    }

    /**
     * This method helps the command to be read and added into the stack
     * @param scanner
     * takes in scanner so that the user input can be instantly assigned to the member variable instantly when invoked
     * @throws InvalidCommandException
     * if the command is invalid for the given stack
     */

    @Override
    public void readCommand(Scanner scanner) throws InvalidCommandException{

        switch (c) {

            case 'G':
                command =new GoogleSomething(scanner);
                if(command.validCommand(stack)){
                    stack.push(command);}

                else
                    throw new InvalidCommandException("This command is invalid for given stack. ");
                break;

            case 'F':
                command=new GoToBookmark(scanner);
                if(command.validCommand(stack)) {
                    stack.push(command);
                }

                else
                    throw new InvalidCommandException("This command is invalid for given stack. ");
                break;


            case 'L':
                command =new FollowLink(scanner);
                if(command.validCommand(stack))
                {
                    stack.push(command);

                }
                else {
                    throw new InvalidCommandException("Cannot be the first command.");

                }
                break;

            default:

        }
    }

    /**
     * This method allows the user to go to the previous command
     * @throws EmptyStackException
     * if the stack is empty
     */

    @Override
    public void goBack() throws EmptyStackException{

        if(this.stack.isEmpty())
            throw new EmptyStackException("Cannot move back. You are on home screen.");

        else {
            this.stack.pop();
        }
    }

    /**
     * This method acts as an accessor method for stack
     * @return
     * the stack for safari
     */

    @Override
    public CommandStack getStack() {
        return stack;
    }
}
