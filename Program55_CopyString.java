import java.util.Scanner;

public class Program55_CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // copy character by character
        char[] copy = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            copy[i] = str.charAt(i);
        }

        String copied = new String(copy);
        System.out.println("Copied string = " + copied);

        sc.close();
    }
}
