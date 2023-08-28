import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetHashSet
{
    public static void main(String[] args) {
        //---------set--------------
        HashSet hashSet=new HashSet();
        hashSet.add(99);
        hashSet.add(9);
        hashSet.add(19);
        hashSet.add(39);
        System.out.println("list of the set"+hashSet);

        hashSet.size();
        System.out.println("size of total elements: "+hashSet.size());       //show total size

        hashSet.remove(9);           //remove this object
        System.out.println("list of set is "+hashSet);

        boolean number=hashSet.isEmpty();
        System.out.println("list is empty: "+number);

        HashSet hashSet1=new HashSet();
        Object HashSet = hashSet.clone();        //create a clone
        hashSet1 = (HashSet)hashSet.clone();
        System.out.println("clone is the "+hashSet);


     //--------iterator---------
        Iterator iterator=hashSet.iterator();

        Integer[] integers={77,8,55,66};
        Integer[] integers1={55,44,88,99};
        HashSet hashSet2=new HashSet(Arrays.asList(integers));
        HashSet hashSet3=new HashSet(Arrays.asList(integers1));
        System.out.println(hashSet2);
        System.out.println(hashSet3);

        //-------show total elements----addAll-------
        HashSet unionOfHashSet=new HashSet();      //common value not repeat and show the total elements
        unionOfHashSet.addAll(hashSet2);
        unionOfHashSet.addAll(hashSet3);
        System.out.println(unionOfHashSet);

        //----------intersection----show common--------
        hashSet2.retainAll(hashSet3);            //used retainAll() to show common elements
        System.out.println("common elements are: "+hashSet2);


        hashSet.removeAll(unionOfHashSet);   //show the list of elements but not repeat value
        System.out.println("remaining elements: "+unionOfHashSet);


    }
}
