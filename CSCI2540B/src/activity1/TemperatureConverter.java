package activity1;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		 int fahrenheit;
		 
		 System.out.print("Enter a temperature in fahrenheit: ");
		 
		 //get user input
	     Scanner keyboard = new Scanner(System.in);
	     fahrenheit = keyboard.nextInt();
	    
	     //convert fahr to celsius
	     double celsius = ((double)fahrenheit - 32) * (5.0 / 9.0) ;
	    
	     //round off after 2 decimal places
	     System.out.printf("The temperature converted from fahrenheit to celsius is: %.2f" , celsius);

	     //close input stream
	     keyboard.close();
	}

}
