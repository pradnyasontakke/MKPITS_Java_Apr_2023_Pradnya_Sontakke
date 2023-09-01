import java.util.Arrays;

public class ArraysclassExample {
    public static void main(String[] args) {

        //asList
        String[] cities = {"nita", "gita", "rita"};
        System.out.println( Arrays.asList(cities));

        //sorting
        int [] numbers={12,34,56,78,9};
        Arrays.sort(numbers);
        for (int num:numbers
             ) {
            System.out.println(num);
        }
      int value=Arrays.binarySearch(numbers,1);
        System.out.println(value);

        //char
        char[] chararray={'j','a','v','a'};
       // System.out.println(Arrays.binarySearch(chararray));

    }
}
