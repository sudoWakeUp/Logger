package ge.edu.sangu.giorgi;

import java.util.Scanner;

public class DefaultError {

    public static void set(){
        while(true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("""
                        Enter default error type:
                        1) DEBUG
                        2) INFO
                        3) ERROR""");
                ConsoleLogger.Types type = ConsoleLogger.Types.valueOf(scan.nextLine());
                ConsoleLogger.setDEFAULT(type);
                break;
            } catch (Exception e){
                System.out.println("Entered type doesn't exist");
            }
        }
    }
}
