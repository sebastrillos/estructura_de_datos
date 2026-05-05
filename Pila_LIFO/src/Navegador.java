import java.util.Stack;

public class Navegador {
    private Stack<String> historial;

    public Navegador() {
        this.historial = new Stack<>();
    }

    public void push(String pagina){
        this.historial.push(pagina);
    }

    public void pop() {
        if (historial.size() > 1) {
            this.historial.pop();
        }else {
            System.out.println("No hay paginas!!");
        }
    }

    public void peek() {
        if (!historial.isEmpty()){
            System.out.println("Pagina actual: " + this.historial.peek());
        } else {
            System.out.println("No hay paginas");
        }
    }
}
