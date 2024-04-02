import java .util.*;
class CPU
{
    Scanner sc= new Scanner(System.in);
    int price;
    class Processor
    {
        int no_cores;
        String manufacturer;
        Processor()
        {
            System.out.print("Enter no:of cores in the processor: ");
            no_cores =sc.nextInt();
            System.out.print("Enter manufacturer of the processor: ");
            manufacturer =sc.next();
        }
    }
    static class RAM
    {
        Scanner sc= new Scanner(System.in);
        int memory;
        String manufacturer;
        RAM()
        {
            System.out.print("Enter memory capacity of RAM: ");
            memory =sc.nextInt();
            System.out.print("Enter manufacturer of the RAM: ");
            manufacturer =sc.next();
        }
    }
}
class innerclass
{
    public static void main(String[] args) 
    {
        CPU c = new CPU();
        CPU.Processor p=c.new Processor();
        CPU.RAM r= new CPU.RAM();
        c.price=2500+(p.no_cores*20)+(r.memory*15);
        System.out.println("\n Processor:\nNo:of Cores : "+p.no_cores+"\nManufacturer: "+p.manufacturer);
        System.out.println("\n RAM:\nMemory Capacity : "+r.memory+" GB\nManufacturer: "+r.manufacturer);
        System.out.println("\nCPU Price: "+c.price);
    }
}