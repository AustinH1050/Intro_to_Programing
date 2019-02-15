/*
Author: Austin Hueter
Date: 2/07/19
*/
import java.util.Scanner;

class Ex_7_9 {
	public static void main(String[] args) {
		//Scanner / Array
		Scanner input = new Scanner (System.in);
		double[] cookie = new double[10];
		
		//Array Elements
		System.out.print("Enter 1 double values: ");
		for (int index = 0; index < 10; index++){
			cookie[index] = input.nextDouble();
		}
		
		//Call min Method  / Display
		System.out.println("The mnimum element is " + min(cookie));
	}

	public static double min(double[] array){
		double min = array[0];
		
		//Search the Array
		for (int i = 1; i < 10; i++){
			if (array[i] < min){
				min = array[i];
			}
		}
		
		//Return min
		return min;
	}
}
