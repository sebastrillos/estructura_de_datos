import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] notas = new double[10];

        System.out.println("ingrese 10 notas : ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese nota "+i);
            notas[i] = input.nextDouble();
        }
        System.out.println("El promedio es "+ promedio(notas));


    }


    public static double promedio(double[] notas){
        double promedio = 0;
        for (int j = 0; j < notas.length; j++) {
            promedio += notas[j];
        }
    return promedio / notas.length;
    }
}