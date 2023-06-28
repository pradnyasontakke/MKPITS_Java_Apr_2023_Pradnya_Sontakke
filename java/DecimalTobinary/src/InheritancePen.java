class Pen{
    String name;
    Integer Prize;
    String Type;
}
class Simplepen extends Pen{
    String color;
    Double height;
    Double width;
    public boolean pradnyaMethod1(){
        System.out.println("Pradnya's Baby Marriage");
        return false;
    }
}
    class  Gelpen extends Simplepen{
        String size;
        String Color;

        public boolean pradnyaMethod2(){
            System.out.println("Pradnya ka function");
            return false;
        }
        }

        class colourPen extends Gelpen{


    public boolean pradnyaMethod3(){
        System.out.println("Pradnya GrandChild Marriage");
        return false;
    }
        }
public class InheritancePen{
    public static void main(String args[]){
        Pen pen =new Pen();
        pen.name="natraj";
        Gelpen gelpen=new Gelpen();
        gelpen.width=2.4;
        gelpen.Prize=40;
        System.out.println(pen.name);
        System.out.println(gelpen.width);
        System.out.println(gelpen.Prize);

        colourPen cp = new colourPen();
        System.out.println(gelpen.pradnyaMethod1());
        System.out.println(cp.pradnyaMethod2());
        System.out.println(cp.pradnyaMethod3());

    }

}

