import java.util.Scanner;

public class Program49_MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols for Matrix A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] A = new int[r1][c1];
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.print("Enter rows and cols for Matrix B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] B = new int[r2][c2];
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("%5d", result[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
