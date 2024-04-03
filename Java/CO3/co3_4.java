import java.util.*;
class Publisher
{
    String name;
    Scanner sc=new Scanner(System.in);
    static int nos;
    Publisher()
    {
        nos++;
        System.out.print("\nEnter Publisher "+nos+" Name: ");
        name=sc.next();
    }
}

class Book
{
    String title,category;
    Publisher publisher;
    double price;
    Scanner sc=new Scanner(System.in);
    Book(Publisher p,String cat)
    {
        publisher=p;
        category=cat;
        System.out.print("\nEnter "+category+" Book Title: ");
        title=sc.next();
        System.out.print("Enter Book Price: ");
        price=sc.nextDouble();
    }
    void display()
    {        
        System.out.println("\nPublisher Name: "+publisher.name);
        System.out.println("Book Title: "+title);
        System.out.println("Book Price: "+price);
        System.out.println("-------------------------");
    }
} 
class Literature extends Book
{
    Literature(Publisher p)
    {
        super(p,"Literature");
    }
    
}
class Fiction extends Book
{
    Fiction(Publisher p)
    {
        super(p,"Fiction");
    }
}

class co3_4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Publisher p1=new Publisher();
        Publisher p2=new Publisher();
        Book b[]=new Book[4];
        b[0]=new Literature(p1);
        b[1]=new Literature(p2);
        b[2]=new Fiction(p2);
        b[3]=new Fiction(p1);
        System.out.print("\n-------------------------\n1. Fiction\n2. Literature\nEnter your choice: ");
        int ch=sc.nextInt();
        ch-=1;
        String categories[]={"Fiction","Literature"};
        System.out.println("\n-------------------------\n\t"+categories[ch]+" Books");
        for(int i=0;i<4;i++)
            if (b[i].category==categories[ch])
                b[i].display();
    }
}