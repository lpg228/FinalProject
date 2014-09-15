import java.util.Scanner;
/**
 * 1.Enter the radius of the well in inches and the the depth of the well in feet 
 * 2.The program should out put the number of gallons stored in the well casing
 * 3.The volume of a cylinder is PI * radius * radius *depth * 7.48
 */
public class Question {	
	public static void main(String[] args) 
	{
		double radius; // inches 
		double depth; // feet 
		double volume;// gallons
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter radius in inches");
		radius = keyboard.nextDouble();
		System.out.println("Enter depth in feet");
		depth = keyboard.nextDouble();
		
		radius = radius / 12;
		volume = Math.PI * radius * radius * depth * 7.48;
		
		System.out.println("The volume of the well is " + volume + " gallons");
	}
} 
