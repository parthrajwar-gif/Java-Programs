import java.util.Scanner;

public class Program12_AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // casting char to int gives ASCII value
        int ascii = (int) ch;

        System.out.println("ASCII value of '" + ch + "' = " + ascii);

        sc.close();
    }
}
