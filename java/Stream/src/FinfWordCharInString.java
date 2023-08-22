import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
//read file from user
//write one string
// create count variable who count words.
// calculate how many words in that file
public class FinfWordCharInString
{
    public static void main(String[] args) throws Exception
    {
   int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File file=new File("c:\\MKPITS");
         String line= br.readLine()!=null);

        while(line=br.readLine()!=null);
      {
        String words[]=line.split(" ");
        count=count+words.length;
        System.out.println("words are"+count);
        br.close();

      }
}  }
