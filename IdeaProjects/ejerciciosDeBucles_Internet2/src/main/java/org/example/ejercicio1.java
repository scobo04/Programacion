package org.example;

public class ejercicio1 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 4;

        System.out.println("Suma: " + suma(n1,n2));
        System.out.println("Resta: " + resta(n1,n2));
        System.out.println("Multiplicación: " + multiplicacion(n1,n2));
        System.out.println("División: " + division(n1,n2));
        System.out.println("Módulo: " + modulo(n1,n2));

    }

    public static int suma(int n1, int n2) {

        int suma = n1 + n2;

        return suma;
    }

    public static int resta(int n1, int n2) {

        int resta = n1 - n2;

        return resta;
    }

    public static int multiplicacion(int n1, int n2) {

        int multiplicacion = n1 * n2;

        return multiplicacion;
    }

    public static int division(int n1, int n2) {

        int division = n1 / n2;

        return division;
    }

    public static int modulo(int n1, int n2) {

        int modulo = n1 % n2;

        return modulo;
    }

}
