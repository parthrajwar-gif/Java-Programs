import java.util.Scanner;

public class Program05_TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            // formula: F = (C * 9/5) + 32
            double f = (temp * 9 / 5) + 32;
            System.out.println(temp + " Celsius = " + f + " Fahrenheit");
        } else if (choice == 2) {
            // formula: C = (F - 32) * 5/9
            double c = (temp - 32) * 5 / 9;
            System.out.println(temp + " Fahrenheit = " + c + " Celsius");
        } else {
            System.out.println("Wrong choice entered");
        }

        sc.close();
    }
}
