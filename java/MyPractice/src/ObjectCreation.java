public class ObjectCreation {
    String name;
    int id;
    public void display()
    {
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        ObjectCreation objectCreation=new ObjectCreation();
        objectCreation.display();
        System.out.println(objectCreation);
    }
}
