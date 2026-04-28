public class Main {
    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1: PILA (STACK) ===\n");

        Stack stack = new Stack(10);

        // Operaciones push
        System.out.println("--- Insertando elementos ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\n--- Estado de la pila ---");
        stack.display();

        // Operaciones pop y peek
        System.out.println("\n--- Aplicando pop() y peek() ---");
        stack.pop();

        System.out.println("\n--- Estado después del pop() ---");
        stack.display();

        stack.peek();

        System.out.println("\n--- Estado final ---");
        stack.display();
    }
}