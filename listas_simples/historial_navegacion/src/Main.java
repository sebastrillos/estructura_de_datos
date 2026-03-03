public class Main {
    public static void main(String[] args) {
        SistemaNavegacion lista = new SistemaNavegacion();

        lista.insertarfinal(new Pagina("Google", "https://www.google.com"));
        lista.insertarfinal(new Pagina("YouTube", "https://www.youtube.com"));
        lista.insertarfinal(new Pagina("Wikipedia", "https://www.wikipedia.org"));

    }
}