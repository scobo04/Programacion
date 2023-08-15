package org.example;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        int contadorMayores = 0;
        int contadorMenores = 0;
        int contadorIguales = 0;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números que quieres: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {

            Scanner leer2 = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int n2 = leer.nextInt();

            if (n2 > 0) {

                contadorMayores++;


            } else if (n2 < 0) {

                contadorMenores++;

            } else if (n2 == 0) {

                contadorIguales++;

            }

        }

        System.out.println("Cantidad de números mayores a 0: " + contadorMayores);
        System.out.println("Cantidad de números menores a 0: " + contadorMenores);
        System.out.println("Cantidad de números iguales a 0: " + contadorIguales);

    }

}
