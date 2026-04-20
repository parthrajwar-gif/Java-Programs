import java.util.Scanner;

public class Program44_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " not found in array");
        }

        sc.close();
    }
}
