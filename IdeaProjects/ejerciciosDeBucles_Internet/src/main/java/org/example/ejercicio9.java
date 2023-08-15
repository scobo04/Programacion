package org.example;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        Scanner cPrimos = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números " +
                "primos que quieres mostrar: ");
        int n = cPrimos.nextInt();

        for (int i = 0; i < n; i++) {

            boolean primo = esPrimo(i);

            if (primo) {

                System.out.print(i + " ");

            }

        }

    }

    public static boolean esPrimo(int n) {

        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != contador)) {

            if (n % contador == 0) {

                primo = false;
                contador++;

            }

        }
        return primo;
    }

}
