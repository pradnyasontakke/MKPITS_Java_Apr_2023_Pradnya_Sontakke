import java.util.Arrays;

public class ArrayFindMaxValue
{
    public static void main(String[] args)
    {
        int Array[]={3,6,8,9,5};
        //the element in zero position is in zero index is max value as consider

        System.out.println("List of array ");
        int Max=Array[0];
        //for loop check start with 1 because we consider 0 index for the max value,then check all array lenght
        for (int Maxvalue=0;Maxvalue<Array.length;Maxvalue++)
        {
            //check if cond. max means 3is less than max value, if yes then enter in loop and print else not enter and check second element
         if(Max<Array[Maxvalue])
         {
             // after checking if value is greater than Array value then execute this statement
             Max=Array[Maxvalue];


         }

            System.out.println( Array[Maxvalue]);

        }
        System.out.println("Maximum value is" + Max);
    }
}
