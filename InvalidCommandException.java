/**
 * @author Pushkar Taday
 */


/**
 * This class represents a customised exception which helps to handle exception when encountered.
 */
public class InvalidCommandException extends Exception {
    /**
     * This method is a parameterized constructor for this class.
     * @param str
     * string which is passed through the parameter
     */
    InvalidCommandException(String str)
    {
        super(str);
    }

}
