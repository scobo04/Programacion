package org.example;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        Scanner producto = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = producto.nextDouble();

        double total = precio * 1.21;

        System.out.println("EL precio del producto con IVA es de " + Math.round(total*100) / 100d + " €");

    }

}
