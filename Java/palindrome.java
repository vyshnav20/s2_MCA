import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,no,ld,p=0;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        no=n;
        while(n>0)
        {
            ld=n%10;
            p=p*10+ld;
            n=n/10;  
        }
        if(p==no)
            System.out.println("Palindrome!!");
        else
            System.out.println("Not Palindrome!!");
    }
    

}
