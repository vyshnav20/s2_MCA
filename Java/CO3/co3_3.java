import java.util.*;
class Person
{
    Scanner sc=new Scanner(System.in);
    String name,address;
    char gender;
    int age;
    Person(int x)
    {
        System.out.println("\n\n\t\tEnter details of Teacher "+x);
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter Gender(M/F/O): ");
        gender=sc.next().charAt(0);
        System.out.print("Enter Age: ");
        age=sc.nextInt();        
        System.out.print("Enter Address: ");
        address=sc.next();
    }
}

class Employee extends Person
{
    Scanner sc=new Scanner(System.in);
    int EmpId;
    String CompanyName,qualification;
    double salary;
    Employee(int x)
    {
        super(x);
        System.out.print("Enter Employee ID: ");
        EmpId=sc.nextInt();
        System.out.print("Enter Company Name: ");
        CompanyName=sc.next();
        System.out.print("Enter Qualification: ");
        qualification=sc.next();
        System.out.print("Enter Salary: ");
        salary=sc.nextDouble();
    }
}


class Teacher extends Employee
{
    Scanner sc=new Scanner(System.in);
    String subject,department;
    int TeacherId;
    Teacher(int x)
    {
        super(x);
        System.out.print("Enter Teacher ID: ");
        TeacherId=sc.nextInt();
        System.out.print("Enter Subject: ");
        subject=sc.next();
        System.out.print("Enter Department: ");
        department=sc.next();
    }
    void display(int n)
    {
        System.out.println("\n\n\t\tTeacher "+n+" Details");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+EmpId);
        System.out.println("Teacher ID: "+name);
        System.out.println("Company Name: "+CompanyName);
        System.out.println("Department: "+name);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);

    }
}

class co3_3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:of teachers: ");
        int n =sc.nextInt();
        Teacher t[]=new Teacher[n];
        for(int i=0;i<n;i++)
            t[i]=new Teacher(i+1);
        for(int i=0;i<n;i++)
            t[i].display(i+1);
    }
    
}
