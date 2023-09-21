import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;


    private List<Course> Course;

    public Student(String name) {
        this.name = name;
        this.Course = new ArrayList<>();
    }

    public void addCourse(Course course) {
        course.add(course);

    }

    public double calculateCgpa() {

        return 0;
    }


    public static void main(String[] args) {



    }
}