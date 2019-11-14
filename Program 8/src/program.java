// Project:		Program 8
// Author:		Shannon Mong
// GitHub:		Feldariia
// Description:	For class
// Date:		11Nov19
// Version:		1.0


//Import packages
import java.io.*;
import java.util.Scanner;

public class program {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			//Open output file 
			FileWriter fw = new FileWriter("/Users/shannonmong/Desktop/gradeStats.txt",true);
			PrintWriter outputFile = new PrintWriter(fw);

			//Open input file 
			File fr = new File("/Users/shannonmong/Desktop/grades.txt");
			Scanner inputFile = new Scanner(fr);

			//Declare Variables
			int totalGrades = 0;
			int gradeCounter = 0;


			//Loop through input file
			while (inputFile.hasNext()) 
			{
				int grade = inputFile.nextInt();
				totalGrades += grade;
				gradeCounter++;

			}

			//Output data to file
			outputFile.println("Grade Statistics");
			outputFile.println("================");
			outputFile.printf("Total Points:" + totalGrades);
			outputFile.printf("Number of Grades:" + gradeCounter);
			outputFile.printf("Average Score" + (totalGrades/gradeCounter));


			//Close files
			outputFile.close();
			inputFile.close();

		}
		catch (EOFException error)
		{
			System.out.println("Sorry. I seem to have reached the end of the file.");
			System.out.println("Error message: " + error.getMessage());
		}
		catch (FileNotFoundException error)
		{
			System.out.println("Sorry. I cannot seem to find that file.");
			System.out.println("Error Message:" + error.getMessage());

		}
	}
}
