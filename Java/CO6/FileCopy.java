import java.io.*;
public class FileCopy 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the source file path: ");
        String sourceFile = reader.readLine();
        System.out.print("Enter the destination file path: ");
        String destinationFile = reader.readLine();
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) 
        {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) 
            {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
        finally 
        {
            reader.close();
        }
    }
}