import java.util.Scanner;

public class Program15_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // convert to lowercase to make comparison easier
        char lower = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet");
        } else if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }

        sc.close();
    }
}
