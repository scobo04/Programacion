package org.example;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {

        Scanner nVentas = new Scanner(System.in);
        System.out.print("Introduce el número de ventas a insertar: ");
        int cantidad = nVentas.nextInt();

        Scanner ventas = new Scanner(System.in);

        double suma = 0;


        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Introduce el precio de la venta " + i + ": ");
            double numero = ventas.nextDouble();
            suma += numero;

        }

        System.out.println("Las ventas suman un total de " + suma + " €");

    }

}
