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
        System.out.println ("El promedio general es de : "+ Main.promedioGeneral ( temperaturas ));
        Main.valoresCriticos ( temperaturas );
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

    public static double promedioGeneral(double[][] temperaturas){
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma+=temperaturas[i][j];
                contador++;
            }
        }
        return suma/ contador;
    }

    public static void valoresCriticos(double[][] temperaturas){
        System.out.println ("temperaturas criticas ");
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] >99) {
                    System.out.println ("temperatura : "+ temperaturas[i][j]);
                }else if (temperaturas[i][j]<0){
                    System.out.println ("temperatura : "+ temperaturas[i][j]);
                }
            }
        }
    }
}