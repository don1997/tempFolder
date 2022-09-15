package activity1;

import java.util.Scanner;

public class StringProcessing {

	public static void main(String[] args) {

		System.out.print("Please enter a string with atleast two characters: ");
		
		//get user input
		Scanner keyboard = new Scanner(System.in);
        String myString = keyboard.nextLine();  
        
        String first, last, rest;
        
        //gets first element in string
        first = myString.substring(0,1);
        //gets last element in string
        last = myString.substring(myString.length() - 1);
        //gets everything else that is not the first or last element in string
        rest = myString.substring(1 , myString.lastIndexOf(last,myString.length()-1));
        
        System.out.println("\nFirst character is: " + first);	
        System.out.println("The rest is: " + rest);		
        System.out.println("Last character is: " + last);		

        //close input stream
        keyboard.close();
		
	}

}
