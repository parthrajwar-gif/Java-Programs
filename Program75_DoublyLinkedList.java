import java.util.Scanner;

public class Program75_DoublyLinkedList {

    static class DNode {
        int data;
        DNode prev;
        DNode next;

        DNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static DNode head = null;

    static void insert(int val) {
        DNode newNode = new DNode(val);

        if (head == null) {
            head = newNode;
        } else {
            DNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println(val + " inserted");
    }

    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DNode temp = head;
        DNode tail = null;

        System.out.print("Forward:  ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" <-> ");
            tail = temp;
            temp = temp.next;
        }
        System.out.println(" -> NULL");

        System.out.print("Backward: ");
        while (tail != null) {
            System.out.print(tail.data);
            if (tail.prev != null) System.out.print(" <-> ");
            tail = tail.prev;
        }
        System.out.println(" -> NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Doubly Linked List");
        System.out.println("1. Insert  2. Display  3. Exit");

        while (true) {
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                insert(sc.nextInt());
            } else if (ch == 2) {
                display();
            } else {
                break;
            }
        }

        sc.close();
    }
}
