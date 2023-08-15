package org.example;

import java.util.Scanner;

//REVISAR Y CORREGIRLO

public class ejercicio3 {

    public static void main(String[] args) {

        char[] vocales = {'a','e','i','o','u'};

        Scanner leer = new Scanner(System.in);
        System.out.print("¿Es vocal? ");
        char letra = 'o';

        for (int i = 0; i < vocales.length; i++) {

            if (vocales[i] == letra) {

                System.out.print("Sí");

            }

        }

        for (int j = 0; j < vocales.length; j++) {

            if (vocales[j] != letra) {

                System.out.println("No");

            }

        }

    }





}
