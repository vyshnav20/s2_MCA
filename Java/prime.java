import java.util.*;
class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==0)
            System.out.print("Prime number: ");
        else
            System.out.print("Not prime number: ");
    }    
}
