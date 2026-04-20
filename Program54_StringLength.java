import java.util.Scanner;

public class Program54_StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // manually count using a loop
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            len++;
        }

        System.out.println("Length of string = " + len);

        sc.close();
    }
}
