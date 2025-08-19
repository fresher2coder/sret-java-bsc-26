package dsa.queue.linkedList;

public class Queue {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    void enQueue(int val) {
        Node newNode = new Node(val);

        if (this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }

        size++;
    }

    int deQueue() {
        if (this.front == null) {
            return -1;
        }

        int temp = this.front.data;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        size--;
        return temp;
    }

    int rear() {
        if (this.rear == null) {
            return -1;
        }

        return this.rear.data;
    }

    int front() {
        if (this.front == null) {
            return -1;
        }

        return this.front.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        // Since it's a linked list implementation, the queue is never full.
        return false;
    }
}
