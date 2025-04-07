package ge.edu.sangu.giorgi;

import java.time.LocalDateTime;

public class ConsoleLogger {

    public enum Types {
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL
    }

    private static Types DEFAULT = Types.INFO;

    public static Types getDEFAULT() {
        return DEFAULT;
    }

    public static void setDEFAULT(Types DEFAULT) {
        if (DEFAULT == null){
            throw new IllegalArgumentException("Logging level can't be null");
        }

        ConsoleLogger.DEFAULT = DEFAULT;
    }

    private void log(String message, Types logType){
        if(message == null || message.isBlank())
            throw new IllegalArgumentException("I can't log null or empty message ...");

        if (logType.ordinal() >= DEFAULT.ordinal()) {
            String time = String.valueOf(LocalDateTime.now());
            System.out.println("[" + time + "][" + logType + "]" + message);
        }
    }

    public void debug(String message){
        log(message, Types.DEBUG);
    }

    public void info(String message){
        log(message, Types.INFO);
    }

    public void warn(String message){
        log(message, Types.WARN);
    }

    public void error(String message){
        log(message, Types.ERROR);
    }

    public void fatal(String message){
        log(message, Types.FATAL);
    }
}
