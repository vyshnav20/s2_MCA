import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    int eNo;
    String eName;
    double eSalary;
    Employee(int n)
    {
        System.out.println("\t\t\tEnter Details for Employee "+n);
        System.out.print("Enter Employee Number: ");
        eNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        eName=sc.nextLine();
        System.out.print("Enter Salary: ");
        eSalary=sc.nextDouble();
    }
}
class array_objects 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0; i<n; i++)
        {
            e[i]=new Employee(i+1);
        }
        System.out.print("\nEnter Employee Number to search: ");
        int num=sc.nextInt();
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(e[i].eNo==num)
            {
                System.out.println("Employee Name: "+e[i].eName+"\nSalary: "+e[i].eSalary);
                c=1;
            }
        }
        if(c==0)
            System.out.println("Employee Not Registered!!!");            
    }
}