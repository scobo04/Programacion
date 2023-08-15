import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce otro número: ");
        int n2 = scanner.nextInt();
        nMayor(n1, n2);*/


        /*Scanner scanner2 = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        float r1 = scanner2.nextFloat();
        System.out.print("Introduce otro número: ");
        float r2 = scanner2.nextFloat();
        sabesSiSonIguales(r1,r2);*/


        float l = 1.1f;
        float g = 9.8f;
        /*m = ;*/
        System.out.println(calcularFrecuencia(l, g));
    }

    public static void nMayor(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);
        }
        else {
            System.out.println("Son iguales");
        }
    }

    public static void sabesSiSonIguales(float r1, float r2) {
        float p = 0.01f;
        if (Math.abs(r1 - r2) < p) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    public static float calcularFrecuencia (float l, float g) {
         float frecuencia;

         frecuencia = (float) (1 / (2 * Math.PI) * Math.sqrt(g / l));

         return frecuencia;
    }



}
