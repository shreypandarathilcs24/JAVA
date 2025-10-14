import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject[] subject;

    // Constructor
    Student() {
        s = new Scanner(System.in);
        subject = new Subject[8];                                        
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    // Method to get student's name and USN
    void StudentDetails() {
        System.out.print("Student Name: ");
        name = s.nextLine();
        System.out.print("USN: ");
        usn = s.nextLine();
    }

    // Method to read marks and credits and calculate grades
    void Marks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter info for Subject " + (i + 1));
           
            // Input marks
            System.out.print("Marks: ");
            subject[i].subjectMarks = s.nextInt();
            while(subject[i].subjectMarks < 0 || subject[i].subjectMarks > 100) {
                System.out.println("Invalid marks, Enter between 0-100");
                System.out.print("Marks: ");
                subject[i].subjectMarks = s.nextInt();
            }

            // Input credits
            System.out.print("Credits: ");
            subject[i].credits = s.nextInt();
            while(subject[i].credits <= 0) {
                System.out.println("Please enter positive credits.");
                System.out.print("Credits: ");
                subject[i].credits = s.nextInt();
            }

            // Calculate grade based on marks
            subject[i].grade = (subject[i].subjectMarks / 10) + 1;

            if (subject[i].grade == 11)
                subject[i].grade = 10;

            if (subject[i].subjectMarks < 40)
                subject[i].grade = 0;
        }
    }

    // Calculate SGPA
    void SGPA() {
        int Score = 0;
        int totalCredits = 0;

        for (int i = 0; i < 8; i++) {
            Score += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }

        SGPA = (double) Score / (double) totalCredits;
    }

    // Display student details and SGPA
    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}

public class Details {
    public static void main(String[] args) {
        Student student[] = new Student[2];
        for (int i=0;i<2;i++)
        {
            student[i]=new Student();
            student[i].StudentDetails();
            student[i].Marks();
            student[i].SGPA();
            student[i].display();
        }
        
    }
}