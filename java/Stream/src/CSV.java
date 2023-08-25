import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV
{
    public static void convert() throws FileNotFoundException {
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(" StreamRead.csv"));

        String string=bufferedReader.readLine();
            while (string != null)
                {
                    String[]str=string.split(" ,");
                    for(int count=0;count<=str.length;count++) {
                        System.out.println(str);

                    }

                   // System.out.println(str[0]+ "+"+str[1]+" +"+str[2]);
                    string=bufferedReader.readLine();

                }


    } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
      CSV csv=new CSV();
      csv.convert();
    }
}
