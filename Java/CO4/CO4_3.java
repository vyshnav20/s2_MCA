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

class user
{
    String name,password;
    user(String n, String p)
    {
        name=n;
        password=p;
    }
    void login(String n, String p)
    {
        try
        {
            if(name.equals(n)&&password.equals(p))
                System.out.println("\t\tLogin successful");
            else
                throw new passexception("Invalid username or password!!");
        }
        catch (passexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
    }
}
class CO4_3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String s=sc.next();
        try
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
                    continue;
                else
                    throw new nameexception("Invalid Name");
            }
        }
        catch (nameexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        System.out.print("Enter password: ");
        String pass=sc.next();
        try
        {
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
                throw new passexception("Password must contain atleast 1 number");
        }
        catch (nameexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        catch (passexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        user u1=new user(s,pass);
        System.out.println("\t\tLogin!!");
        System.out.print("Username: ");
        String n1=sc.next();
        System.out.print("Password: ");
        String p1=sc.next();
        u1.login(n1,p1);
    }
}