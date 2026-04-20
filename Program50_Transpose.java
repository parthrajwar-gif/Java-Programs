import java.util.Scanner;

public class Program50_Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();

        // transposed matrix has rows and cols swapped
        int[][] t = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = mat[i][j];
            }
        }

        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%5d", t[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
