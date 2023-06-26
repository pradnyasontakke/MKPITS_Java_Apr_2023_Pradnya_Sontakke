public class DoWhileExample {
    static int Number;
    public static void main(String[] args) {
        DoWhileExample doWhileExample=new DoWhileExample();
        System.out.println("enter 0 to exit");
        do {
            System.out.println("enter your number");
            Number=doWhileExample.nextInt();
            System.out.println("you enter "+ Number);

        }while (Number!=0);

    }

    private int nextInt() {
        return 0;
    }
}
