import java.util.Scanner;

public class Program32_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // upper half of diamond
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        // lower half of diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int s = 1; s <= rows - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
