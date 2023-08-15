package ejerciciosGenerales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

    //1. Intercambiar el contenido de dos variables
    public void intercambiarContenidoVariables() {
        int n1 = 4;
        int n2 = 10;

        System.out.println("Valor n1: " + n1);
        System.out.println("Valor n2: " + n2);
        n1 = n2;

        System.out.println("Valor n1: " + n1);
    }

    //2. Calcular el número de cifras de un número entero
    public void numeroCifras() {
        int n = 252852;
        int contador = 0;

        while (n != 0) {
            n = n / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " cifras");
    }

    //3. Pasar de grados centígrados a grados kelvin. El proceso de leer grados centígrados
    // se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
    public void conversionRepetida() {
        Scanner scanner = new Scanner(System.in);

        char repetir;

        do {
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();
            double kelvin = celsius + 273.15;
            System.out.println("La temperatura en grados Kelvin es: " + kelvin);

            System.out.print("Repetir proceso? (S/N): ");
            repetir = scanner.next().charAt(0);
        } while (repetir == 'S' || repetir == 's');
    }

    //4. Mostrar la tabla de multiplicar de un número.
    public void tablaMultiplicarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre el 0 y el 10: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    //5. Leer números y contar cuántos acaban en 2.
    public void numerosAcabadosEnDos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce números: ");
        int n = scanner.nextInt();
        int contador = 0;

        while (n >= 0) {
            if (n % 10 == 2) {
                contador++;
            }
            System.out.print("Introduce números: ");
            n = scanner.nextInt();
        }
        System.out.println("Los números acabados en 2 son " + contador);
    }

    //6. Comprobar si un número es perfecto.
    public void numeroPerfecto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int contador = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                contador += i;
            }
        }

        if (contador == n) {
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }

    //7. Comprobar si dos números son amigos.
    public void numerosAmigos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] contador = new int[15];
        int cuenta = 0;
        int suma1 = 0;

        int[] contador2 = new int[15];
        int cuenta2 = 0;
        int suma2 = 0;

        for (int i = 1; i < n1; i++) {
            if (cuenta < n1) {
                if (n1 % i == 0) {
                    contador[cuenta] += i;
                    cuenta++;
                    for (int j = 0; j < contador.length; j++) {
                        suma1 += contador[j];
                    }
                }
            }
            if (cuenta2 < n2) {
                if (n2 % i == 0) {
                    contador2[cuenta2] += i;
                    cuenta2++;
                    for (int j = 0; j < contador2.length; j++) {
                        suma2 += contador2[j];
                    }
                }
            }
        }
        if (suma1 == suma2) {
            System.out.println("Son amigos");
        } else {
            System.out.println("No son amigos");
        }

        System.out.println(Arrays.toString(contador));
        System.out.print(Arrays.toString(contador2));
    }

    //8. Mostrar los N primeros términos de la serie de Fibonacci


    //9. Pasar de decimal a binario
    public int decimalABinario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int binario = 0;
        int resto;
        int exp = 0;

        while (n != 0) {
            resto = n % 2;
            binario = (int) (binario + resto * Math.pow(10, exp));
            exp++;
            n = n / 2;
        }

        return binario;
    }

    //10. Pasar de binario a decimal
    public void binarioADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número en binario: ");
        int n = scanner.nextInt();
        int resto = 0;
        int decimal = 0;
        int exp = 0;

        while (n != 0) {
            resto = n % 10;
            decimal = (int) (decimal + resto * Math.pow(2, exp));
            exp++;
            n = n / 10;
        }
        System.out.println(decimal);
    }

    //11. Convertir a Números Romanos
    public void convertirARomano() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        char[] romanos = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] decimal = {1, 5, 10, 50, 100, 500, 1000};
        String suma = "";
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < romanos.length; i++) {
            for (int j = 0; j < decimal.length; j++) {
                decimal[j] = romanos[i];
            }
        }

        if (romanos[contador1] == 'I') {
            suma += romanos[contador1];
            contador1++;
        } else if (romanos[contador1] == 'V') {
            suma += romanos[contador1];
            contador1++;
        } else if (romanos[contador1] == 'X') {
            suma += romanos[contador1];
            contador1++;
        }
        System.out.println(suma);
    }

    //12. Cifrado Cesar para codificar y decodificar un texto
    public String cifradoCesar(String texto, char[] alfabeto) {


        texto = texto.toUpperCase();
        String codificado = "";
        char[] delimitadorArray = {' ', '.', '!', '?', '-', '·', ','};
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (texto.charAt(i) == alfabeto[j]) {
                    codificado += alfabeto[j+3];
                }
                for (int k = 0; k < delimitadorArray.length; k++) {
                    if (texto.charAt(i) == delimitadorArray[contador]) {
                        texto.charAt(i+1);
                        contador++;
                    }
                }
            }
        }
        return codificado;
    }

    public String descifradoCesar(String texto, char[] alfabeto) {


        texto = texto.toUpperCase();
        String codificado = "";
        char[] delimitadorArray = {' ', '.', '!', '?', '-', '·', ','};
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (texto.charAt(i) == alfabeto[j]) {
                    codificado += alfabeto[j-3];
                }
                for (int k = 0; k < delimitadorArray.length; k++) {
                    if (texto.charAt(i) == delimitadorArray[contador]) {
                        texto.charAt(i+1);
                        contador++;
                    }
                }
            }
        }
        return codificado;
    }

    //13. Comprobar si un número entero es capicúa


    //14. Calcular la nota media, nota mayor y nota menor de una serie de alumnos.


    //15. Calcular el factorial de un número.
    public void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.println(n + " | " + i); //NO FUNCIONA
                n = n / i;
            }
        }
    }

    //16. Comprobar si un número es primo.


    //17. Mostrar las cifras de un número por separado.
    public void numerosSeparados () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int n_separado;
        int nCifras;
        int digito;

        n_separado = n;
        nCifras = 0;

        while (n_separado != 0) {
            n_separado = n_separado / 10;
            nCifras++;
        }

        for (int i = nCifras - 1; i >= 0; i--) {
            digito = n / (int) Math.pow(10, i);
            System.out.print(digito + " ");
            n = n % (int) Math.pow(10, i);
        }

    }

    //18. Invertir las cifras de un número.


    //19. Calcular el mayor de N números.
    public int nMayor () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();
        int mayor = 0;

        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int n1 = scanner1.nextInt();

            if (n1 > mayor) {
                mayor = n1;
            }
        }
        System.out.println(mayor);

        return mayor;
    }

    //20. Calcular la cifra mayor de un número y su posición. Versión 1.
    public int nMayorYPosicion () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();
        int mayor = 0;
        int posicion = 0;

        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int n1 = scanner1.nextInt();

            if (n1 > mayor) {
                mayor = n1;
                posicion = i;
            }
        }
        System.out.println(mayor);
        System.out.println(posicion);

        return mayor;
    }

    //21. Calcular la cifra mayor de un número y su posición. Versión 2.


    //22. Mostrar las cifras de un número con su nombre.


    //23. Sumar las cifras de un número.
    public int sumarCifras () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
    }

    //24. Comprobar si un número es narcisista.


    //25. Calcular la letra del dni.

}
