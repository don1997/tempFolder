package activity2;

import java.util.Scanner;

public class Triangle {

	//prints line of *
    static void printLine(int param){
    	
    	//Displays Line
        for(int i = 0; i < param; i++){
        	System.out.print("*");
        }
        
        System.out.print("\n");
    }

    //Tells printLine() how many * to print out
    static void printTriangle(int param){
      
    	//store original value
        int orig = param;
       
        //Gets Top half
        for(int i = param; i > 0; i--){
            printLine(param-i);
        }

        //gets middle and bottom half
        for(int j = 0; j < orig; j++){
            printLine(orig-j);
        }
    
    }

    public static void main(String[] args){
        
        System.out.println("Enter size of Triangle: ");
        
        //get input
        Scanner keyboard = new Scanner(System.in);
        int myInt = keyboard.nextInt();

        printTriangle(myInt);
        
        //Close input stream
        keyboard.close();
    }
	
}
