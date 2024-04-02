import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    int Empid;
    String name,address;
    double salary;
    Employee(int x)
    {
        System.out.println("\n\t\tEnter Details of Teacher "+x);
        System.out.print("Enter Employee Id: ");
        Empid=sc.nextInt();
        System.out.print("Enter Employee Name: ");
        name=sc.next();
        System.out.print("Enter Salary: ");
        salary=sc.nextDouble();
        System.out.print("Enter Address: ");        
        address=sc.next();        
    }
}

class Teacher extends Employee
{
    Scanner sc=new Scanner(System.in);
    String dept,subject[];
    int no;
    Teacher(int x)
    {
        super(x);
        System.out.print("Enter Department: ");
        dept=sc.next();
        System.out.print("Enter no:of subjects taught: ");
        no=sc.nextInt();
        subject=new String[no];
        System.err.print("Enter list of subjects: ");
        for(int i=0;i<no;i++)
            subject[i]=sc.next();
    }
    void display(int j)
    {
        System.out.println("\n\t\tTeacher "+j+" Details");
        System.out.println("Employee Id: "+Empid);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Address: "+address);
        System.out.println("Department: "+dept);
        System.out.print("Subjects: ");
        for(int i=0;i<no;i++)
            System.out.print(subject[i]+" ");
    }
}

class co3_2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:of teachers: ");
        int n=sc.nextInt();
        Teacher t[]= new Teacher[n];
        for(int i=0;i<n;i++)
            t[i]=new Teacher(i+1);
        for(int i=0;i<n;i++)            
            t[i].display(i+1);
    }
}