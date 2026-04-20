import java.util.Scanner;

public class Program68_GcdRecursion {

    static int gcd(int a, int b) {
        // base case
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));

        sc.close();
    }
}
