public class Queue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("enqueue(" + value + ") → Cola llena, no se puede agregar");
            return;
        }
        rear = (rear + 1) % capacity;
        items[rear] = value;
        size++;
        System.out.println("enqueue(" + value + ") → Agregado a la cola");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("dequeue() → La cola está vacía");
            return -1;
        }
        int value = items[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("dequeue() → Eliminado (out): " + value);
        return value;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("front() → La cola está vacía");
            return -1;
        }
        return items[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.println("→ (entrada)");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print("| " + items[index] + " |  ");
        }
        System.out.println("\n→ (salida)");
    }
}