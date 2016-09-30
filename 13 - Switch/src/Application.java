import java.util.Scanner;
 
public class Application {
 
    
	public static void main(String[] args) {
 	//Declaring the Scanner so that we can read in keystrokes from the user
        Scanner input = new Scanner(System.in);
 	//Asking user for a command
        System.out.println("Please enter a command: ");
	//Getting what the user type and storing it as text
        String text = input.nextLine();
 	//Checks text and begins go through the cases comparing if it is equal to one of the cases
        switch (text) {
        case "start":
            System.out.println("Machine started!");
            break;
 
        case "stop":
            System.out.println("Machine stopped.");
            break;
 	//If none of the cases are met then the default will happen
        default:
            System.out.println("Command not recognized");
        }
         
         
    }
 
}
