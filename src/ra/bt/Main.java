package ra.bt;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.next = front; // Liên kết lại với chính nó trong trường hợp hàng đợi trống
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Cập nhật liên kết vòng
        }
    }

    public Integer deQueue() {
        if (isEmpty()) {
            return null; // Hàng đợi trống, không thể lấy ra
        } else {
            int value = front.data;

            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
                rear.next = front; // Cập nhật liên kết vòng
            }

            return value;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println("Dequeued item: " + queue.deQueue());
        System.out.println("Dequeued item: " + queue.deQueue());

        queue.enQueue(4);

        System.out.println("Dequeued item: " + queue.deQueue());
        System.out.println("Dequeued item: " + queue.deQueue());
    }
}
