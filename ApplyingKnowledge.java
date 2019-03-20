package practiceProgram;
import java.util.*;
public class ApplyingKnowledge 
{
	public static void main(String args[])
	{
		
		Scanner userInput = new Scanner(System.in);
		CalculateStudent studentObject = new CalculateStudent();
		System.out.println("Enter the number of students in your class: ");
		while (!userInput.hasNextInt())
		{
			System.out.println("Error has occured!\n"
					+ "Enter a valid numeric value!");
			userInput.next();
		}
		int testOut = userInput.nextInt();
		int testCalculation = studentObject.averageGrade(testOut);
		System.out.println("Your average for your class of "+testOut+ " is: " + testCalculation);
		
		userInput.close();
	}

}
