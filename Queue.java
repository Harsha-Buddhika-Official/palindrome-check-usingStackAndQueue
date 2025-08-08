public class Queue {
    private char[] arr;
    private int front, rear, size, count;

    public Queue(int size) {
        this.size = size;
        arr = new char[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char c) {
        if (count < size) {
            rear = (rear + 1) % size;
            arr[rear] = c;
            count++;
        }
    }

    public char dequeue() {
        if (!isEmpty()) {
            char c = arr[front];
            front = (front + 1) % size;
            count--;
            return c;
        }
        return '\0'; // return null character if empty
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
