public class Course {
    private String courseName;
    private double grade;
    private int creditHours;

    public Course(String courseName,double grade,int creditHours) {
     this.courseName=courseName;
     this.creditHours=creditHours;
     this.grade=grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;

    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void getcreditHours(int creditHours)
    {

    }

    public void add(Course course) {
    }
}

