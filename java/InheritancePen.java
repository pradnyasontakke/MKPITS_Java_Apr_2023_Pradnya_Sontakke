class Pen{
    String name;
    int Prize;
    String Type;
}
class Simplepen extends Pen{
    String color;
    Double height;
    Double width;
    
}
    class  Gelpen extends Simplepen{
        String size;
        String Color;
		    int Prize;
        }

        class colourPen extends Gelpen{

        String colorOfpen;
    }
        
public class InheritancePen{
    public static void main(String args[]){
        Pen pen =new Pen();
        pen.name="natraj";
        Gelpen gelpen=new Gelpen();
        gelpen.width=2.4;
        gelpen.Prize= 400;
        System.out.println(pen.name);
        System.out.println(gelpen.width);
        System.out.println(gelpen.Prize);

        colourPen cp = new colourPen();
        System.out.println(cp.width);
       

    }

}

