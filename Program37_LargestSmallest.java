import java.util.Scanner;

public class Program37_LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // assume first element is both largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}
