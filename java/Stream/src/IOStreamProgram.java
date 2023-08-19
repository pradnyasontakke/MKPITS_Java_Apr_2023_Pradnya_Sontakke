import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//create input class
public class IOStreamProgram
{
    public static void main(String[] args)
    {
        //create object of buffered input stream convert byte to character
        //in is the input stream data which is store in br for communicating this we use
        //input stream reader read from keyboard
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     //enter msg
        System.out.println("enter number ");
        try
        {
            //read single line of data, method of string object
           String nm=br.readLine();
           //
            System.out.println("cube "+(Integer.parseInt(nm)*Integer.parseInt(nm)*Integer.parseInt(nm)));
        }catch (IOException e)
        {
            throw new RuntimeException( e);
        }
    }
}

