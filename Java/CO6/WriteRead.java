import java.io.*;
import java.util.*;
public class WriteRead
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        System.out.println("Enter text to insert: ");
        String text = sc.nextLine();
        fos.write(text.getBytes());
        FileInputStream fis = new FileInputStream(fileName);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        fis.close();
        String fileContent = new String(b);
        System.out.println("Contents of " + fileName + ":");
        System.out.println(fileContent);
        sc.close();
    }
}