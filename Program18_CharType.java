import java.util.Scanner;

public class Program18_CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Character");
        }

        sc.close();
    }
}
