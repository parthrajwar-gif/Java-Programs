import java.util.Scanner;

public class Program16_QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // equation is: ax^2 + bx + c = 0
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // discriminant decides how many roots we have
        double disc = b * b - 4 * a * c;

        if (disc > 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2 * a);
            double r2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (disc == 0) {
            double r = -b / (2 * a);
            System.out.println("Equal roots: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-disc) / (2 * a);
            System.out.println("Complex roots:");
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }

        sc.close();
    }
}
