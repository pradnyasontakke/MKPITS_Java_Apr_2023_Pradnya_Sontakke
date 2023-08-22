import java.io.*;

public class ReadWrite2
{
    static void fileCopy(String fname1, String fname2) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fname1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fname2));

        String str;
        try {
            str = br.readLine();
        } catch (IOException e) {throw new RuntimeException(e);
            while (str != null)
            {
                System.out.println(str);
                //bw.write(str+"\n");
                str = br.readLine();
            }
            bw.close();
            System.out.println("file copy");
        }
    }
}
