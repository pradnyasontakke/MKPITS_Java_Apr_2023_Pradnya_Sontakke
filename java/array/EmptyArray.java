public class EmptyArray {
    public static void main(String[] args) {
        char[][] pattern = new char[5][5];

        // Initialize array with empty spaces
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Fill array with asterisks
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 2 || i + j == 4 || Math.abs(i - j) == 2) {
                    pattern[i][j] = '*';
                }
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