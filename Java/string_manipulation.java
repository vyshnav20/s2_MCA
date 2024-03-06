import java.util.*;
class word
{
    Scanner sc=new Scanner(System.in);
    String s;
    word()
    {
        System.out.print("Enter a string: ");
        s=sc.nextLine();
    }
    void str_functions()
    {
        System.out.println("Lower case: "+s.toLowerCase());
        System.out.println("Upper case: "+s.toUpperCase());
        System.out.println("Lenght: "+s.length());
        System.out.println("substring(2): "+s.substring(2));
        System.out.println("substring(2,6): "+s.substring(2,6));
        System.out.println("trim: "+s.trim());
        System.out.println("indexOf('o'): "+s.indexOf('o'));
        System.out.println("indexOf('o',10): "+s.indexOf('o',10));
        System.out.println("concat('CR7'): "+s.concat("CR7"));
    }
}

class string_manipulation {
    public static void main(String[] args) {
        word w=new word();
        w.str_functions();
    }
    
}
