import java.util.Comparator;

public class ComparatorStudents implements Comparator<Students>
{
    @Override
    public int compare(Students s1, Students s2) {  //condition check
        if(s1.getMarks()== s2.getMarks())
        return 0;
        else if(s1.getMarks()<s2.getMarks())
            return -1;
        else
            return 1;
    }
}
