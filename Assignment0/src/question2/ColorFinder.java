package question2;

import java.util.*;
public class ColorFinder {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence: ");

		//Get Input
		Scanner keyboard = new Scanner(System.in);
		String myString = keyboard.nextLine();
		
		//Use Regex to ignore case sensitivity (?i) and match patterns red|green|blue
		if(myString.matches("(?i)^.*(red|green|blue).*$")) {
			
			System.out.println("Additive primary color found.");
		
		//Use Regex to ignore case sensitivity (?i) and match patterns yellow|cyan|magenta
		}else if(myString.matches("(?i)^.*(yellow|cyan|magenta).*$")) {
			
			System.out.println("Subtractive primary color found.");
			
		//If other cases are exhausted
		}else {
			
			System.out.println("No primary color found.");
			
		}
		  
		keyboard.close();
		 
		
	}

}
