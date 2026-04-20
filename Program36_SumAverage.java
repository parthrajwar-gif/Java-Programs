import java.util.Scanner;

public class Program36_SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
