import java.util.Scanner;

public class Program24_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        // for each digit, raise it to the power of total digits
        while (num > 0) {
            int d = num % 10;
            sum = sum + (int) Math.pow(d, digits);
            num = num / 10;
        }

        // 153 = 1^3 + 5^3 + 3^3 = 153 (this is armstrong)
        if (original == sum) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
