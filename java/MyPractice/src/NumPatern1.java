import java.util.Scanner;

public class NumPatern1 {
    public void numberPattern(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=scanner.nextInt();
        for (int row=1;row<=5;row++){
            for (int column=1;column<=row;column++){
                System.out.print(column);
            }
            System.out.println();

        }
    }

}
