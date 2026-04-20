import java.util.Scanner;

public class Program76_StackArray {

    static int[] stack = new int[100];
    static int top = -1;

    static void push(int val) {
        if (top >= 99) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = val;
            System.out.println(val + " pushed");
        }
    }

    static void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    static void peek() {
        if (top < 0) System.out.println("Stack is empty");
        else System.out.println("Top = " + stack[top]);
    }

    static void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stack using Array");
        System.out.println("1. Push  2. Pop  3. Peek  4. Display  5. Exit");

        while (true) {
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                push(sc.nextInt());
            } else if (ch == 2) {
                pop();
            } else if (ch == 3) {
                peek();
            } else if (ch == 4) {
                display();
            } else {
                break;
            }
        }

        sc.close();
    }
}
