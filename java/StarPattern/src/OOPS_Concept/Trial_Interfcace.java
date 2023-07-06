package OOPS_Concept;

interface Exam1{

    void paper1();

    void paper2();
}
interface Exam3{

    void paper3();
}
class Exam2 implements Exam1 ,Exam3{


    @Override
    public void paper1() {
        System.out.println("Method 1");
    }

    @Override
    public void paper2() {
        System.out.println("Method 2");
    }

    @Override
    public void paper3() {

    }
}
public class Trial_Interfcace {

    public static void main(String[] args) {

        Exam2 exam2 = new Exam2();

        exam2.paper1();
        exam2.paper2();

    }
}
