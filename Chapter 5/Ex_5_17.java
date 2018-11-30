/*
Author: Austin Haueter
Date: 11/13/2018
Ex_5_11
*/

import java.util.Scanner;
class Ex_5_17{
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int user = 0;
		
		//prompt User
		System.out.print("Enter height of pyramid: ");
		user = Scan.nextInt();	
			
		//Re-prompt user if necessary
		while (user > 15 || user < 1){
			System.out.print("Enter height of pyramid (1 -15): ");
			user = Scan.nextInt();	
		}
		for (int count = 1; count <= user; count++){
			//Print Spaces
			for (int space = 1; space <= (user - count); space++){
				System.out.print("   ");
			}
			
			//Print Left Side
			for (int left = count; left >= 1; left--){
				System.out.printf("%3d", left);
			}
			
			//Print Right Side
			for (int right = 2; right <= count; right++){
				System.out.printf("%3d", right);
			}
			
			//End Row
			System.out.println();
		}
	}
}
