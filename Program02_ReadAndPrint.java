import java.util.Scanner;

public class Program02_ReadAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("You entered integer: " + num);
        System.out.println("You entered float: " + f);
        System.out.println("You entered character: " + ch);

        sc.close();
    }
}
