import java.util.Scanner;

public class Program27_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);  // add last digit to sum
            num = num / 10;          // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
