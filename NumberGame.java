import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

        // Step 2: Take marks input and validate
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = input.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                marks[i] = input.nextInt();
            }

            total += marks[i];
        }

        // Step 3: Calculate average
        double average = (double) total / numSubjects;

        // Step 4: Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 5: Display results
        System.out.println("\n----- STUDENT REPORT -----");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Total Marks      : " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade            : " + grade);

        input.close();
    }
}