package ejerciciosConEstructuraCondicional;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicios {

    //1. Programa Java que lea un número entero y calcule si es par o impar.
    public static void parOImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    //2. Programa Java que lea un número entero y calcule si es positivo o negativo.
    public static void positivoONegativo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es positivo");
        }
    }

    //3. Programa que lea un número entero y muestre si el número es múltiplo de 10.
    public static void numeroMultiploDeDiez() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (n % 10 == 0) {
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("No es múltiplo de 10");
        }
    }

    //4. Programa que lea dos números y comprueba si son iguales.
    public static void numerosIguales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Los dos números son iguales");
        } else {
            System.out.println("Los dos números no son iguales");
        }
    }

    //5. Programa que lea dos números y calcula cuál es el mayor.
    public static void numeroMayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
    }

    //6. Comprobar si dos números enteros terminan con la misma cifra.
    public static void numerosAcabadosMismaCifra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int aux1;
        int aux2;

        if (n1 % 10 != 0 || n1 % 10 == 0) {
            aux1 = n1 % 10;
            System.out.println(n1 % 10);
            if (n2 % 10 != 0 || n2 % 10 == 0) {
                aux2 = n2 % 10;
                System.out.println(n2 % 10);
                if (aux1 == aux2) {
                    System.out.println("Terminan con el mismo número");
                } else {
                    System.out.println("No terminan con el mismo número");
                }
            }
        }
    }

    //7. Comprobar si un número es múltiplo de tres y de cinco.
    public static void multiploTresYCinco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("El número es múltiplo de 3 y 5");
        } else {
            System.out.println("El número no es múltiplo de 3 y 5");
        }
    }

    //8. Comprobar si un número es múltiplo de dos o de tres.
    public static void multiploDosOTres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("El " + n + " es múltiplo de 2 o 3");
        }
    }

    //9. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
    public static void comprobarSiEsMayuscula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        String letra = scanner.next();

        if (letra.equals(letra.toUpperCase())) {
            System.out.println("Es mayúscula");
        } else {
            System.out.println("Es minúscula");
        }
    }

    //10. Programa que lea dos caracteres por teclado y compruebe si son iguales.
    public static void caracteresIguales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos caracteres: ");
        String letra1 = scanner.next();
        String letra2 = scanner.next();

        if (letra1.equals(letra2)) {
            System.out.println("Las letras son iguales");
        } else {
            System.out.println("Las letras no son iguales");
        }
    }

    //11. Programa que lea dos caracteres y compruebe si son dos letras minúsculas.
    public static void sonLetrasMinusculas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos caracteres: ");
        String letra1 = scanner.next();
        String letra2 = scanner.next();

        if (letra1.equals(letra1.toLowerCase()) && letra2.equals(letra2.toLowerCase())) {
            System.out.println("Las letras son minúsculas");
        } else {
            System.out.println("Las letras no son minúsculas");
        }
    }

    //12. Programa que lea un carácter y compruebe si es un número (Carácter entre '0' y '9').
    public static void comprobarSiEsNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        String caracter = scanner.next();

        if (caracter.length() >= 0 && caracter.length() <= 9) {
            if (Character.isDigit(caracter.charAt(0))) {
                System.out.println("Es un número");
            } else {
                System.out.println("Es un carácter");
            }
        }
    }

    //13. Programa para calcular si un año es bisiesto.
    public static void saberSiEsBisiesto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int any = scanner.nextInt();

        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
            System.out.println("El año " + any + " es bisiesto");
        } else {
            System.out.println("El año " + any + " no es bisiesto");
        }
    }

    //14. Programa para comprobar si un número de tres cifras es capicúa.
    public static void saberSiEsCapicua() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        int falta;
        int resto;
        int nInvertido;

        falta = n;
        nInvertido = 0;
        resto = 0;

        while (falta!=0){
            resto = falta % 10;
            nInvertido = nInvertido * 10 + resto;
            falta = falta / 10;
        }

        if (nInvertido == n) {
            System.out.println("El número es capicua");
        } else {
            System.out.println("El número no es capicua");
        }
    }

    //15. Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
    // Se debe comprobar que el divisor no puede ser cero.
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        float n1 = scanner.nextInt();
        float n2 = scanner.nextInt();
        float division;

        division = n1 / n2;

        if (n1 % n2 != 0) {
            System.out.println(division);
        }

    }

    //16. Programa que lea dos números por teclado y muestre el resultado de la división del mayor entre el menor.
    // Se debe comprobar que el divisor no puede ser cero.
    public static void division2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        float n1 = scanner.nextInt();
        float n2 = scanner.nextInt();
        float division;

        if (n1 > n2) {
            division = n1 / n2;
            System.out.println(division);
        } else {
            division = n2 / n1;
            System.out.println(division);
        }
    }

    //17. Calcular el mayor de tres números enteros en Java.
    public static void mayorDeTres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tres números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " es el mayor");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " es el mayor");
        } else {
            System.out.println(n3 + " es el mayor");
        }
    }

    //18. Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos respectivamente, y
    // comprueba si la hora que indican es una hora válida.
    public static void hora() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce hora, minutos y segundos: ");
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();

        if (H >= 0 && H <= 23) {
            if (M >= 0 && M <= 59) {
                if (S >= 0 && S <= 59) {
                    System.out.println("Hora válida");
                    System.out.println(H + ":" + M + ":" + S);
                } else {
                    System.out.println("Hora no válida");
                }
            } else {
                System.out.println("Hora no válida");
            }
        } else {
            System.out.println("Hora no válida");
        }
    }

    //19. Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30, 31 o 28 días.
    // Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
    public static void mes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el mes: ");
        int nMes = scanner.nextInt();
        String mes = "";
        int dias = 0;

        switch (nMes) {
            case 1:
                mes = "Enero";
                dias = 31;
                break;
            case 2:
                mes = "Febrero";
                dias = 29;
                break;
            case 3:
                mes = "Marzo";
                dias = 31;
                break;
            case 4:
                mes = "Abril";
                dias = 30;
                break;
            case 5:
                mes = "Mayo";
                dias = 31;
                break;
            case 6:
                mes = "Junio";
                dias = 30;
                break;
            case 7:
                mes = "Julio";
                dias = 31;
                break;
            case 8:
                mes = "Agosto";
                dias = 31;
                break;
            case 9:
                mes = "Septiembre";
                dias = 30;
                break;
            case 10:
                mes = "Octubre";
                dias = 31;
                break;
            case 11:
                mes = "Noviembre";
                dias = 30;
                break;
            case 12:
                mes = "Diciembre";
                dias = 31;
                break;
        }

        if (nMes > 0 && nMes <= 12) {
            System.out.println("El mes introducido es " + mes + " que tiene " + dias + " días");
        }

    }

    //20. Programa para pasar una calificación numérica a alfabética.
    public static void calificacionDeNumericaAAlfabetica() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una calificación: ");
        int calificacion = scanner.nextInt();
        String enLetra = "";

        enLetra += calificacion;

        System.out.println(enLetra);
    }
}
