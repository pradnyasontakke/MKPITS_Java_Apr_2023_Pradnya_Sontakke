public class ArrayOfEmptyDiamond
{
    public static void main(String[] args) {
        int Array[][]=new int[7][7];

        int middle = Array.length / 2;

        for (int row = 0; row < Array.length; row++) {
            for (int col = 0; col < Array.length; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == middle - (Array.length - 1 - row) || col == middle + (Array.length - 1 - row)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}