import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

    }

    //EJERICIO1: Imprimir del 1 al 10
    public void imprimirNumeros () {

        for (int i = 1; i <= 10; i++) {

            System.out.print(i + " ");

        }

    }

    //EJERCICIO 2: Lee dos números y los suma
    public void sumaDosNumeros(int n1, int n2) {

        int suma = n1 + n2;

        System.out.println(suma);

    }

    //EJERCICIO 3: Determina si un número es par o impar
    public void esParImpar(int n) {

        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }

    //EJERCICIO 4: Determina si un número es primo
    public boolean esPrimo(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void sacaSiEsPrimoONo(int n) {
        if (esPrimo(n)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    //EJERCICIO 5: Calcular descomposición factorial de un número
    public void factorial(int n) {
        int divisor = 2;
        while (n != 1 && n > 0) {
            if (n % divisor == 0) {
                System.out.println(n + " | " + divisor);
                n = n/divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(1);
    }

    //EJERCICIO 6: Calcular máximo común divisor de dos números
    public void mcdDosNumeros(int n1, int n2) {
        
    }

}