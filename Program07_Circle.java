import java.util.Scanner;

public class Program07_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // area = pi * r * r
        double area = Math.PI * r * r;

        // circumference = 2 * pi * r
        double circum = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circum);

        sc.close();
    }
}
