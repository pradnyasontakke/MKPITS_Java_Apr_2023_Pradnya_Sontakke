public class PatternPrint {
    public static void main(String[] args) {
        char[][] pattern = new char[5][5];

        // Fill the pattern array with spaces
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Set the pattern
        int mid = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 5 - i; j++) {
                pattern[j][mid - i] = '*';
                pattern[j][mid + i] = '*';
            }
        }

        // Print the pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//This program uses a 2D char array pattern to store the pattern. First, it fills the entire array with spaces. Then, it uses nested loops to set the appropriate elements in the array to '*' based on the pattern you specified. Finally, it prints the pattern by looping over the array and printing each element.






