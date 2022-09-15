import java.util.Scanner;

public class SentenceProcessor {

	public static void main(String[] args) {

	//get user input string
	
	Scanner keyboard = new Scanner(System.in);
    String myString = keyboard.nextLine();  
		
    
    String last = myString.substring(myString.length() - 1);

    
	//output one of response
	//if end in ? and sentence is even chars OUTPUT thats an even question
	//if end in ? and odd chars OUTPUT thats an odd question
	//If end in  ! OUTPUT to the screen Wow!
	//if Sentence ends in , OUTPUT More to come!
	//fOR ALL OTHER CASES OUTPUT "you always say" followed by the sentenced entered by the user
	//
	//
    //CLOSE input stream.
  	keyboard.close();
	}
}
