import java.util.Scanner;

public class MatrixCreator {

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];

        int n = 3, m = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Validation to ensure user inputs integers
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter integers only.");
                    sc.next(); // Discard invalid input
                }
                matrix[i][j] = sc.nextInt();
            }
        }

        // Closing the Scanner object
        sc.close();

        System.out.println("The 3x3 matrix you entered:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

    