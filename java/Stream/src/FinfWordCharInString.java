import java.io.*;
import java.util.Scanner;

//read file from user
//write one string
// create count variable who count words.
// calculate how many words in that file
public class FinfWordCharInString
{

    public static void readFromFile(String fileName) throws IOException
    {
        //create a file
        System.out.println(" enter the file");
        File file=new File(fileName);
        //initialize variable
        int lineCounter=0;
        int wordCounter=0;
        int characterCounter=0;
        //
        if (file.exists())
        {
            //buffered reader who read data from file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            //read data line by line
            String string = bufferedReader.readLine();

            //while loop check till loop not get the null
            while (string != null)
            {


                //if not getting the null then loop print next line
                lineCounter++;
                String[] array = string.split("");
                wordCounter = wordCounter + array.length;
                for (int number = 0; number <array.length; number++)
                {
                 characterCounter=characterCounter+array[number].length();
                }
                System.out.println(string);
                string=bufferedReader.readLine();
            }


            System.out.println("total lines are "+lineCounter );
            System.out.println("total words are "+wordCounter);
            System.out.println("total character are "+characterCounter);
        }else
            System.out.println("not found");
    }
}


