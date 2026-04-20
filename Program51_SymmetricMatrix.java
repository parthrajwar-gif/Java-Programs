import java.util.Scanner;

public class Program51_SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        // symmetric means mat[i][j] == mat[j][i] for all i,j
        boolean sym = true;
        for (int i = 0; i < n && sym; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[j][i]) {
                    sym = false;
                    break;
                }
            }
        }

        if (sym) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is not Symmetric");
        }

        sc.close();
    }
}
