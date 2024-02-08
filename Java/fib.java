import java.util.*;
class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci Series:");
        if(n<2)
            System.out.print(a+" "+b);
        else
            for(int i=0;i<n;i++)
            {
                c=a+b;
                System.out.print(a+" ");
                a=b;
                b=c;
            }
    }    
}
