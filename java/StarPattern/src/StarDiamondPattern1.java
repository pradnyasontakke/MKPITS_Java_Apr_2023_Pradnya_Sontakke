import java.util.Scanner;
public class StarDiamondPattern1 extends SwitchAllClasses {
    public void starDiamond(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows of pattern1");
        int rows=scanner.nextInt();{

            for (int row = 1; row <= rows; row++) {
                for (int space=rows;space>=row;space--) {
                    System.out.print(" ");
                }
                    for (int column =1; column <= row; column++) {
                        System.out.print(" *");
                    }

                    System.out.println(" ");
                }

            for (int row = 1; row <= rows-1; row++) {
                for (int space=0;space<=row;space++) {
                    System.out.print(" ");
                }
                for (int column =0; column <= rows-1-row; column++) {
                    System.out.print(" *");
                }

                System.out.println(" ");
            }

    }

}}