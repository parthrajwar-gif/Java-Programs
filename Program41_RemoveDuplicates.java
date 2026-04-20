import java.util.Scanner;

public class Program41_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyIn = false;

            for (int k = 0; k < count; k++) {
                if (result[k] == arr[i]) {
                    alreadyIn = true;
                    break;
                }
            }

            if (!alreadyIn) {
                result[count] = arr[i];
                count++;
            }
        }

        System.out.print("Without duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
