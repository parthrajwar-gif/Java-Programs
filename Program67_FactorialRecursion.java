import java.util.Scanner;

public class Program67_FactorialRecursion {

    static long factorial(int n) {
        // base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " = " + factorial(num));

        sc.close();
    }
}
