/**
 * @author Pushkar Taday
 */


import java.util.Scanner;

public class Maps extends Application {

    private CommandStack stack=new CommandStack();
    private Command command;
    private char c;

    /**
     * This method is a mutator method which helps the switch case to run
     * @param c
     * char data type which acts a switch variable
     */

    @Override
    public void setCharacter(char c)
    {
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

                case 'F':
                    command =new FindPlace(scanner);
                    if(command.validCommand(stack)){
                        stack.push(command);}

                    else
                        throw new InvalidCommandException("This command is invalid for given stack. ");


                    break;

                case 'P':
                    command=new PlanRoute(scanner);
                    if(command.validCommand(stack)) {
                        stack.push(command);
                    }

                    else
                        throw new InvalidCommandException("This command is invalid for given stack. ");


                    break;


                case 'N':
                    command =new StartNavigation(stack);
                    if(command.validCommand(stack))
                    {
                        stack.push(command);

                    }
                    else {
                        throw new InvalidCommandException("No route or destination!\n");
                    }
                    break;
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
     * the stack for maps
     */
    @Override
    public CommandStack getStack() {
        return stack;
    }
}
