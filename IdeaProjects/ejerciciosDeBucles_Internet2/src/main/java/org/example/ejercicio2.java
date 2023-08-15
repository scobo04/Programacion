package org.example;

public class ejercicio2 {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 4;

        nMayor(n1,n2);

    }

    public static void nMayor(int n1, int n2) {

        if (n1 > n2) {

            System.out.println(n1 + " es mayor que " + n2);

        } else if (n1 == n2) {

            System.out.println("Son iguales");

        } else {

            System.out.println(n2 + " es mayor que " + n1);

        }

    }

}
