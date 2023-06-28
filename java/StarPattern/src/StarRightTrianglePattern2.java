import java.util.Scanner;

public class StarRightTrianglePattern2 extends SwitchAllClasses {

        public void rightTriangle() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the rows for pattern 2 ");

            int rows = scanner.nextInt();
            {
                for (int row = 1; row <= rows; row++) {
                    for (int column = rows; column >= row; column--)
                    {
                        System.out.print("*");
                    }

                    System.out.println(" ");
                }

            }
        }}

