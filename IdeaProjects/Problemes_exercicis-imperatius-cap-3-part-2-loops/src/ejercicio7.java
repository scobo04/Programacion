import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        byte n = numero.nextByte();
        int contador = 0;

        if (n != 1) {

            System.out.println("Número de parámetros incorrecto");

        } else {

            while (n == 1) {

                Scanner leer = new Scanner(System.in);
                System.out.print("Introduce número: ");
                double number = leer.nextDouble();
                contador++;

                if (number == 0.0) {

                    System.out.println("Número total de datos introducidos: " + contador);
                    break;



                }

            }

        }

    }

}
