import java.util.Scanner;

public class Program19_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long result = 1;

        // multiply from 1 up to n
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println("Factorial of " + n + " = " + result);

        sc.close();
    }
}
