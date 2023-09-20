//1. filtering and collecting =create a list of string and use a stream to filter out string that start with the letter"A",
// collect the filtered string into a new list

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AssignmentQ1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Banana","dates","orange","Awacardo");
        System.out.println(list);
        List<String> list1= list.stream().filter(s->s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
