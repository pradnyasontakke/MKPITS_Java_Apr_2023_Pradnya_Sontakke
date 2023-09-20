import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Cse");
        list.add("it");
        list.add("mechanical");
        list.add("civil");
        System.out.println(list);

    }
}