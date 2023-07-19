/**
 * @author Pushkar Taday
 */


/**
 * This class represents a customised exception which helps to handle exception when encountered.
 */

public class EmptyStackException extends Exception {
    /**
     * This method is a parameterized constructor for this class.
     * @param str
     * string which is passed through the parameter
     */

    EmptyStackException(String str)
    {
        super(str);
    }
}
