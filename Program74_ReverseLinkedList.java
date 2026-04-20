import java.util.Scanner;

public class Program74_ReverseLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node head = null;

    static void insert(int val) {
        Node n = new Node(val);
        if (head == null) { head = n; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
    }

    static void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;  // save next
            curr.next = prev;           // flip the pointer
            prev = curr;
            curr = nextNode;
        }

        head = prev;  // new head is what was the last node
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many nodes to add? ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        System.out.print("Before reverse - ");
        display();

        reverse();

        System.out.print("After reverse  - ");
        display();

        sc.close();
    }
}
