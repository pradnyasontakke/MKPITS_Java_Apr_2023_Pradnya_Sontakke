import java.io.*;

public class ReadFile
{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("nnn.txt"));
            System.out.println("Enter the name");
            String str = br.readLine();
            while (str != null)
            {
                System.out.println(str);
                str = br.readLine();
            }

        } catch (IOException e)
           {
            throw new RuntimeException(e);
           }
    }
}

