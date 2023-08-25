import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(89);
        list.add("siya");
        list.add("piya");
        list.add(66);
        list.add(77.88);


//        list.add(4,"nik");
//
//
//        list.addFirst(8);
//        list.addLast(45);


        System.out.println(list);


//        System.out.println("clone of object ");
//        list.clone();

       // System.out.println("contains of list "+list.contains());

//        list.contains(list );
//        System.out.println(list);


     System.out.println("pole element");
        System.out.println(list.poll());   //remove first element
        System.out.println(list);



        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);


//
//        System.out.println("pop element");
//        list.pop();
//
//        System.out.println(list.element());

//
//        System.out.println("list iterator");
//        Iterator iterator= list.iterator();
//        while(iterator.hasNext());
//        {
//            System.out.println(iterator.next());
//        }


        list.push(5);
        System.out.println(list);


        //System.out.println("iteration");
//        Iterator iterator=list.iterator();
//       while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//        for(Object l:list)
//        {
//            System.out.println(l);
//        }

    }
}
