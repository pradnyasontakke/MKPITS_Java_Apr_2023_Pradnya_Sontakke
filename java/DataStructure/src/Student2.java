public class Student2 implements Comparable<Student2> {
    int rollNumber;
    String address;

    Student2() {

    }

    Student2(int rollNumber, String address) {
        this.rollNumber = rollNumber;
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int compareTo(Student2 s2) {

        if (s2.getAddress() == s2.getAddress())
            return 0;
//            else if(s2.getAddress()<s2.getAddress())
//                return -1;
//            else
//                return 1;
        return 1;
    }
}

