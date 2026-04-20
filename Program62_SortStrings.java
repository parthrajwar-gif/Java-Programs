import java.util.Scanner;

public class Program62_SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many strings do you want to sort? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // bubble sort on strings using compareTo
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
