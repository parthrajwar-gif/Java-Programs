import java.util.Scanner;

public class Program45_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array must be sorted for binary search to work
        System.out.print("Enter size of sorted array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int foundAt = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                foundAt = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (foundAt != -1) {
            System.out.println(key + " found at index " + foundAt);
        } else {
            System.out.println(key + " not found");
        }

        sc.close();
    }
}
