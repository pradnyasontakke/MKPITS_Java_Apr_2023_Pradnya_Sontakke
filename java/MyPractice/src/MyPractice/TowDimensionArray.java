package MyPractice;
//create a class
public class TowDimensionArray {
    //method define
    public  void twoDim() {
        //list of 2d array element
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //first for loop for the

        for (int counter = 0; counter < array.length; counter++) {

            for (int counterc = 0; counterc < array.length; counterc++) {
                System.out.print(array[counter][counterc]+ " ");
            }
            System.out.println();
        }
    }

}
