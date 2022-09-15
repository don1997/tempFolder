package Question3;

import java.util.*;

public class CountFamilies {

	//Gets the maximum value of array
	static int max(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	//Calculates 10 percent of the max value of array
	//Displays values that are below 10 percent of max
	//Returns number of values that are below 10 percent of max
	static int lessThanTen(int[] arr) {
		
		//stores max num
		int maxNum = max(arr);
		
		//gets ten percent
		int percent = (int)((maxNum * 0.1f));

		int numOfFam = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < percent) {
				System.out.println(arr[i]);
				numOfFam++;
			}
		}
		
		
		return numOfFam;

	}
	
	public static void main(String[] args) {

		int[] arr;
		
		System.out.print("Please enter the number of families: ");
		
		//Get input
		Scanner keyboard = new Scanner(System.in);
		int myInt = keyboard.nextInt();
		
		//Create array
		arr = new int[myInt];
		
		//Input Incomes
		for(int i = 0; i < arr.length; i++) {

			System.out.print("Enter an income: ");
			
			arr[i] = keyboard.nextInt();			
		}
		
		System.out.println("\nThe maximum income is: " + max(arr) + "\n");
		System.out.println("The incomes of families making less than 10% of the maximum are: ");
		System.out.println("for a total of "+ lessThanTen(arr) + " families.");
		
		keyboard.close();
	}

}
