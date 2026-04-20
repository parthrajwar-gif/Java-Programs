import java.util.Scanner;

public class Program82_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        // keep checking the last bit and shift right
        while (temp != 0) {
            if ((temp & 1) == 1) {
                count++;
            }
            temp = temp >> 1;
        }

        System.out.println("Number of set bits (1s) in " + num + " = " + count);
        System.out.println("Binary: " + Integer.toBinaryString(num));

        sc.close();
    }
}
