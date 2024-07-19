import java.util.*;
import java.io.*;
class directory
{
    static void display_files(File dir)
    {
        File filelist[]=dir.listFiles();  
            if(filelist!=null)
            {
                for(int i=0;i<filelist.length;i++)
                    {
                        System.out.println(filelist[i].getName());
                        if(filelist[i].isDirectory())
                            display_files(filelist[i]);
                        
                    }
            }
    }

    static void searchfile(File dir, String name)
    {
        File filelist[]=dir.listFiles();  
        for(int i=0;i<filelist.length;i++)
        {
            if((filelist[i].getName()).equals(name))
            {
                System.out.println("FILE FOUND");
                return;
            }
        }
        System.out.println("FILE NOT FOUND");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String d=sc.nextLine();
        File dir=new File(d);
        if(dir.isDirectory())
        {
            display_files(dir);
            System.out.print("Enter file name to search: ");
            String fname=sc.nextLine();
            searchfile(dir,fname);
        }
    }
}