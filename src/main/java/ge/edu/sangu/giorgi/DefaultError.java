package ge.edu.sangu.giorgi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * This class provides the set() method for setting the default logging level
 */

public class DefaultError {

    private static final Logger myLogger = LogManager.getLogger(DefaultError.class);
    /**
     * using <a href="https://www.w3schools.com/java/java_while_loop.asp">while loop</a> we will define default logging level
     * @see ConsoleLogger
     *
     * @author sudoWakeUp
     */

    public static void set(){
        myLogger.debug("set() called");
        while(true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("""
                        Enter default error type:
                        1) TRACE
                        2) DEBUG
                        3) INFO
                        4) WARN
                        5) ERROR
                        6) FATAL""");
                ConsoleLogger.Types type = ConsoleLogger.Types.valueOf(scan.nextLine());
                ConsoleLogger.setDEFAULT(type);
                break;
            } catch (Exception e){
                myLogger.error("Entered type doesn't exist");
            }
        }
    }
}
