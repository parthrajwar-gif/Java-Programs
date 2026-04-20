import java.util.Scanner;

public class Program25_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            // find factorial of this digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        // 145 = 1! + 4! + 5! = 145 (strong number)
        if (original == sum) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is not a Strong number");
        }

        sc.close();
    }
}
