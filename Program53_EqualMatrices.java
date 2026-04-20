import java.util.Scanner;

public class Program53_EqualMatrices {
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

        boolean equal = true;

        if (r1 != r2 || c1 != c2) {
            equal = false;
        } else {
            for (int i = 0; i < r1 && equal; i++) {
                for (int j = 0; j < c1; j++) {
                    if (A[i][j] != B[i][j]) {
                        equal = false;
                        break;
                    }
                }
            }
        }

        if (equal) {
            System.out.println("Both matrices are Equal");
        } else {
            System.out.println("Matrices are not Equal");
        }

        sc.close();
    }
}
