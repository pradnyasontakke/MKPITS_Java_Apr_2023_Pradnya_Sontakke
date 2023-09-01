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

      arrayList.clone();
        System.out.println(arrayList);

        ArrayList arrayList1=new ArrayList();
        arrayList1.add(88);
        arrayList1.add(54);
        arrayList1.add(66);
        System.out.println(arrayList1);

        System.out.println("allAll elements");
        arrayList.addAll(1,arrayList1);
        System.out.println(arrayList);


        System.out.println(arrayList1.isEmpty());   //return true if empty
        System.out.println(arrayList1.lastIndexOf(5));


    }
}