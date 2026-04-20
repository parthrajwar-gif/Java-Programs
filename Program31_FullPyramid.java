import java.util.Scanner;

public class Program31_FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // print spaces before stars
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // print stars for this row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
