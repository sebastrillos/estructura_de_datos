public class ListaRanking {
    private Nodo cabeza;
    public static int numeroJugadores = 0;
    public int rankingMaximo = 101;

    public ListaRanking() {
        this.cabeza = null;
    }

    public void insertarfinal(Jugador jugardor){
        Nodo nuevo = new Nodo(jugardor);

        if (this.cabeza == null) {
            cabeza = nuevo;
        }else{
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual =actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }

    }

    public Jugador buscar (String nombre){
        Nodo actual = this.cabeza;

        while ( actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)){
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void listar() {
        Nodo actual = cabeza;

        while(actual != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
            ListaRanking.numeroJugadores++;
        }
    }

    public Jugador rankingMaximo (){
        Nodo actual = this.cabeza;
        int rankingMaximo = 0;
        Jugador maximoJugador = null;

        while (actual != null){
            if (actual.getDato().getRanking() < this.rankingMaximo){
                rankingMaximo = actual.getDato().getRanking();
                maximoJugador = actual.getDato();
            }
            actual = actual.getSiguiente();
        }

        /**while ( actual != null) {
            if (actual.getDato().getRanking() == rankingMaximo){
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        } */
        return maximoJugador;
    }

    public void ordenarMayorMenor() {

        Nodo actual = cabeza;

        while(actual != null) {

            Nodo mayor = actual;
            Nodo temp = actual.getSiguiente();

            while(temp != null) {

                if(temp.getDato().getRanking() > mayor.getDato().getRanking()) {
                    mayor = temp;
                }

                temp = temp.getSiguiente();
            }

            int aux = actual.getDato().getRanking();
            actual.setDato(mayor.getDato());
            mayor.getDato().setRanking(aux);

            actual = actual.getSiguiente();
        }
    }

    public void buscarRepetidos(){
        Nodo actual = cabeza;

        while (actual != null){
            Nodo comparar = actual.getSiguiente();

            while (comparar != null){
                if (actual.getDato().getRanking() == comparar.getDato().getRanking()){
                    if (actual.getDato().getTipo() == comparar.getDato().getTipo()){
                        if (actual.getDato().getNombre() == comparar.getDato().getNombre()){
                            System.out.println(actual.getDato());
                        }
                    }
                }
                comparar = comparar.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
    }

    public Jugador nodoMedio () {
        Nodo actual = this.cabeza;
        Jugador medio = null;
        int mitad = Nodo.tamano / 2 ;

        for (int i = 0; i <= mitad; i++) {
            medio = actual.getDato();
            actual = actual.getSiguiente();
        }

        return medio;
    }



}
