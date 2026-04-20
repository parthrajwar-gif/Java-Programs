import java.util.Scanner;

public class Program57_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int minLen = Math.min(s1.length(), s2.length());
        int diff = 0;

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (diff == 0) {
            diff = s1.length() - s2.length();
        }

        if (diff == 0) {
            System.out.println("Both strings are Equal");
        } else if (diff < 0) {
            System.out.println("String 1 comes before String 2");
        } else {
            System.out.println("String 1 comes after String 2");
        }

        sc.close();
    }
}
