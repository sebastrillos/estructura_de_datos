public class Main {
    public static void main(String[] args) {
        String exp1 = "((a+b)*5) - 7";
        String exp2 = "2*[(a+b)/2.5 + x - 7*y";

        System.out.println("Expresión 1 equilibrada: " + VerificarExprecion.estaEquilibrado(exp1)); // true
        System.out.println("Expresión 2 equilibrada: " + VerificarExprecion.estaEquilibrado(exp2)); // false
    }
}