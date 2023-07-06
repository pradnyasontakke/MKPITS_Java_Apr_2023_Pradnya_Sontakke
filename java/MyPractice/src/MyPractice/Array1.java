package MyPractice;
//class declaration
public class Array1 {
    //main method
    public static void main(String[] args) {

//initialize array with length 4, and elements are 5
        int[] array = {1, 2, 3, 4, 5};
        //for loop starting with 1, counter<array.length=calculate total length,and increment
        for (int counter = 1; counter < array.length; counter++) {
            //print the result counter-1 is for the array start with 0
            System.out.println(array[counter - 1]);
        }
        //print reverse string
        System.out.println("reverse string");
        //start with total length-1 and check till element greater than 0, and decrement
        for(int counter=array.length-1;counter>=0;counter--){
           //print decreasing order
            System.out.println( array[counter] );
        }

}}