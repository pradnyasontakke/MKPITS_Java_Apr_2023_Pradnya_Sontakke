import java.io.*;

public class ReadDataSystem
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
            System.out.println("enter the name");
            String str =br.readLine();
//            while (true)
//            {
//                if(str.equals("brk"))
//                    break;
//            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
