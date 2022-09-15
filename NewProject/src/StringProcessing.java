import java.util.Scanner;


public class StringProcessing {

	public static void main(String args[]){  

		System.out.println("Please enter a string: ");
		
		Scanner keyboard = new Scanner(System.in);
        
        String myString = keyboard.nextLine();  
        
        
        String first, last;
        
        first = myString.substring(0,1);
        
        last = myString.substring(3,3);
        
        
        System.out.println("Username is: " + first);
        
        
		
		
		
		
	}
	
}
