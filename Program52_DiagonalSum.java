import java.util.Scanner;

public class Program52_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int mainSum = 0;
        int antiSum = 0;

        for (int i = 0; i < n; i++) {
            mainSum += mat[i][i];           // top-left to bottom-right
            antiSum += mat[i][n - 1 - i];   // top-right to bottom-left
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Anti diagonal sum = " + antiSum);

        sc.close();
    }
}
