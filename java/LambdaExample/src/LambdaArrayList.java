import java.util.ArrayList;
import java.util.Arrays;

public class LambdaArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<Integer>();            //create arraylist
        arrayList.addAll(Arrays.asList(22, 66, 89, 78, 9));              //add the elements
        System.out.println(arrayList);                                  //display the list
        arrayList.forEach(number-> System.out.println(number));          //lambda expression

        arrayList.forEach(number-> System.out.println(number*4));
    }
}
