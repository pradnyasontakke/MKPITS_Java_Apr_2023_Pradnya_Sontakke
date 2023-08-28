package vectorAndStack;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class VectorMethod
{
    public static void main(String[] args) {
        Vector vector=new Vector();
//        vector.add(22);
//        vector.add(33);
//        vector.add(44);
//        System.out.println(vector);   //display vector list
//
//        System.out.println(vector.contains(66));   //check this number available
//        System.out.println(vector.capacity());
//        vector.ensureCapacity(33);
       // System.out.println( System.out.println("capacity is");



        //--------------copyInto--------------------

//        Integer[] array=new Integer[7];  //create new array size of 7
//        vector.copyInto(array);     //use copyInto method for copy the arrays.
//        System.out.println("element arrays are");
//        for(Integer number:array){             //use for loop
//            System.out.println(number);     //display the arrays




            //------------stack--------------
            Stack stack=new Stack();           //create object
            Scanner scanner=new Scanner(System.in);             //scanner method
            stack.push(99);
            stack.push(77);
            stack.push(88);
            stack.push(98);

            boolean result= stack.empty();           //check list is empty if yes output will true
        System.out.println(result);                  //show the result

            stack.pop(); //remove first element  98

              int number= (int) stack.peek();
        System.out.println("show top element "+number);

            System.out.println(stack);
            int number1=stack.search(8);   //show the location of that number
        System.out.println(number1);
        System.out.println(result);






        //---------------queue---------------
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer("pranish");
        priorityQueue.offer("nit");
        System.out.println(priorityQueue);

        }

    }


