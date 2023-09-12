//wap hashmap program and sort it by a key
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(9878,"eight");
        hashMap.put(5654,"five");
        hashMap.put(9842,"nine");
        hashMap.put(213,"three");
        System.out.println(hashMap);
        //hashMap.entrySet();
       // hashMap.keySet();
       // Set set=new HashSet.entrySet();


        TreeMap <Integer,String>treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);


    }
}
