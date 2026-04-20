import java.util.Scanner;

public class Program43_RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        System.out.print("Enter positions to rotate (positive = right, negative = left): ");
        int k = sc.nextInt();
        int n = arr.length;

        // normalize k so it doesn't go out of bounds
        k = ((k % n) + n) % n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.print("After rotation: ");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
