public class ListaProductos {
    private Nodo cabeza;

    public void insertarFinal(Producto producto){
        Nodo nuevo = new Nodo ( producto );

        if (this.cabeza == null) {
            this.cabeza = nuevo;
        }else{
            Nodo actual = this.cabeza;
            while( actual.getSiguiente () != null){
                actual = actual.getSiguiente ();
            }
            actual.setSiguiente ( nuevo );
        }

    }

    public void listar(){
        Nodo actual = this.cabeza;

        while(actual.getSiguiente () != null){
            System.out.println (actual.getDato ());
            actual = actual.getSiguiente ();
        }
    }

}
