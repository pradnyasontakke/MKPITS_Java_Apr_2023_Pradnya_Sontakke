import java.io.*;
public class ReadData
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("enter file name: ");
            File file =new File(b.readLine());
            if(file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));//read from file
                String str = br.readLine();
                while (str != null) {
                    System.out.println(str);
                    str = br.readLine();
                }
            }
        else

            System.out.println("file does not exit");

        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
