import java.util.Scanner;

public class Program69_TowerOfHanoi {

    // move n disks from src to dest using aux as helper
    static void hanoi(int n, char src, char dest, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        // move top n-1 disks to aux
        hanoi(n - 1, src, aux, dest);

        // move the bottom disk to dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // move the n-1 disks from aux to dest
        hanoi(n - 1, aux, dest, src);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("Steps to solve Tower of Hanoi with " + n + " disk(s):");
        hanoi(n, 'A', 'C', 'B');

        sc.close();
    }
}
