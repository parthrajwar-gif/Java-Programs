import java.util.Scanner;

public class Program73_SinglyLinkedList {

    // each node stores data and a pointer to next node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(val + " inserted");
    }

    static void delete(int val) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == val) {
            head = head.next;
            System.out.println(val + " deleted");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(val + " not found");
        } else {
            temp.next = temp.next.next;
            System.out.println(val + " deleted");
        }
    }

    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Singly Linked List");
        System.out.println("1. Insert  2. Delete  3. Display  4. Exit");

        while (true) {
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                insert(sc.nextInt());
            } else if (ch == 2) {
                System.out.print("Enter value to delete: ");
                delete(sc.nextInt());
            } else if (ch == 3) {
                display();
            } else {
                break;
            }
        }

        sc.close();
    }
}
