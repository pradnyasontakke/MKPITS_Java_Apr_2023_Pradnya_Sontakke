import java.util.*;
public class ArraysListExample {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();
        arrayList.add("rehana");
        arrayList.add(8);
        arrayList.add(1,7);
        System.out.println(arrayList);


        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }
}