public class Nodo {
    private Jugador dato;
    private Nodo siguiente;
    public static int tamano = -1;

    public Nodo(Jugador dato) {

        this.setDato( dato );
        Nodo.tamano++;

    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
