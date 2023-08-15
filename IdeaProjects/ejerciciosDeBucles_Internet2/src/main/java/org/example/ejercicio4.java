package org.example;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner nombre = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String name = nombre.nextLine();

        System.out.println("Bienvenido/a " + name);

    }

}
