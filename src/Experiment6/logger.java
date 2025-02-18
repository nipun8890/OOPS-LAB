package Experiment6;

public class logger {

}
//Final class Logger
class Logger {
 public void logMessage(String message) {
     System.out.println(message);
 }


//Attempting to extend the final class Logger - This will result in a compilation error
/*
class ExtendedLogger extends Logger {  // This will cause a compile-time error
 // ...
}
*/

//Main class to demonstrate the Logger class
 public static void main(String[] args) {
     Logger logger = new Logger();
     logger.logMessage("This is a sample log message.");


     //Demonstrating anonymous inner class (alternative if you *really* needed different behavior)
     //While you can't *extend* Logger, you *could* create a new class based on it.
     //This is more complex than usually necessary, but shows how you could get different behavior
     //without inheritance.
     Logger specializedLogger = new Logger(){
         public void logMessage(String message){
             System.out.println("Specialized Logging: " + message.toUpperCase());
         }
     };

     specializedLogger.logMessage("A special message");

 }
}