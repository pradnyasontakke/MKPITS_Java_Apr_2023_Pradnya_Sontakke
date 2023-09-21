import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class UsingVector
{
    public static void main(String[] args) {
        Vector <Integer> vector=new Vector<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));   //create vector object
        int numbers;
        Scanner scanner=new Scanner(System.in);
        for (int count=0;count<10;count++) {
            System.out.println("enter the values");
            numbers=scanner.nextInt();
            vector.set(numbers%10,numbers);          //numbers %10

        }
        System.out.println(vector.size());
        System.out.println(vector);
        Vector vector1=new Vector();
        for (int i=0;i<vector.size();i++)
        {
            if(vector.elementAt(i)!=0)
                vector1.add(vector.elementAt(i));            //add nonzero numbers

        }
      //  collections.sort(vector);
        System.out.println(vector1);
    }
}
