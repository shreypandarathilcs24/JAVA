package PROJECT;

import java.util.Scanner;

import CIE.Student;
import CIE.Internal;
import SEE.External;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] personalData = new Student[n];
        Internal[] internalMarks = new Internal[n];
        External[] externalMarks = new External[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            personalData[i] = new Student(usn, name, sem);

            System.out.println("Enter 5 Internal marks:");
            int[] internals = new int[5];
            for (int j = 0; j < 5; j++) {
                internals[j] = sc.nextInt();
            }
            internalMarks[i] = new Internal(internals);

            // External SEE marks
            System.out.println("Enter 5 SEE marks:");
            int[] see = new int[5];
            for (int j = 0; j < 5; j++) {
                see[j] = sc.nextInt();
            }
            externalMarks[i] = new External(usn, name, sem, see);
        }

        // Display final results
        System.out.println("\nFinal Marks of Students:");

        for (int i = 0; i < n; i++) {

            System.out.println("\nUSN: " + personalData[i].usn +
                    ", Name: " + personalData[i].name +
                    ", Semester: " + personalData[i].sem);

            for (int j = 0; j < 5; j++) {

                int finalMark = internalMarks[i].marks[j] + externalMarks[i].seeMarks[j];

                System.out.println("Course " + (j + 1) + " Final Marks: " + finalMark);
            }
        }

        sc.close();
    }
}
