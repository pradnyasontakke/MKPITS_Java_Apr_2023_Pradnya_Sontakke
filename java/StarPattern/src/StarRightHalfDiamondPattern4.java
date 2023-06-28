import java.util.Scanner;

public class StarRightHalfDiamondPattern4 {
    public void starHalfDiamond(){  //create method
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows for pattern4");

        int rows=scanner.nextInt();

        for (int row=1;row<=rows;row++)//print rows for first half
        {
            for (int column=1;column<=row;column++) //print column for first half
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row=1;row<=rows;row++)   //second half decreasing
        {
         for (int column=rows;column>=row;column--)
         {
             System.out.print("*");
         }
            System.out.println();
        }
    }
}
