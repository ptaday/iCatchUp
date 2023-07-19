/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework3;

import java.util.Scanner;

/**
 * This methods represents a screen which allows commands to be executed and displayed.
 */

public class iCatchUp {

    public static Application maps=new Maps();
    public static Application safari=new Safari();
    public static Application application;


    static String currentPrint="Current Screen:";//to print current command for maps
    static String stackPrint="";//for printing stack for maps
    static String currentPrintS="Current Screen:";//to print current command for safari
    static String stackPrintS="";//to print current command for safari
    static char  select;
    static boolean flag=true;//in case you want to switch from maps to safari or vice versa

    /**
     * This method represents a main methods which gets executed and runs the menu driven program
     *
     * @param args
     * String arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean check=true;//to check the outer menu loop
        boolean mapsCheck; //to check the maps loop
        boolean safariCheck;//to check the safari loop
        int mapCounter=0; // to print the first instance in the map
        int safariCounter=0;// to print the first instance in the safari
        boolean mapsFlag=false; //in case you want to switch from maps to safari
        boolean safariFlag=false;//in  case you want to switch from safari to maps

        System.out.println("Welcome to the iPhony pocket telegraph simulator. You are on the home screen.");

        while(check) {
            try {
                if(flag==true) {


                    System.out.println("\n" +
                            "Home Options:\n" +
                            "\n" +
                            "    S) Safari\n" +
                            "\n" +
                            "    M) Maps\n" +
                            "\n" +
                            "    Q) Quit");

                    System.out.print("Please select an option:");

                    select = input.next().charAt(0);

                    select = Character.toUpperCase(select);
                }
                else
                {
                    if(mapsFlag==true&&safariFlag==false){
                        select='S';
                        flag=true;}

                    else if (mapsFlag==false&&safariFlag==true) {
                        select = 'M';
                        flag = true;
                    }

                    else {
                        select = 'Q';
                        flag=true;
                    }
                }


                if (select == 'S') {
                    application = safari;

                    if (safariCounter == 0) {
                        currentPrintS = currentPrintS + " Safari Home";
                        stackPrintS = stackPrintS + "Stack Debug: \n[Home->SafariHome";
                        System.out.println(stackPrintS);
                        System.out.println(currentPrintS);
                        safariCounter= 1;

                    }
                    else {
                        System.out.println(stackPrintS+application.getStack().toString());
                        System.out.println(application.getStack().getScreenCommand());
                    }

                    safariCheck = true;

                    while (safariCheck) {
                        System.out.println("Safari Options:\n" +
                                "\n" +
                                "     G) Google Something\n" +
                                "\n" +
                                "     F) Go to a favorite (bookmark)\n" +
                                "\n" +
                                "     L) Follow a link\n" +
                                "\n" +
                                "     H) Home Screen\n" +
                                "\n" +
                                "     S) Switch to Maps\n" +
                                "\n" +
                                "     B) Back");

                        System.out.print("Please select an option:");
                        char c = input.next().charAt(0);
                        System.out.println();
                        c = Character.toUpperCase(c);

                        switch (c) {

                            case 'G':
                                System.out.print("Please enter a query:");
                                application.setCharacter(c);
                                application.readCommand(input);
                                System.out.println(stackPrintS+application.getStack().toString());
                                System.out.println(application.getStack().getScreenCommand());

                                break;

                            case 'F':
                                System.out.print("Please enter bookmark page:");
                                application.setCharacter(c);
                                application.readCommand(input);
                                System.out.println(stackPrintS+application.getStack().toString());
                                System.out.println(application.getStack().getScreenCommand());

                                break;

                            case 'L':
                                try {
                                    System.out.print("Please enter a link:");
                                    application.setCharacter(c);
                                    application.readCommand(input);
                                    System.out.println(stackPrintS + application.getStack().toString());
                                    System.out.println(application.getStack().getScreenCommand());
                                }
                                catch(InvalidCommandException e)
                                {
                                    System.out.println(e.getMessage())  ;

                                    System.out.println(stackPrintS + application.getStack().toString());

                                    if (application.getStack().isEmpty())
                                        System.out.println(currentPrintS);

                                    else
                                        System.out.println(application.getStack().getScreenCommand());
                                }

                                break;

                            case 'H':
                                safariCheck = false;
                                break;

                            case 'S':
                                application = maps;
                                safariCheck = false;
                                safariFlag=true;
                                mapsFlag=false;
                                flag=false;
                                break;

                            case 'B':
                                application.goBack();
                                System.out.println(stackPrintS+application.getStack().toString());
                                if(application.getStack().isEmpty())
                                    System.out.println(currentPrintS);

                                else
                                    System.out.println(application.getStack().getScreenCommand());
                                break;
                        }
                    }
                }

                else if (select == 'M') {
                    application = maps;


                    if (mapCounter == 0) {
                        currentPrint = currentPrint + " Maps Home";
                        stackPrint = stackPrint + "Stack Debug: \n[Home->MapsHome";
                        System.out.println(stackPrint);
                        System.out.println(currentPrint);
                        mapCounter = 1;

                    }
                    else {
                        System.out.println(stackPrint+application.getStack().toString());
                        System.out.println(application.getStack().getScreenCommand());
                    }

                    mapsCheck = true;

                    while (mapsCheck) {
                        System.out.println("Maps Options:\n" +
                                "\n" +
                                "     F) Find a place\n" +
                                "\n" +
                                "     P) Plan a route\n" +
                                "\n" +
                                "     N) Start Navigation\n" +
                                "\n" +
                                "     H) Home Screen\n" +
                                "\n" +
                                "     S) Switch to Safari\n" +
                                "\n" +
                                "     B) Back");

                        System.out.print("Please select an option:");
                        char c = input.next().charAt(0);
                        System.out.println();
                        c = Character.toUpperCase(c);

                        switch (c) {

                            case 'F':
                                System.out.print("Please enter the location:");
                                application.setCharacter(c);
                                application.readCommand(input);
                                System.out.println(stackPrint+application.getStack().toString());
                                System.out.println(application.getStack().getScreenCommand());

                                break;

                            case 'P':

                            case 'N':
                                try {
                                    application.setCharacter(c);
                                    application.readCommand(input);
                                    System.out.println(stackPrint + application.getStack().toString());
                                    System.out.println(application.getStack().getScreenCommand());
                                }
                                catch(InvalidCommandException e)
                                {

                                        System.out.println(stackPrint + application.getStack().toString());

                                        if (application.getStack().isEmpty())
                                            System.out.println(currentPrint);

                                        else
                                            System.out.println(application.getStack().getScreenCommand());
                                    }
                                break;

                            case 'H':
                                mapsCheck = false;
                                break;

                            case 'S':
                                application = safari;
                                mapsCheck = false;
                                mapsFlag=true;
                                safariFlag=false;
                                flag=false;
                                break;

                            case 'B':
                                application.goBack();
                                System.out.println(stackPrint+application.getStack().toString());
                                if(application.getStack().isEmpty())
                                    System.out.println(currentPrint);

                                else
                                System.out.println(application.getStack().getScreenCommand());
                                break;
                        }
                    }
                }

                else if(select == 'Q')
                {
                    System.out.println("Sorry to see you go, tell the iPod I said hi!");
                    check=false;
                }

                else {
                    System.out.println("Wrong input entered.Entire wisely.");
                }
            }
            catch(InvalidCommandException e)
            {
                System.out.println(e.getMessage());
            }
            catch(EmptyStackException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
