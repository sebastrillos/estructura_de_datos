public class Nodo {
    private Producto dato;
    private Nodo siguiente;

    public Nodo(Producto dato) {
        this.setDato ( dato );
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
