import java.util.*;
class sort_string
{
    Scanner sc=new Scanner(System.in);
    String s[];
    int size;
    sort_string()
    {
        System.out.print("Enter no: of strings: ");
        size=sc.nextInt();
        s=new String[size];
        
        System.out.print("Enter "+size+" strings: ");
        for(int i=0;i<size;i++)
            s[i]=sc.next();
    }
    void sort()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if (s[j].compareTo(s[j+1])>0)
                {
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<size;i++)
            System.out.print(s[i]+" ");
    }
}   



public class sort_string_main 
{
    public static void main(String[] args) {
        sort_string s1=new sort_string();
        System.out.println("\t\tOriginal string array");
        s1.display();
        s1.sort();
        System.out.println("\n\t\t Sorted string array");
        s1.display();
    }
}
