public class Main {
    public static void main(String[] args) {
        Movie movie=new Movie();
        System.out.println(movie.IndianMovie("adipurush","prabhas"));
        System.out.println(movie.IndianMovie("adipurush","prabhas",400));


        War fighter = new War();
        System.out.println(fighter.myFight("hands", "legs"));
        System.out.println(fighter.myFight("stick", "bomb", "bottles"));
        System.out.println(fighter.myFight("shoes", "Ak47", "badiMaa", "badebaap"));


        Modulus modulus=new Modulus();
        System.out.println(modulus.demoModulus(4,12));
        System.out.println(modulus.demoModulus(4.2,12.2));

        Shoose shoose=new Shoose();
        System.out.println(shoose.shooseDemo(4,2));
        System.out.println(shoose.shooseDemo(422.30,2.1));

        Bag bag=new Bag();
        System.out.println(bag.BagDemo(45777));
        System.out.println(bag.BagDemo(45777,4.9));

        Area area = new Area();
        System.out.println(area.areaNew3(3));
        System.out.println(area.areaNew3(5,7.8F));



        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.rectangleDemo(23,68));
        System.out.println(rectangle.rectangleDemo((int) 2.3,689));


        Mobile mobile=new Mobile();
        System.out.println(mobile.mobileDemo(25788));
        System.out.println(Mobile.mobileDemo(2389876,34566777));

        Addition addition=new Addition();
        System.out.println(addition.demoAddition(4,12));
        System.out.println(addition.demoAddition((int) 4.5, (int) 4.67));




    }
}