public class Main {
    public static void main(String[] args) {
        ListaRanking lista = new ListaRanking();

        lista.insertarfinal(new Jugador("jordin", "soporte", 85));
        lista.insertarfinal(new Jugador("jordin", "corredor", 90));
        lista.insertarfinal(new Jugador("jordin", "campero", 85));
        lista.insertarfinal(new Jugador("jordin", "hacker", 85));
        lista.insertarfinal(new Jugador("jordin", "espaldero", 85));
        lista.insertarfinal(new Jugador("jordin", "cacorro", 85));
        lista.insertarfinal(new Jugador("jordin", "petro", 85));
        lista.insertarfinal(new Jugador("jordin", "uribe", 85));
        lista.insertarfinal(new Jugador("jordin", "santos", 85));
        lista.insertarfinal(new Jugador("jordin", "trump tu papa", 85));
        lista.insertarfinal(new Jugador("jordin", "trump tu papa", 85));
        System.out.println("repetido");
        lista.buscarRepetidos();
        System.out.println("buscar" + lista.buscar("jordin"));

        System.out.println("maximo" + lista.rankingMaximo());

        System.out.println("lista");
        lista.listar();

        System.out.println("ordena");
        lista.ordenarMayorMenor();
        System.out.println("lista");
        lista.listar();

        System.out.println("\n" + lista.nodoMedio());
    }
}