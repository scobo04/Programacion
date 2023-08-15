package org.example;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce los meses a pagar a plazos: ");
        int meses = leer.nextInt();
        int precio = 10;
        int total;

        for (int i = 1; i <= meses; i++) {

            if (i >= 1) {

                total = precio * i;
                System.out.println(precio + " x " + i + " = " + total + " €");
                precio = precio*2;
                System.out.println("El total son " + total + " €");

            }

        }

        /*

        1r mes --> 10€
        2r mes --> 20€
        3r mes --> 40€

        */

    }

}
