import java.util.Scanner;

public class Program39_InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert (0-based): ");
        int pos = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        // make a bigger array
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.print("After insertion: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
