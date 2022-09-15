package activity2;

import java.util.Scanner;

public class SentenceProcessor {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a string: ");
		
		//Get input
		Scanner keyboard = new Scanner(System.in);
	    String myString = keyboard.nextLine();  
		
	    //Get last char in string
	    String token = myString.substring(myString.length() - 1);

	    //Analyzes token 
	    switch(token){
	        case "?" :
	            
	            //if EVEN
	            if(myString.length() % 2 == 0){
	            System.out.println("That is an even question.");
	            
	            //If ODD
	            }else {
	                System.out.println("That is an odd question.");
	            }
	            break;
	        
	        case "!": 
	            System.out.println("Wow!");
	            break;
	        
	        case ",": 
	            System.out.println("More to come!");
	            break;
	        
	        default:
	            System.out.println("You always say, " + '"' + myString + '"'); 
	            break;
	    }

	    //Close input stream.
	  	keyboard.close();
		}
}
