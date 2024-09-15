//CODTECH IT SOLUTION PROJECT TASK
import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        // save student name form user
        System.out.println("Enter Student Name:");
        String studentName = Scan.nextLine();

        // Enter total number of subject to calculate their marks
        System.out.println("Enter the Total number of subject");
        int numSubjects = Scan.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject" + i + "(out of 100):");
            int marks = Scan.nextInt();
            // input validation
            while (marks < 0 || marks > 100) {
                System.out.println("Invaild marks please enter marks between 0 & 100.");
                System.out.println("Enter marks for subject" + i + "out of 100");
                marks = Scan.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("student result:");
        // saved student name print status:
        System.out.println("StudentName:" + studentName);
        System.out.println("Total marks obtained in all subject:" + totalMarks);
        // calculate Average Percentage:divide the total marks by the total number
        // of subject to get the average percentage.
        int AveragePercentage = totalMarks / numSubjects;
        System.out.println("Average Percentage:" + AveragePercentage);
        // garde calculation:Assign Grade based on the Average percentage achieved.
        if (AveragePercentage >= 90) {
            System.out.println("Your Grade:A+");
        } else if (AveragePercentage >= 80) {
            System.out.println("Your Grade:B+");
        } else if (AveragePercentage >= 70) {
            System.out.println("Your Grade:C+");
        } else if (AveragePercentage >= 60) {
            System.out.println("Your Grade:C");
        } else if (AveragePercentage >= 50) {
            System.out.println("Your Grade:D");
        } else if (AveragePercentage <= 50) {
            System.out.println("your are Fail");
        }
        Scan.close();

    }
}
