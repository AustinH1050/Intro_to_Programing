/*
Author: Austin Haueter
Date: 11/19/2018
Ex_5_1
*/

import java.util.Scanner;
class Ex_5_1 {
	public static void main(String[] args) {
		
		//Scanner
		Scanner input = new Scanner (System.in);
		
		//Variables
		int negitive = 0;
		int positive = 0;
		int inputs = 0;
		int totalvar = 0;
		
		//Prompt
		System.out.print("Enter a Positive or negitive Number: ");
		inputs = input.nextInt();
				
		while (inputs != 0){
			if (inputs < 0){
				negitive += 1;
				
			} else {
				positive += 1;
			}	
				totalvar += inputs;
		
				//Prompting User Again
				System.out.print("Enter a Positive or Negitive Number (0 to quit): ");
				inputs = input.nextInt();
		} 	
			
		//Output
		System.out.println("Positive Numbers: " + positive);
		System.out.println("Negitive Numbers: " + negitive);
		System.out.println("The Total is:  " + totalvar);
	}
}
