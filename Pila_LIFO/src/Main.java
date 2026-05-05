public class Main {
    public static void main(String[] args) {

    Navegador navegador = new Navegador();

    navegador.push("google");
    navegador.push("youtube");

    navegador.peek();
    navegador.pop();
    navegador.peek();
    }
}