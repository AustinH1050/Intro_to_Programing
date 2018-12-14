/*
Author: Austin Haueter
Date: 11/30/2018
Ex_6_3
*/

import java.util.Scanner;

class Ex_6_3 {
	public static int reverse (int number){
		//Variables
		int reverse = 0;
		int remain = 0;
		
		//While Loop
		while (number != 0) {
			remain = number % 10;
			reverse = reverse * 10 + remain;		
			number = number /= 10;
					
		}
		//Reverse
		return reverse;
		
	}
	
	//Boolean
		public static boolean isPalindrome(int number) {
		boolean isPalindrome = false;
		int reverse = reverse(number);
		if (reverse == number) {
				isPalindrome = true;
		}		
		//Palindrone
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		//User input
		System.out.print("Enter a number: ");
		user = input.nextInt();
		
		//output
		System.out.println("Is " + user + " a palindrome? " + isPalindrome(user));
		System.out.println("Reverse Number is: " + reverse(user));
	}
}
