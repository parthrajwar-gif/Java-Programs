import java.util.Scanner;

public class Program80_CheckNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter bit position to check (0 = rightmost): ");
        int pos = sc.nextInt();

        // shift right by pos positions and check last bit
        if (((num >> pos) & 1) == 1) {
            System.out.println("Bit " + pos + " of " + num + " is SET (1)");
        } else {
            System.out.println("Bit " + pos + " of " + num + " is NOT SET (0)");
        }

        sc.close();
    }
}
