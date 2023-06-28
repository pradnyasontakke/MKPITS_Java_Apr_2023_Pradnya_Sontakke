
class Flower{
    String Leafcolor;
    String FlowerType;
}
class Rose extends Flower{
    String FlowerColor;
    Integer numberofrose;
}

public class FlowerDemo {

    public static void main(String[] args) {
        Flower flower=new Flower();
        flower.Leafcolor="green";
        flower.FlowerType="small";
        Rose rose=new Rose();
        rose.FlowerColor="pink";
        rose.numberofrose=5;

        System.out.println(flower.Leafcolor);
        System.out.println(flower.FlowerType);
        System.out.println(rose.FlowerColor);
        System.out.println(rose.FlowerColor);

    }
}



