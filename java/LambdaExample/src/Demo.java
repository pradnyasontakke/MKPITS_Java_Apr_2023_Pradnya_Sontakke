interface AnonymousClass {
    void display1();

}
public class  Demo {
    public static void main(String[] args) {
                   //This us anonymous class means empty class
        AnonymousClass anonymousClass = new AnonymousClass() {
            @Override
            public void display1() {
                System.out.println("this is the anonymous class");
            }
        };
        anonymousClass.display1();

        //using lambda

        Runnable runnable=new Runnable() {

    @Override
    public void run() {
       System.out.println("this is runnable method");

   }
};
        runnable.run();
//lambda class
        AnonymousClass anonymousClass1=()->
                System.out.println("this is the lambda class example ");
        anonymousClass1.display1();
    }

}
