

//        1.append the specified element to the end of a linked list.
//        2.iterate through all elements in a linked list.
//        3.iterate through all elements in a linked list starting at the specified position.
//        4.iterate a linked list in reverse order.
//        5.insert the specified element at the specified position in the linked list.
//        6.insert elements into the linked list at the first and last positions.
//        7.insert the specified element at the front of a linked list.
//        8.insert the specified element at the end of a linked list.
//        9.insert some elements at the specified position into a linked list.
//        10.get the first and last occurrence of the specified elements in a linked list.
//        11.display elements and their positions in a linked list.
//        12.remove a specified element from a linked list.
//        13.remove the first and last elements from a linked list.
//        14.remove all elements from a linked list.
//        15.Write a Java program that swaps two elements in a linked list.
//        16.shuffle elements in a linked list.
//        17.join two linked lists.
//        18.copy a linked list to another linked list.
//        19.remove and return the first element of a linked list.
//        20.retrieve, but not remove, the first element of a linked list.
//        21.retrieve, but not remove, the last element of a linked list.
//        22.check if a particular element exists in a linked list.
//        23.convert a linked list to an array list.
//        24.compare two linked lists.
//        25.check if a linked list is empty or not.
//        26.replace an element in a linked list.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class CollectionLinkedListAssignment {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();


        //1. append the specified element to the end of a linked list.
        linkedList.add("riya");
        linkedList.add(99);
        linkedList.add(55);
        linkedList.add(89);
        linkedList.add(48);
        linkedList.add("piya");
        System.out.println(linkedList);



        Scanner sc=new Scanner(System.in);
        String name, choice;
        do {
            System.out.println("enter name");
             name = sc.next();
            linkedList.add(name);
            System.out.println("do you want to add other yes/no");
            choice=sc.next();

        }while (choice.equalsIgnoreCase("yes"));
        for(Object object:linkedList)
        {
            System.out.println(object);
        }
        System.out.println(linkedList);




//2.iterate through all elements in a linked list.
        System.out.println("list of iterator ");
       Iterator iterator= linkedList.listIterator(3);
       while(iterator.hasNext())
       {
            System.out.println(iterator.next());
       }
// 3.iterate through all elements in a linked list starting at the specified position.
        System.out.println("iterator index");
     for(int number=0;number<3;number++)
     {
         System.out.println(linkedList.get(number));
     }


 //        4.iterate a linked list in reverse order.
        System.out.println("list of descending iterator");
        Iterator iterator1=linkedList.descendingIterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
//        5.insert the specified element at the specified position in the linked list.
           linkedList.add(1,2);
        System.out.println(linkedList);


//        6.insert elements into the linked list at the first and last positions.






    }
}
