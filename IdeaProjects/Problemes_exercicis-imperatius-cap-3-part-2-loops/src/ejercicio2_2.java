import java.util.Scanner;

public class ejercicio2_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el numero1: ");
        float r1 = leer.nextFloat();

        System.out.print("Introduce el numero2: ");
        float r2 = leer.nextFloat();

        iguales(r1,r2);

    }

    public static void iguales(float r1, float r2) {

        double p = 0.01;

        if (Math.abs (r1-r2) < p) {

            System.out.print("Son iguales");

        } else {

            System.out.print("No son iguales");

        }

    }




}
