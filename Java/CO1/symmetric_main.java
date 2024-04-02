import java.util.*;
class symmetric 
{
    Scanner sc=new Scanner (System.in);
    int n,m,matrix[][];
    int c=0;
    symmetric()
    {
        System.out.print("Enter size of matrix: ");
        n=sc.nextInt();
        m=sc.nextInt();
        matrix=new int[n][m];
        System.out.println("Enter value of matrix: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            matrix[i][j]=sc.nextInt();
    }
    void transpose()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                if(matrix[j][i]!=matrix[i][j])
                {
                    c=1;
                    break;
                }
        }
        if(c!=1)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric");
    }
}
class symmetric_main
{
    public static void main(String[] args) 
    {
        symmetric a=new symmetric();        
        a.transpose();
    }
}