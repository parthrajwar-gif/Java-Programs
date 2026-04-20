import java.util.Scanner;

public class Program81_ToggleNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter bit position to toggle: ");
        int pos = sc.nextInt();

        // XOR with 1 at position pos flips that bit
        int result = num ^ (1 << pos);

        System.out.println("Original: " + num + "  -> binary: " + Integer.toBinaryString(num));
        System.out.println("Toggled:  " + result + "  -> binary: " + Integer.toBinaryString(result));

        sc.close();
    }
}
