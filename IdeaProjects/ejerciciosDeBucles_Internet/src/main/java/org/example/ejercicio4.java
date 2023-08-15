package org.example;

import java.util.Scanner;


public class ejercicio4 {

    public static void main(String[] args) {

        Scanner leer1 = new Scanner(System.in);
        System.out.print("Introduce el número1: ");
        int n1 = leer1.nextInt();

        Scanner leer2 = new Scanner(System.in);
        System.out.print("Introduce el número2: ");
        int n2 = leer2.nextInt();


        for (int i = n1+1; i < n2 ; i+=2) {

            if (i % 2 == 0) {

                System.out.print(i + " | ");

            }

            else {

                i++;
                System.out.print(i + " | ");

            }

        }

    }

}
