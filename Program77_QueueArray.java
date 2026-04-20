import java.util.Scanner;

public class Program77_QueueArray {

    static int[] queue = new int[100];
    static int front = 0;
    static int rear = 0;

    static void enqueue(int val) {
        if (rear >= 100) {
            System.out.println("Queue is full!");
        } else {
            queue[rear++] = val;
            System.out.println(val + " enqueued");
        }
    }

    static void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Dequeued: " + queue[front++]);
        }
    }

    static void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Queue using Array");
        System.out.println("1. Enqueue  2. Dequeue  3. Display  4. Exit");

        while (true) {
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                enqueue(sc.nextInt());
            } else if (ch == 2) {
                dequeue();
            } else if (ch == 3) {
                display();
            } else {
                break;
            }
        }

        sc.close();
    }
}
