import java.util.*;
class negative extends RuntimeException
{
    negative(String s)
    {
        super(s);
    }
}

class CO4_4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:of elements: ");
        int n=sc.nextInt();
        int nos[]=new int[n];
        double sum=0;
        System.out.print("Enter "+n+" numbers: ");
        for(int i=0;i<n;i++)
        {
            nos[i]=sc.nextInt();
            try
            {
                if(nos[i]<0)
                    throw new negative("Negative number is not allowed!!!");
                else
                sum+=nos[i];
            }
            catch(negative e)
            {
                System.out.println("\n"+e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average: " + String.format("%.2f", sum/n));

    }
}