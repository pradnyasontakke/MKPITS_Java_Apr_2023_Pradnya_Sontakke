import java.util.Arrays;

public class DsMethods {
    public static void main(String[] args) {
//initialize array
        int[] arrayNumber = {99995, 888, 99, 166, 198, (int) 888888888d};
        byte[] arrayNumber1={7,19, 79,99};

//print the list of sorted arrays using for each loop
        Arrays.sort(arrayNumber);
        for (int number:arrayNumber) {
            System.out.println(number);
        }


  //print the address of array using binary search
        System.out.println(Arrays.binarySearch(arrayNumber, 16));
        System.out.println(Arrays.binarySearch(arrayNumber, (int) 888888888d));
        System.out.println(Arrays.binarySearch(arrayNumber,166));




        byte[]arrayNumber2=Arrays.copyOf(arrayNumber1,6);
        arrayNumber2[4]=99;
        arrayNumber2[5]=90;

        System.out.println("new arrays ");
        for (int i=0;i< arrayNumber2.length;i++)
        System.out.println(arrayNumber2[i]);

//fill method
          Arrays.fill(arrayNumber,  44);
             for(int number1:arrayNumber)
             {
    System.out.println(number1);
     }

        System.out.println(Arrays.hashCode(arrayNumber1));


             //using boolean
       boolean arrayNumber3[]=new boolean[7];
        for (boolean number3:arrayNumber3
             ) {
            System.out.println(number3);
        }
    }

}