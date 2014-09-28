package SumAverage;

import java.util.Scanner;
/**
 * Purpose: Sum and average of five numbers
 * Author: Laura Garcia 
 * Date: September 22 / 2014
 *    prompt enter five numbers 
 *    find the sum of the five numbers and the average of the numbers
 *    display the results below 
 */

public class SumAverage {

	static int[] num = new int [5];
	static int sum =0;
	static int average;
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		

		System.out.println(" Enter 5 numbrers; ");
		for (int n=0; n<num.length; n++) 
		{
	
			num[n] = keyboard.nextInt();
		}

		sum = sum();
		average = sum/5;

		System.out.println (("Sum = ") +(sum));
		System.out.println (("Average = ") +(average));

	}

public static int sum()
{

	for(int n=0; n<num.length; n++)
	{ 
		sum =  sum + num[n];
	}
		return sum;
}

}