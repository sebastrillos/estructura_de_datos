import java.util.*;

public class VerificarExprecion {

    public static boolean estaEquilibrado (String exprecion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < exprecion.length(); i++) {
            char c = exprecion.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()){
                    return false;
                }

                char tope = pila.pop();

                if (!coinciden(tope, c)){
                    return false;
                }
            }

        }

        return pila.isEmpty();

    }

    private static boolean coinciden(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']') ||
                (apertura == '{' && cierre == '}');
    }

}
