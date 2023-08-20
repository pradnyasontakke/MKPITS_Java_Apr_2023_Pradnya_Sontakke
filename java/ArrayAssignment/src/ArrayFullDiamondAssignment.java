import java.util.Scanner;

public class ArrayFullDiamondAssignment {
    public static void main(String[] args) {
        //declare array
        int TotalArray[][] = new int[9][9];
       //find middle value
        int middle = TotalArray.length / 2;
      //
        for (int row = 0; row < TotalArray.length; row++) {
            for (int col = 0; col < TotalArray.length; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                    if (col == middle - (middle - 1 - row) || col == middle + (middle - 1 - row)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
