/*
Author: Austin Haueter
Date: 11/13/2018
Ex_5_11
*/

import java.util.Scanner;

class Ex_5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int linenumb = 0;
		int num = 100;
		while(num<=200){
			if (num% 5 == 0 ^ num% 6 == 0){
				
				linenumb += 1;
				if (linenumb == 10){
					System.out.println(num + " ");
					linenumb = 0;
				} else {
				System.out.print(num + " "); 
				}
				
			} 
			
		num++;

		}	
}}
