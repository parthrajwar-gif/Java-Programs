import java.util.Scanner;

public class Program70_ReverseSentence {

    static void printReversed(String[] words, int index) {
        if (index < 0) return;

        System.out.print(words[index]);
        if (index > 0) System.out.print(" ");

        printReversed(words, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.print("Reversed sentence: ");
        printReversed(words, words.length - 1);
        System.out.println();

        sc.close();
    }
}
