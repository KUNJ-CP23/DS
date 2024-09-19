import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int Employee_ID = sc.nextInt();
        // String Name = sc.next();
        // String Designation =sc.next();
        // Double Salary = sc.nextDouble();
         Employee_Detail e1 = new Employee_Detail();
         e1.readDetails();
         System.err.println(" ");
         e1.print_details();

         // constructor no banavu hoi to niche ma parameters aapi devana and new vadu khali kari devanu
        //  e1.print_details(12, "asdf", "zxvc", 7898678);
        // print_details(Employee_ID, Name, Designation, Salary);
        sc.close();
    }
    //aani andar agar class banavu to static class kevo pade a ne bocoz main method static che
}
class Employee_Detail{
    int Employee_ID;
    String Name; 
    String Designation; 
    double Salary;
    
    // public Employee_Detail(int Employee_ID, String Name, String Designation, double Salary){
    //     this.Employee_ID = Employee_ID;
    //     this.Name = Name;
    //     this.Designation = Designation;
    //     this.Salary = Salary;
    // }

    public void readDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        Employee_ID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        Designation = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        Salary = sc.nextDouble();

        sc.close();
    }

    //and niche ni jem aama pass kari devana
    // public void print_details(int Employee_ID, String Name, String Designation, double Salary){
    public void print_details(){
        System.out.println("Employee ID = "+Employee_ID);
        System.out.println("Name = "+Name);
        System.out.println("Designation = "+Designation);
        System.out.println("Salary = "+Salary);
    }
}
