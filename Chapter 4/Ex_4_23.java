/*
Author: Austin Haueter
Date: 10/24/2018
*/

import java.util.Scanner;
class Ex_4_23 {
	public static void main(String[] args) {
	//Scanner
	Scanner input = new Scanner (System.in); 
        
        //variables
        String empname = "";
        double grosspay = 0.0;
        double hrsWorked = 0.0;
        double hpr = 0.0;        
        double statax = 0.0;
        double grossPay = 0.0;        
        double fedtax = 0.0;
        double netpay = 0.0;
        double temp = 0.0;
        double stawit = 0.0;
        double totded = 0.0;
        
        //Math
        stawit = Math.round(stawit * 100D) / 100D;
        totded = Math.round(totded * 100D) / 100D;
        netpay = Math.round(netpay * 100D) / 100D;
        //Name
        System.out.print("Enter Employee's Name: ");
        empname = input.next();
        
        //Number of Hours
        System.out.print("Enter your Number of Hours: ");
        hrsWorked = input.nextDouble();
        
        //Hourly Wage
        System.out.print("Enter your Hourly Wage: ");
        hpr = input.nextDouble();
        
        //Federal Tax Withholding
        System.out.print("Enter Federal Tax Withholding: ");
        fedtax = input.nextDouble();
        
        //State Tax Withholding
        System.out.print("Enter State tax withholding: ");
        statax = input.nextDouble();
        
        //Final Step 
        System.out.println();
        System.out.println("Employee's Name: " + empname);
        System.out.println("Hours Worked: " + hrsWorked);
        System.out.println("Payrate: " + hpr);
        grosspay = hpr * hrsWorked;
        System.out.println("Grosspay: $" + grosspay);
        
        //Withholdings
        System.out.println("Deductions: ");
        System.out.print("        Federal Withholding: (" + (fedtax * 100) + " %): " + netpay);
        System.out.print("        State Withholding: (" + (statax * 100) + "%): " + stawit);
        System.out.println("        Total Deduction: $" + totded);
        System.out.println("Net Pay: " + netpay);
	}
}
