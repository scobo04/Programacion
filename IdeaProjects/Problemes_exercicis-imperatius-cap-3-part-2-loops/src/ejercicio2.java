import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca el numero1: ");
        float r1 = (float) leer.nextFloat();
        System.out.print("Introduzca el numero2: ");
        float r2 = (float) leer.nextFloat();
        float p = 0.00001F;
        DosNumerosReales(r1, r2, p);

    }

    //NO FUNCIONA
    public static void DosNumerosReales(float r1, float r2, float p) {

        if (Math.abs(r1-r2) < p) {
            System.out.println("Se consideran iguales");
        }else {
            System.out.println("Se consideran diferentes");
        }

    }

}
