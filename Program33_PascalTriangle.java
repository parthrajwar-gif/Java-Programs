import java.util.Scanner;

public class Program33_PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // print spaces for alignment
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }

            long val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
