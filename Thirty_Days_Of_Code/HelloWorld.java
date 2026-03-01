package Thirty_Days_Of_Code;
import java.util.Scanner;
public class HelloWorld {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String inputString = scan.nextLine();
		scan.close(); 
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
	}
    
}
