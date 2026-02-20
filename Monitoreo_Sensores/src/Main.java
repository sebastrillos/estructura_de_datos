import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        double[][] temperaturas = new double[3][3];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println ("ingrese temperaturas para la sona " + (i+1));
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print ("temperatura "+ (j+1) +" : ");
                temperaturas[i][j] = input.nextDouble ();
            }
        }

    Main.promedioZonas ( temperaturas );

    }

    public static void promedioZonas(double[][] temperaturas){
        double promedioZona;
        for (int i = 0; i < temperaturas.length; i++) {
            promedioZona = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
             promedioZona += temperaturas[i][j];
            }
            System.out.println ("el promedio de la zona "+(i+1)+ " es de : " + (promedioZona/ temperaturas.length));
        }

    }
}