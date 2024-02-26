import java.util.*;
class addmatrix {
    int m[][]=new int[3][3];
    Scanner sc=new Scanner (System.in);
    void input()
    {
        System.out.println("Enter value of matrix: ");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                m[i][j]=sc.nextInt();
    }
    void add(addmatrix b)
    {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                m[i][j]+=b.m[i][j];
    }
    void display()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        addmatrix a=new addmatrix();
        addmatrix b=new addmatrix();
        a.input();
        b.input();
        a.add(b);
        System.out.println("Sum of matrix");
        a.display();
    }
}
