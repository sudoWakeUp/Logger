package ge.edu.sangu.giorgi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static final Logger myLogger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        myLogger.info("App started");

        DefaultError.set();

        ConsoleLogger logger = new ConsoleLogger();

        try {
            logger.debug(null);
        } catch (Exception e) {
            myLogger.error(e.getMessage());
        }

        try {
            logger.info("          ");
        } catch (Exception e){
            myLogger.error(e.getMessage());
        }

        logger.trace("This is an trace message");
        logger.debug("This is an debug message");
        logger.info("This is an info message");
        logger.warn("This is an warn message");
        logger.error("This is an error message");
        logger.fatal("This is an fatal message");

        System.out.println("THIS IS A MESSAGE FROM THE NEW FEATURE");

        myLogger.info("App ended");
    }
}