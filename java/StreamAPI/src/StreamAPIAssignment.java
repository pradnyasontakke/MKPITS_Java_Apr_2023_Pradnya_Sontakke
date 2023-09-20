//3. sorting =
//6.  finding max and min = create a list of objects(e.g. custom  objects with attributes like name and age)
// and use a stream to find the oldest and youngest object based on a certain attribute(eg.age)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StreamAPIAssignment
{
    public static <Student> void main(String[] args) {
        //1.
        //4
        List<String>string= Arrays.asList("apple","papaya","mango","bananas","orange");
        System.out.println(string);
        Map<Integer ,Long>map = string.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
         map.forEach((key,value)->System.out.println("numbers are  " +key+ " values are"+value));

         //5


    }

}
