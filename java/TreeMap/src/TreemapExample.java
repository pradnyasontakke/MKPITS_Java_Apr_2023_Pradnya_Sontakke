import java.util.TreeMap;

public class TreemapExample
{
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(100,"hundred");
        treeMap.put(102,"hundred two");
        treeMap.put(104,"hundred four");
        treeMap.put(101,"hundred one");
        treeMap.put(103,"hundred three");

        System.out.println(treeMap);

    }
}
