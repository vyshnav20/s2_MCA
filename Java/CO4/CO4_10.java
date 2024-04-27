import java.util.*;
public class CO4_10 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.print("\n----------------\n1: add\n2: size\n3: search by index\n4: find index\n5: contains\n6: remove\n7: remove by index\n8: display\n9: clear search\n0: Exit\n----------------\nEnter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter element to insert: ");
                    el=sc.next();
                    list.add(el);
                    break;
                case 2:
                    System.out.println("Size of the arraylist: "+list.size());
                    break;
                case 3:
                    System.out.print("Enter index of element to search: ");
                    int index=sc.nextInt();
                    System.out.println("Element at index "+index+" is "+list.get(index));
                    break;
                case 4:
                    System.out.print("Enter an element to find index: ");
                    el=sc.next();
                    index=list.indexOf(el);
                    System.out.println("Index of "+el+" is "+index);
                    break;
                case 5:
                    System.out.print("Enter a element"); 
                    el=sc.next();
                    boolean contains=list.contains(el); 
                    System.out.println(el+" is in the list :"+contains);
                    break;
                case 6:
                    System.out.print("Enter the element to be removed: "); 
                    el=sc.next(); 
                    boolean removed=list.remove(el); 
                    System.out.println("After removing "+el+ " ArrayList: "+list); 
                    break; 
                case 7:
                    System.out.print("Enter the index to remove the element: ");
                    index=sc.nextInt(); 
                    list.remove(index); 
                    System.out.println("After removing the element, arraylist:"+list); 
                    break; 
                case 8:
                    System.out.println("Arraylist: "+list);
                    break;
                case 9:
                    list.clear();
                    break;
                case 0:
                    break;      
            }
        }while(ch!=0);
    }
}
