import java.util.Scanner;

public class Testif {

	public static void main(String[] args) {
	     
		 int far;

		 System.out.println("Enter a temperature in farenheit: ");

	     Scanner keyboard = new Scanner(System.in);
	     far = keyboard.nextInt();
	    
	     double celsius = ((double)far - 32) * (5.0 / 9.0) ;
	    
	     System.out.println("The temperature from farenheit to celsius is " + celsius);
		
	     //close input stream
	     keyboard.close();
	}
}
