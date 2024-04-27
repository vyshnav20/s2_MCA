import java.util.*;
class stack<T> 
{
    ArrayList<T> A;
    int top = -1;
    int size;
    stack(int size)
    {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }
    void push(T X)
    {
        if (top + 1 == size) 
        {
            System.out.println("Stack Overflow");
        }
        else 
        {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X); 
            else
                A.add(X);
        }
    }
    T top()
    {
        if (top == -1) 
        {
            System.out.println("Stack Underflow"); 
            return null;
        } 
        else
            return A.get(top);
    }
    void pop()
    {
        if (top == -1) 
        { 
            System.out.println("Stack Underflow");
        } 
        else 
            top--;
    }
    boolean empty() { return top == -1; }

    public String toString()
    {
 
        String Ans = "";
        for (int i = 0; i < top; i++)
        {
            Ans += String.valueOf(A.get(i)) + "->";
        } 
        Ans += String.valueOf(A.get(top)); 
        return Ans;
    }
}
public class CO4_8 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter max size of stack: ");
        int n=sc.nextInt();
        stack<Integer> s1 = new stack<>(n); 
        int v;
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            v=sc.nextInt();
            s1.push(v);
        }
        
        System.out.println("\nStack after pushing "+n+" elements :\n" + s1); 
        s1.pop(); 
        System.out.println("\nStack after pop :\n" + s1);
    }
}