import java.util.Scanner;

public class Program06_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate of interest (in %): ");
        double r = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();

        // simple interest formula
        double si = (p * r * t) / 100;

        // compound interest formula
        double ci = p * Math.pow(1 + r / 100, t) - p;

        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);

        sc.close();
    }
}
