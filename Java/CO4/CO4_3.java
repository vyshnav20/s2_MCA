import java.util.*;
class nameexception extends RuntimeException
{
    nameexception(String s)
    {
        super(s);
    }
}
class passexception extends RuntimeException
{
    passexception(String s)
    {
        super(s);
    }
}
class CO4_3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
                continue;
            else
                throw new nameexception("Invalid Name");
        }
        System.out.print("Enter password: ");
        String pass=sc.next();
        int p=0;
        if(pass.length()<8)
            throw new nameexception("Password must have 8 charachters");
        for(int i=0;i<pass.length();i++)
        {
            char ch=pass.charAt(i);
            if((ch>=48&&ch<=57))
            {
                p=1;
            }
        }
        if(p==0)
            throw new nameexception("Password must contain atleast 1 number");
    }
}