public class Students {
    String Name;
    int rno;
    int marks;

    public void show() {
        System.out.println();
    }

    public Students(String name, int rno) {
        Name = name;
        this.rno = rno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static int sum(int... num) {
        int s = 0;
        for (int i : num) {
            s = s + i;
        }
        return s;
    }

    public static int average() {
        int total = 0;
        int s = 0;


        return total;
    }
}