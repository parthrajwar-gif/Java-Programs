import java.util.Scanner;

public class Program11_DaysConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remaining = totalDays % 365;
        int weeks = remaining / 7;
        int days = remaining % 7;

        System.out.println(totalDays + " days = " + years + " years, " + weeks + " weeks, " + days + " days");

        sc.close();
    }
}
