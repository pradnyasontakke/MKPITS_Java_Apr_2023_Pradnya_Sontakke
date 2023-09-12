package HashMapProgram;

import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap <Integer,String> hashmap=new HashMap<Integer,String>();
        hashmap.put(9,"nine");
        hashmap.put(5,"five");
        hashmap.put(3,"three");
        hashmap.put(10,"ten");
        System.out.println(hashmap);
    }
}
