import java.util.Scanner;

public class Program56_ConcatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // manually concatenate using char array
        char[] result = new char[s1.length() + s2.length()];
        int idx = 0;

        for (int i = 0; i < s1.length(); i++) {
            result[idx++] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            result[idx++] = s2.charAt(i);
        }

        System.out.println("Concatenated = " + new String(result));

        sc.close();
    }
}
