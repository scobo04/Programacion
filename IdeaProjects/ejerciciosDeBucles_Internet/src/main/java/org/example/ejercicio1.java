package org.example;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        int n_aleatorio = (int) (Math.random()*100+1);

        System.out.println(n_aleatorio);

        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int n = leer.nextInt();

        if (n >= 1 && n <= 100) {

            while (n != n_aleatorio) {

                if (n > n_aleatorio && n <= 100) {

                    System.out.println(n + " es mayor que el número a adivinar");

                } else if (n < n_aleatorio && n >= 1) {

                    System.out.println(n + " es menor que el número a adivinar");

                } else {

                    System.out.println("INTRODUCE UN NÚMERO ENTRE 1 Y 100");

                }

                System.out.println("----------------------");
                System.out.println("Prueba otra vez");
                System.out.print("Escribe otro número: ");

                Scanner leer2 = new Scanner(System.in);
                n = leer.nextInt();




            }

            if (n == n_aleatorio) {

                System.out.println("\nLO HAS ADIVINADO");

            }


        }

    }

}
