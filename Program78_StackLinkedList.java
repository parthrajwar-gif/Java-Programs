import java.util.Scanner;

public class Program78_StackLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node top = null;

    static void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val + " pushed");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    static void peek() {
        if (top == null) System.out.println("Stack is empty");
        else System.out.println("Top = " + top.data);
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.print("Stack: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stack using Linked List");
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
