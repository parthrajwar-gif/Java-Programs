import java.util.Scanner;

public class Program71_PowerRecursion {

    static double power(double base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp < 0) {
            return 1.0 / power(base, -exp);
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        System.out.println(base + " ^ " + exp + " = " + power(base, exp));

        sc.close();
    }
}
