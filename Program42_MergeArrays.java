import java.util.Scanner;

public class Program42_MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter elements: ");
        for (int i = 0; i < size1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter elements: ");
        for (int i = 0; i < size2; i++) arr2[i] = sc.nextInt();

        // merged array has size = size1 + size2
        int[] merged = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = arr2[i];
        }

        System.out.print("Merged Array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
