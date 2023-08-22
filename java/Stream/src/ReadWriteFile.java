import java.io.*;
//write rhe data from this program
public class ReadWriteFile
{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //make a one file on that folder
            BufferedWriter bw = new BufferedWriter(new FileWriter("nnn.txt"));
            System.out.println("enter name: ");

            //str store data
            String str = br.readLine();
            while (true) {
                //when we enter end loop terminate
                if (str.equals("end"))
                    //break the loop
                    break;
                //write name
                bw.write(str + "\n");
                //end the loop if not write loop will execute infinite
                str = br.readLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //second class
    }
}
