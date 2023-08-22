import java.io.*;

public class ArrayPrintLineByLine
{
    public static void readFromfile(String fname) throws IOException {
        String lines[]=new String[20];
        File file=new File(fname);
        int i=0;
        if(file.exists())
        {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String str= br.readLine();
            while (str!=null)
            {
                lines[i]=str;
                str= br.readLine();
                i++;

            }
            for (String l:lines) {
                System.out.println(l);

            }
        }
    }
}
