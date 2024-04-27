import java.util.*;
class fibonacci implements Runnable
{
    int n;
    fibonacci(int limit)
    {
        n=limit;
    }
    public void run() 
    {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class Even implements Runnable
{
    int start,end;
    Even(int a,int b)
    {
        start=a;
        end=b;
    }
    public void run() 
    {
        for (int i = start; i <= end; i++)
        {
            if (i % 2 == 0) 
            {
                System.out.println("Even: "+i);
            }
        }
    }
}
public class CO4_6 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers: ");
        int n = sc.nextInt();
        System.out.print("Enter the start and end range for even numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        Thread f=new Thread(new fibonacci(n));
        Thread e=new Thread(new Even(start,end));
        f.start();
        e.start();
    }
}
