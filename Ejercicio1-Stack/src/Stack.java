public class Stack {
    private int[] items;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("push(" + value + ") → Pila llena, no se puede agregar");
            return;
        }
        items[++top] = value;
        System.out.println("push(" + value + ") → Agregado a la pila");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("pop() → La pila está vacía");
            return -1;
        }
        int value = items[top--];
        System.out.println("pop() → Eliminado: " + value);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("peek() → La pila está vacía");
            return -1;
        }
        System.out.println("peek() → Tope actual: " + items[top]);
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return;
        }
        System.out.println("← top");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + items[i] + " |");
        }
        System.out.println("-------");
    }
}
