import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleListSet
{
    public static void main(String[] args) {
        List list = new ArrayList();
        //display object of arraylist()
        list.add(55);
        list.add(65);
        list.add(45);
        System.out.println(list);
        System.out.println();
        System.out.println("for loop");

        for (int number = 0; number < list.size(); number++) ;
        {
            int number = 0;
            System.out.println(list.get(number));
        }

        System.out.println("iteration");
        Iterator listIterator=list.iterator();
        while (listIterator.hasNext());
        {
            System.out.println(listIterator.next());
        }





//        List list2=new ArrayList();
//        list.add(77);



    }
}
