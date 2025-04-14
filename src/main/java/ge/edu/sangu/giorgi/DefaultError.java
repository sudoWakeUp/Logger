package ge.edu.sangu.giorgi;

import java.util.Scanner;

/**
 * This class provides the set() method for setting the default logging level
 */

public class DefaultError {

    /**
     * using <a href="https://www.w3schools.com/java/java_while_loop.asp">while loop</a> we will define default logging level
     * @see ConsoleLogger
     *
     * @author sudoWakeUp
     */

    public static void set(){
        while(true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("""
                        Enter default error type:
                        1) DEBUG
                        2) INFO
                        3) WARN
                        4) ERROR
                        5) FATAL""");
                ConsoleLogger.Types type = ConsoleLogger.Types.valueOf(scan.nextLine());
                ConsoleLogger.setDEFAULT(type);
                break;
            } catch (Exception e){
                System.out.println("Entered type doesn't exist");
            }
        }
    }
}
