package student_grade;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        try (// Create a scanner object to read user input
		Scanner scanner = new Scanner(System.in)) {
			// Prompt the user to enter the number of subjects
			System.out.println("Enter the number of subjects: ");
			int numberOfSubjects = scanner.nextInt();

			// Create an array to store the student's marks
			int[] marks = new int[numberOfSubjects];

			// Prompt the user to enter their marks
			for (int i = 0; i < marks.length; i++) {
			    System.out.println("Enter your marks in subject " + (i + 1) + ": ");
			    marks[i] = scanner.nextInt();
			}

			// Calculate the total marks
			int totalMarks = 0;
			for (int i = 0; i < marks.length; i++) {
			    totalMarks += marks[i];
			}

			// Calculate the average percentage
			double averagePercentage = (double) totalMarks / marks.length * 100;

			// Assign a grade based on the average percentage
			String grade;
			if (averagePercentage >= 90) {
			    grade = "A";
			} else if (averagePercentage >= 80) {
			    grade = "B";
			} else if (averagePercentage >= 70) {
			    grade = "C";
			} else if (averagePercentage >= 60) {
			    grade = "D";
			} else {
			    grade = "F";
			}

			// Display the results
			System.out.println("Total Marks: " + totalMarks);
			System.out.println("Average Percentage: " + averagePercentage);
			System.out.println("Grade: " + grade);
		}
    }
}
