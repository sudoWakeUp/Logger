package ge.edu.sangu.giorgi;

import java.time.LocalDateTime;

/**
 * This class provides methods for logging
 *
 * @author sudoWakeUp
 */

public class ConsoleLogger {

    /**
     * Enum contains logging level types
     *
     * @author sudoWakeUp
     */

    public enum Types {
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
        if (DEFAULT == null){
            throw new IllegalArgumentException("Logging level can't be null");
        }

        ConsoleLogger.DEFAULT = DEFAULT;
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
            throw new IllegalArgumentException("I can't log null or empty message ...");

        if (logType.ordinal() >= DEFAULT.ordinal()) {
            String time = String.valueOf(LocalDateTime.now());
            System.out.println("[" + time + "][" + logType + "]" + message);
        }
    }

    /**
     * method logs debug message
     *
     * @param message message to log
     */

    public void debug(String message){
        log(message, Types.DEBUG);
    }

    /**
     * method logs info message
     *
     * @param message message to log
     */

    public void info(String message){
        log(message, Types.INFO);
    }

    /**
     * method logs warn message
     *
     * @param message message to log
     */

    public void warn(String message){
        log(message, Types.WARN);
    }

    /**
     * method logs error message
     *
     * @param message message to log
     */

    public void error(String message){
        log(message, Types.ERROR);
    }

    /**
     * method logs fatal message
     *
     * @param message message to log
     */

    public void fatal(String message){
        log(message, Types.FATAL);
    }
}
