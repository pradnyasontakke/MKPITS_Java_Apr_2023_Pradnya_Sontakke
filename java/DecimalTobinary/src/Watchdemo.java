class Watch{
    public String Direction;
    String dial;
    Double width;
    Double size;
    class DigitalWatch extends Watch{
        String Direction;
        Integer CountHeartBeat;
        class Smartwatch extends DigitalWatch{
            String music;
            Double height;

        }

    }
}
public class Watchdemo {
    public static void main(String[] args) {
       Watch watch=new Watch();
       watch.Direction="north";
       Flower flower=new Flower();
        flower.FlowerType="small";
        Rose rose=new Rose();
        rose.FlowerColor="pink";



        System.out.println(watch.Direction);
        System.out.println(flower.FlowerType);
        System.out.println(rose.FlowerColor);

    }
}
