import java.util.Scanner;

public class Program48_AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                B[i][j] = sc.nextInt();

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", result[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
