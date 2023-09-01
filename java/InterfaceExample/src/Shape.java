public interface Shape {
    String color="pink";
    int size=10;
    void CalArea();
    default void displayColor(){
        System.out.println(color);
    }
    static void displaySize()
    {

//        System.out.println(size);
    }
}
