package question01;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {

		/*	Generate secret number */
		int secret;
		Random generator = new Random();
		secret = generator.nextInt(10);
				
		System.out.println("Enter a number: ");
		
		/*	Get input	*/
		Scanner keyboard = new Scanner(System.in);
		int myInput = keyboard.nextInt();
		
		
		int tries = 1;
		
		/*	Compares input to see if match. Terminates loop upon match	*/
		while(myInput != secret) {
		
			tries++;
			
			if(myInput > secret) {
				System.out.println("Above");
			}else if(myInput < secret) {
				System.out.println("Below");
			}
			
			myInput = keyboard.nextInt();

		}
		
		System.out.println("You found it! The secret was " + secret + " You entered: " + myInput);
		System.out.println("It took: " + tries + " tries.");
		keyboard.close();
		
	}

}
