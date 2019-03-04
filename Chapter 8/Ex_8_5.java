/*
Author: Austin Haueter
Date: 2/26/2019
*/

import java.util.Scanner;

class Ex_8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oj [][] = new double[3][3];
		double aj [][] = new double[3][3];
		double[][] oreos = new double[3][3];
		
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for a row " + (row + 1) + " for Matix A: ");
			for (int col = 0; col <= 2; col++) {
				oj[row][col] = input.nextDouble();
			}
		}
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers" + (row + 1) + " for Matrix B: ");
			for (int col = 0; col <= 2; col++) {
				aj[row][col] = input.nextDouble();
			}
		}
		oreos = addMatrix(oj, aj);
		
		//Counts Rows
		for (int row = 0; row <=2; row++) {
			//Counts colums
			//Print for every table element
			//Counts rows
			for	(int col = 0; col < 3; col++) {
				//Print for Every table element
				System.out.print(oreos[row][col] + " "); 
			}
			//Print Last Item on Row
			System.out.println();
		}
		//Print After Table
	}
	
	public static double[][] addMatrix(double[][] a, double [][] b) {
		double[][] c = new double[3][3];
		
		for (int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[0].length; col++) {
				c[row][col] = a [row][col] + b[row][col];
			}
		}
		
		return c;
	}
}
