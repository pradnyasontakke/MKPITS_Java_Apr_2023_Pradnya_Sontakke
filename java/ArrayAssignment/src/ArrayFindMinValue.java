import java.util.ArrayList;

public class ArrayFindMinValue
{
    public static void main(String[] args)
    {
        //list of array
      int Array[]={4,6,7,8,2};
      //print the line for array list
        System.out.println("list of array number");
        //consider 0th index no as a min no
        int Min=Array[0];
        //loop execute start with 0, calculate all lenght
        for(int Minvalue=0;Minvalue<Array.length;Minvalue++)
        {
            // in if condition min means 0th index value is greater than index of 1 2 3 4 value then execute next line or check again for loop
           if(Min>Array[Minvalue])
               //store in min= array value with index
           Min=Array[Minvalue];
            System.out.println(Array[Minvalue]);
        }
        System.out.println("minimum value is:\n " +Min);
    }
}
