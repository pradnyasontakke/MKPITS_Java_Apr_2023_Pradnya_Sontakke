//list iterator
//collection list    forward traversing in one loop and backward traversing.

import java.util.LinkedList;
import java.util.*;
public class ForWordBackWordTraverse
{
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("one");
        list.add("two");
        list.add("three");

        ListIterator listIterator= list.listIterator();       //create object of listIterator and add the value of list in list iterator

        System.out.println("forWord format: ");
        while(listIterator.hasNext())          //The above method is used to return true if the given list iterator contains more number of element during traversing the given list in the forward direction.

        {
            //System.out.println(listIterator.next());   //return next elements,
        }

        System.out.println("backWord format: ");
        while ((listIterator.hasPrevious())){
            System.out.println(listIterator.previous());
        }

    }

}
