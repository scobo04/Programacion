package ejerciciosConEstructuraIterativaORepetitiva;

import java.util.Scanner;

public class Ejercicios {

    //1. Programa Java que muestre los números del 1 al 100 utilizando la instrucción while
    public void delUnoAlCien() {
        int n = 1;
        while (n <= 100) {
            System.out.print(n + " ");
            n++;
        }
    }

    //2. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while
    public void delUnoAlCien2() {
        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        }
        while (n <= 100);
    }

    //3. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for
    public void delUnoAlCien3() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    //4. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while
    public void delCienAlUno() {
        int n = 100;
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }

    //5. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while
    public void delCienAlUno2() {
        int n = 100;
        do {
            System.out.print(n + " ");
            n--;
        }
        while (n >= 1);
    }

    //6. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for
    public void delCienAlUno3() {
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    //7. Programa Java que muestre los números desde 1 hasta N utilizando las instrucciones for, while y do .. while
    public void delUnoAN() {
        int n = 50;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public void delUnoAN2() {
        int n = 50;
        int contador = 1;
        while (contador <= n) {
            System.out.print(contador + " ");
            contador++;
        }
    }

    public void delUnoAN3() {
        int n = 50;
        int contador = 0;
        do {
            System.out.print(contador + " ");
            contador++;
        }
        while (contador <= n);
    }

    //8. Programa Java que muestre los números desde N hasta 1 utilizando las instrucciones for, while y do .. while
    public void deNAUno() {
        int n = 50;
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public void deNAUno2() {
        int n = 50;
        int contador = n;
        while (contador >= 1) {
            System.out.print(contador + " ");
            contador--;
        }
    }

    public void deNAUno3() {
        int n = 50;
        int contador = n;
        do {
            System.out.print(contador + " ");
            contador--;
        }
        while (contador >= 1);
    }

    //9. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
    public void ordenarDeMenorAMayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);
        } else {
            System.out.println("Los números son iguales");
        }
    }

    //10. Programa Java que lea dos números y muestre los números pares entre ellos
    public void numerosPares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        for (int i = 2; i <= n1; i+=2) {
            for (int j = 2; j <= n2; j+=2) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        if (i == j) {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }

    //11. Programa que muestre los múltiplos de un número desde 1 hasta M
    public void multiplosDeN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int contador = 1;

        while (contador < n) {
            System.out.println(n * contador);
            contador++;
        }
    }

    //12. Programa que lea números e indique si son positivos o negativos y pares o impares
    public void positivosNegativosYParesImpares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Número ");
            int n1 = scanner.nextInt();
            if (n1 >= 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }
            if (n1 % 2 == 0) {
                System.out.println("Es par");
                System.out.println("--------------");
            } else {
                System.out.println("Es impar");
                System.out.println("--------------");
            }
        }
    }

    //13. Programa que pase de millas a kilómetros
    public void deMillasAKm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        float millas = scanner.nextFloat();
        float km;

        km = millas * 1.60934f;
        System.out.println(millas + " millas son " + km + " kilometros");
    }

    //14. Contar los números introducidos por teclado
    public void contarNumerosIntroducidos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número (0 para acabar): ");
        int n = scanner.nextInt();
        int contador = 0;

        while (n != 0) {
            contador++;
            n = scanner.nextInt();
        }
        System.out.println("La cantidad de números introducidos son " + contador);
    }

    //15. Contar los números positivos introducidos por teclado
    public void numerosPositivos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número (0 para acabar): ");
        int n = scanner.nextInt();
        int contador = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        while (n != 0) {
            contador++;
            if (n > 0) {
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
            n = scanner.nextInt();
        }
        System.out.println("La cantidad de números introducidos son " + contador);
        System.out.println("La cantidad de números positivos son " + contadorPositivos);
        System.out.println("La cantidad de números negativos son " + contadorNegativos);
    }
}
