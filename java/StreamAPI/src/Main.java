import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //using map

        List <String> cities=Arrays.asList("Bhadrawati","pune","mumbai","chandrapur");
        List list1=cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println(list1);


           //using Filter

        List<Integer> number =Arrays.asList(23,56,78,26,297,73);
        List result= number.stream().filter(n ->n%2==0).collect(Collectors.toList());
        System.out.println(number);
        System.out.println(result);



              //using sorted and forEach()
        cities.stream().sorted().forEach(System.out::println);


                       //using reduce
        int sumOfNumbers=number.stream().reduce(0,(sum,n)->sum+n);
        System.out.println(sumOfNumbers);




                         //wap to show the students data using steam api methods


        List <String> name=Arrays.asList("nitisha","nomat","mites","binod");
          List list2=name.stream().map(s->s).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> rollNumbers=Arrays.asList(12,23,34,45,56,67,78);

        List<String>division=Arrays.asList("A","B","C","D");


    }
}