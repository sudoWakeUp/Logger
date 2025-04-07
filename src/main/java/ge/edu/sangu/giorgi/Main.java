package ge.edu.sangu.giorgi;

public class Main {
    public static void main(String[] args) {
        DefaultError.set();

        ConsoleLogger logger = new ConsoleLogger();

        try {
            logger.debug(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            logger.info("          ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            throw new RuntimeException("RUNTIME ERROR HERE");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        logger.debug("This is an debug message");
        logger.info("This is an info message");
        logger.error("This is an warn message");
        logger.error("This is an error message");
        logger.error("This is an fatal message");
    }
}