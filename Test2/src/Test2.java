import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.print("Please enter a string with atleast two characters: ");
		
		Scanner keyboard = new Scanner(System.in);
        
        String myString = keyboard.nextLine();  
        
        String first, last, rest;
        
        first = myString.substring(0,1);
        
        last = myString.substring(myString.length() - 1);
        
        rest = myString.substring(1 , myString.lastIndexOf(last,myString.length()-1));
        
        System.out.println("\nFirst character is: " + first);	
        System.out.println("The rest is: " + rest);		
        System.out.println("Last character is: " + last);		

        //close input stream
        keyboard.close();
		
		
		
		
	}

}
