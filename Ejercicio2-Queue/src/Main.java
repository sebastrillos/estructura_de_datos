public class Main{
    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 2: COLA (QUEUE) ===\n");

        Queue queue = new Queue(10);

        // Operaciones enqueue
        System.out.println("--- Insertando elementos ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("\n--- Estado de la cola ---");
        queue.display();

        // Operación dequeue
        System.out.println("\n--- Aplicando dequeue() ---");
        queue.dequeue();

        System.out.println("\n--- Estado final ---");
        queue.display();
    }
}