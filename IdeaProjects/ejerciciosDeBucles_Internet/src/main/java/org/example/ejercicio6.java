package org.example;

import java.util.Scanner;

//REVISAR Y CORREGIRLO

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner leer1 = new Scanner(System.in);
        System.out.println("Introduce el número1: ");
        int n1 = leer1.nextInt();

        Scanner leer2 = new Scanner(System.in);
        System.out.println("Introduce el elevado: ");
        int n1_2 = leer2.nextInt();

        int n2 = n1 ^ n1_2;

        System.out.println(n2);


    }

}
