import java.util.Scanner;

public class Program40_DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to delete (0-based): ");
        int pos = sc.nextInt();

        int[] newArr = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pos) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.print("After deletion: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
