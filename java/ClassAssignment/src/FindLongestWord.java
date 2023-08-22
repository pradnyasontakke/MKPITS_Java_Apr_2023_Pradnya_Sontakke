import java.io.*;
//read data from user
//write data from file
//read data using readLine and store this in string str
// print input from user
//
public class FindLongestWord
{
    public static void LongestWord(String fname) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new FileWriter(fname));
        String choice;
        do {

                System.out.println("enter a string");
                String str = br.readLine();
                bw.write(str + "\n");
                System.out.println("do you want to add another data (yes/no)");
                choice = br.readLine();
            }
            while (choice.equalsIgnoreCase("yes")) ;
            bw.close();

    }
}


