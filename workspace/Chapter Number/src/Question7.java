import java.util.Scanner;

public class Question7 {
/**
 * Algorithm:
 * 1. Prompt the user student ID
 * 2. Read and calculate student ID
 * 3. If student ID is odd, out put chapter 1 -> ! (studentID%2==0) or (studentID%2==0)
 * 4. If student ID is even, out put chapter 2 -> ! (studentID%2==0)
 * 5. If the chapter number is 1, divide your student ID by 10, consider the remainder and increment by 1, out put the problem number 
 * 6. If the chapter number is 2, divide your student ID by 11, consider the remainder and increment by 1
 */
	public static void main(String [] args)
	{
		int workingChapter = 0;
		int exerciseNumber = 0;
		
		Scanner keyboard = new Scanner(System.in);
		int studentID;
		System.out.println("What is your student ID?");
		studentID = keyboard.nextInt();
		
		if(studentID % 2 == 1)
		{
			workingChapter = 1;
		}
		else
		{
			workingChapter = 2;
		}
		
		if(workingChapter == 1)
		{
			exerciseNumber = studentID % 10 + 1;
		}
		else if(workingChapter == 2)
		{
			exerciseNumber = studentID % 11 + 1;
		}
		
		System.out.println("You will work on Chapter " + workingChapter + " exercise #" + exerciseNumber);
	 }
	
}
public class Question7 {

}
