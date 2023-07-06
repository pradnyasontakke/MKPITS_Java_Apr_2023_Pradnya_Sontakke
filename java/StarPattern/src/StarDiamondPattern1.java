import java.util.Scanner;
public class StarDiamondPattern1 extends SwitchAllClasses {
    public void starDiamond(){
        //output from user
        Scanner scanner=new Scanner(System.in);
        //show what u want from user
        System.out.println("Enter the rows of pattern1");
        //scan and print what data type u want
        int rows=scanner.nextInt();{
          //row start with 1,and check row less than total element, and increment
            for (int row = 1; row <= rows; row++) {
                //check space is depend on
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
               // for (int column =0; column <= rows-1-row; column++) {
                for(int column=rows-1;column>=row;column--){
                    System.out.print(" *");
                }

                System.out.println(" ");
            }

    }

}}