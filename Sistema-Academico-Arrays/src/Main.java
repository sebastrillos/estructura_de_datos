import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in );

        double[] notas = new double[10];

        System.out.println ( "ingrese 10 notas : " );

        for (int i = 0; i < notas.length; i++) {
            System.out.println ( "ingrese nota " + (i + 1) );
            notas[i] = input.nextDouble ();
        }
        System.out.println ( "El promedio es " + Main.promedio ( notas ) );
        System.out.println ( "La nota maxima es : " + Main.notaMaxima ( notas ) );
        System.out.println ( "La nota minima es : " + Main.notaMinima ( notas ) );
        System.out.println ( "La cantidad de estudiantes que aprobaron fueron : " + Main.estudiantesAprobados ( notas ) );


    }


    public static double promedio(double[] notas) {
        double suma = 0;
        for (int j = 0; j < notas.length; j++) {
            suma += notas[j];
        }
        return suma / notas.length;
    }

    public static double notaMaxima(double notas[]) {
        double notaMayor = 0;
        for (double nota : notas) {
            notaMayor = Math.max ( notaMayor, nota );
        }
        return notaMayor;
    }

    public static double notaMinima(double notas[]) {
        double notaMenor = 5;
        for (double nota : notas) {
            notaMenor = Math.min ( notaMenor, nota );
        }
        return notaMenor;
    }

    public static int estudiantesAprobados(double notas[]) {
        int aprobados = 0;
        for (double nota : notas) {
            if (nota >= 3.0) {
                aprobados++;
            }
        }
        return aprobados;
    }



}