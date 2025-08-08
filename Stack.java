public class Stack {
    private char[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    public void push(char c) {
        if (top < size - 1) {
            arr[++top] = c;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return arr[top--];
        }
        return '\0'; // return null character if empty
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
