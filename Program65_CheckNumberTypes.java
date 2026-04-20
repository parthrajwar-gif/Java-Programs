import java.util.Scanner;

public class Program65_CheckNumberTypes {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += (int) Math.pow(d, digits);
            n /= 10;
        }
        return original == sum;
    }

    static boolean isPerfect(int n) {
        // a number whose divisors (not including itself) add up to it
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Prime     : " + isPrime(num));
        System.out.println("Is Armstrong : " + isArmstrong(num));
        System.out.println("Is Perfect   : " + isPerfect(num));

        sc.close();
    }
}
