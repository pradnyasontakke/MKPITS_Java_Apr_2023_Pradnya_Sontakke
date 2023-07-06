public class SumOfSquareOfArray {
    //declare array elements

    int array[]={12,23,34,45,56,78,89,13,25,47,12,23,23,34,45,56,54,47,67,78,12,23,34,
                  45,56,78,89,13,25,47,12,23,23,34,45,56,54,47,67,78};
    //method declaration
    public int sumOfSquare() {

        int sum = 0;
        //for loop start with 4 location and calculate total lenght and increment after fourt position
        for (int counter = 4; counter < array.length; counter += 4) {
            if (counter % 4 == 0) {
                //sum of square of the element
                sum = sum + (array[counter - 1] * array[counter - 1]);
                //print list array element
                System.out.println(  array[counter - 1]);

            }
        }
        //print output
        System.out.println("Sum of square of all array "  );
        return sum;
    }

}
