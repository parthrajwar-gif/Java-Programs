import java.util.Scanner;

public class Program64_CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // using array of 128 size to cover all ASCII characters
        int[] freq = new int[128];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char) i + "' -> " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
