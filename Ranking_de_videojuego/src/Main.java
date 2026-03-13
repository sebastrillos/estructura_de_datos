public class Main {
    public static void main(String[] args) {
        ListaRanking lista = new ListaRanking();

        lista.insertarfinal(new Jugador("jordin", "soporte", 85));
        lista.insertarfinal(new Jugador("jordin", "soporte", 85));
        lista.insertarfinal(new Jugador("jordin", "corredor", 90));
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
    }
}