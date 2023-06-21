public class Main {
    public static void main(String[] args) {
        //plant
        Plant plant = new Herbs();
        System.out.println(plant.plantDemo(4, 2));

        //Addition
        Addition addition = new Addition1();
        System.out.println(addition.additionDemo(2.9F, 8.9f));

        //substraction
        Substraction substraction = new Substraction1();
        System.out.println(substraction.substractionDemo(26, 8));

        //multiple
        Multiplication multiplication = new Multiplication1();
        System.out.println(multiplication.multiDemo(42, 88));

        //division
        Division division = new Division1();
        System.out.println(division.divisionDemo(40, 4));
        //notes
        Notes notes = new Note1();
        System.out.println(notes.noteDemo(50, 500));

//people
        People people=new PeopleDemo();
        System.out.println(people.total(500,6000));

        //birds
        Birds birds=new Birds();
        System.out.println(birds.total(3987560,5087540));

        //house
        House house=new Rawhouse();
        System.out.println(house.TotalHouse(500,789));

        //ring
        Ring ring=new Ring();
        System.out.println(ring.totalPrize(34567,6748));
    }
}




