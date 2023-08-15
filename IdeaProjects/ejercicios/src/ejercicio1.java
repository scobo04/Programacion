import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        //1. Calcula el factorial de un número pedido por teclado

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = leer.nextInt();

        for (int i = 2; i < n; i++) {

            if (n % 2 == 0) {

                System.out.println(n + " | " + 2);
                n = n/2;

            } else if (n % 3 == 0) {

                System.out.println(n+ " | " + 3);
                n = n/3;

            } else if (n % 5 == 0) {

                System.out.println(n+ " | " + 5);
                n = n/5;

            } else if (n % i == 1) {

                System.out.println(1);

            }

        }

    }

}