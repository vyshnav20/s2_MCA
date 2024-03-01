import java.util.*;
class addmatrix 
{
    Scanner sc=new Scanner (System.in);
    int n,m;
    int matrix[][];
    addmatrix(int x) 
    {       
        System.out.print("Enter size of matrix "+x+": ");
        n=sc.nextInt();
        m=sc.nextInt();
        matrix=new int[n][m];
        System.out.println("Enter value of matrix "+x+": ");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j]=sc.nextInt();
    }
    void add(addmatrix b)
    {
        if(n!=b.n || m!=b.m)
            System.out.println("Addition of matrix not possible");
        else
        {
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                matrix[i][j]+=b.matrix[i][j];
            System.out.println("Sum of matrix");
            this.display();
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}
class addmatrix_main
{
    public static void main(String[] args) 
    {
        addmatrix a=new addmatrix(1);
        addmatrix b=new addmatrix(2);
        a.add(b);
    }
}