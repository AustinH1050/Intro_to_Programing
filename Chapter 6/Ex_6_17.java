/*
Author: Austin Haueter
Date: 12/14/2018
Ex_6_17
*/


import java.util.Scanner;

class Ex_6_17 {
	
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Variables
		int n = 0;
		
		//Prompt
		System.out.print("Enter n: ");
		n = input.nextInt();

		//Matrix
		printMatrix(n);
	}

	
	public static void printMatrix(int n) {
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum ++) {
				
				//Display a random 0 or 1
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}

