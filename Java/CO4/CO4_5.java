import java.util.*;
class multiple5 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}

class multiple6 extends Thread
{
    public void run()
    {
        for(int i=20;i<30;i++)
        {
            System.out.println(i);
        }
    }
}
public class CO4_5 {
    public static void main(String[] args) {
        multiple5 m =new multiple5();
        multiple6 m1 =new multiple6();
        m.start();
        m1.start();
    }
}
