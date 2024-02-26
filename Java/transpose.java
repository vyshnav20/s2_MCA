import java.util.*;
class transpose {
    int m[][]=new int[3][3];
    int c=0;
    Scanner sc=new Scanner (System.in);
    void input()
    {
        System.out.println("Enter value of matrix: ");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                m[i][j]=sc.nextInt();
    }
    int mtranspose()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                if(m[j][i]!=m[i][j]);
                {
                    return 0;
                }
        }
        return 1;
    }
    public static void main(String[] args) {
        transpose a=new transpose();
        a.input();
        
        if(a.mtranspose()==0)
            System.out.println("Matrix is symmetric: ");
        else
            System.out.println("Matrix is not symmetric: ");
    }
}
