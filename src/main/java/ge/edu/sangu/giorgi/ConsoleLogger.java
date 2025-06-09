package ge.edu.sangu.giorgi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

/**
 * This class provides methods for logging
 *
 * @author sudoWakeUp
 */

public class ConsoleLogger {

    private static final Logger myLogger = LogManager.getLogger(ConsoleLogger.class);

    /**
     * Enum contains logging level types
     *
     * @author sudoWakeUp
     */

    public enum Types {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL
    }

    /**
     * Default logging level is INFO
     */
    private static Types DEFAULT = Types.INFO;

    /**
     * method returns default logging level
     *
     * @return default logging level
     */
    public static Types getDEFAULT() {
        return DEFAULT;
    }

    /**
     * method sets default logging level
     *
     * @param DEFAULT default logging level to set
     * @throws IllegalArgumentException if logging level is null
     */
    public static void setDEFAULT(Types DEFAULT) {
        myLogger.debug("setDEFAULT() called");
        if (DEFAULT == null){
            myLogger.error("Logging level can't be null");
        }

        ConsoleLogger.DEFAULT = DEFAULT;
        myLogger.debug("Default level set to {}", DEFAULT);
    }

    /**
     * method logs a message
     *
     * @param message
     *          message to print
     * @param logType
     *          defines type of log message [info, error...]
     * @throws IllegalArgumentException
     *          if message is null or blank
     */
    private void log(String message, Types logType){
        if(message == null || message.isBlank())
            myLogger.error("Message is null or blank!!!");

        if (logType.ordinal() >= DEFAULT.ordinal()) {
            String time = String.valueOf(LocalDateTime.now());
            System.out.println("[" + time + "][" + logType + "]" + message);
        }
    }

    /**
     * method logs trace message
     *
     * @param message message to log
     */
    public void trace(String message){
        myLogger.trace("trace() called with message: {}", message);
        log(message, Types.TRACE);
    }

    /**
     * method logs debug message
     *
     * @param message message to log
     */
    public void debug(String message){
        myLogger.debug("debug() called with message: {}", message);
        log(message, Types.DEBUG);
    }

    /**
     * method logs info message
     *
     * @param message message to log
     */

    public void info(String message){
        myLogger.debug("info() called with message: {}", message);
        log(message, Types.INFO);
    }

    /**
     * method logs warn message
     *
     * @param message message to log
     */

    public void warn(String message){
        myLogger.debug("warn() called with message: {}", message);
        log(message, Types.WARN);
    }

    /**
     * method logs error message
     *
     * @param message message to log
     */

    public void error(String message){
        myLogger.debug("error() called with message: {}", message);
        log(message, Types.ERROR);
    }

    /**
     * method logs fatal message
     *
     * @param message message to log
     */

    public void fatal(String message){
        myLogger.debug("fatal() called with message: {}", message);
        log(message, Types.FATAL);
    }
}
