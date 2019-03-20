package practiceProgram;

import java.util.Scanner;

public class CalculateStudent 
{
	public int averageGrade(int get)
	{
		Scanner getGrades = new Scanner(System.in);
		
		int grades;
		int classSize;
		int average;
		int counter = 0;
		int total = 0;
		classSize = get;
		System.out.println("Enter the score of each student");
		
		while(counter < classSize)
		{
			
			while (!getGrades.hasNextInt())
			{
				System.out.println("Error has occured!\n"
					+ "Enter a valid numeric value!");
				getGrades.next();
			}
			grades = getGrades.nextInt();
			total = total + grades;
			counter++;
		}
		average = total/classSize;
		getGrades.close();
		return average;
	}

}

