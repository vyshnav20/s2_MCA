import java.util.*;
public class CO4_15 
{
    public static void main(String[] args) 
    {
        Set <String> set =new LinkedHashSet<String>();
        Scanner sc=new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.print("\n----------------\n1: Add\n2: Remove\n3: Display\n4: Search\n0: Exit\n----------------\nEnter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter element to insert: ");
                    el=sc.next();
                    set.add(el);
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    el=sc.next();
                    set.remove(el);
                    break;
                case 3:
                    System.out.println("Linked Hashset: "+set);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    el=sc.next();
                    boolean contains=set.contains(el);
                    System.out.println("Set contains "+el+" : "+contains);
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
            }
        }while(ch!=0);
    }   
}
