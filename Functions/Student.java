import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Student_Detail();
            students[i].readDetails();
        }

        System.out.println("\nDetails of all students:");
        for (int i = 0; i < students.length; i++) {
            students[i].printDetails();
        }

        sc.close();
    }
}

class Student_Detail{
    int Enrollment_No; 
    String Name;
    int Semester;
    double CPI; 

    public void readDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment No: ");
        Enrollment_No = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Semester: ");
        Semester = sc.nextInt();

        System.out.print("Enter CPI: ");
        CPI = sc.nextDouble();

        
    sc.close();
    }

    public void printDetails(){
        System.out.println("\nStudent Details:");
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Name: " + Name);
        System.out.println("Semester: " + Semester);
        System.out.println("CPI: " + CPI);
    }
}
