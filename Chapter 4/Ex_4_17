/*
Author: Austin Haueter
Date: 10/26/2018
*/

import java.util.Scanner;

class Ex_4_17 {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner (System.in);
		
		//Year
		System.out.print("Enter a Year: ");
		int year = input.nextInt();
		
		//Month
		System.out.print("Enter a Month, only 3 letters, Please Uppercase the First Letter: ");
		String month = input.next();
		
		if ((month.equalsIgnoreCase("Jan")) || (month.equalsIgnoreCase("Mar")) || (month.equalsIgnoreCase("May"))  || (month.equalsIgnoreCase("Jul")) || (month.equalsIgnoreCase("Aug")) || (month.equalsIgnoreCase("Oct")) || (month.equalsIgnoreCase("Dec"))) {	
		System.out.print("That month only has 31 Days");
		}
		
		else if ((month.equalsIgnoreCase("Apr")) && (month.equalsIgnoreCase("Jun")) &&(month.equalsIgnoreCase("Sep")) && (month.equalsIgnoreCase("Nov"))) {
				System.out.print("That month has 30 Days");
		}		
		else if (month.equalsIgnoreCase("Feb")){
			boolean isLeapYear =(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear == true){
				System.out.print("That Month has 29 Days");
            }
              else {
                  System.out.print("That month has 28 days");
              }
        }else {		
           System.out.print("Sorry Friend This Month is Not a Real Month");
		}
	}
}
