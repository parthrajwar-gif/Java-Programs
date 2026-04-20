public class Program66_CallByDemo {

    // call by value - changes won't affect original variable
    static void changeValue(int x) {
        x = 999;
        System.out.println("Inside function (value): " + x);
    }

    // call by reference - changes WILL affect original array
    static void changeArray(int[] arr) {
        arr[0] = 999;
        System.out.println("Inside function (reference): arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        // testing call by value
        int num = 10;
        System.out.println("Before call by value: " + num);
        changeValue(num);
        System.out.println("After call by value: " + num);   // still 10

        System.out.println();

        // testing call by reference
        int[] arr = {10, 20, 30};
        System.out.println("Before call by reference: arr[0] = " + arr[0]);
        changeArray(arr);
        System.out.println("After call by reference: arr[0] = " + arr[0]);  // changed
    }
}
