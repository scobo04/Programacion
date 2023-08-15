import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* VIDEO 1
        Realizar un programa que permita el intercambio de valores entre dos
        variables. Por ejemplo: si una variable numero vale 35, y una variable
        numero2 vale 20, realizar las acciones necesarias para que numero pase
        a valer 20 y numero2 pase a valer 35. Una vez realizado el cambio
        mostrar el resultado por pantalla.
        */

        int numero = 35;
        int numero2 = 20;
        /*System.out.println("-------Antes-------");
        System.out.println("Numero: " + numero);
        System.out.println("Numero2: " + numero2);*/

        int aux;

        aux = numero2;
        /*System.out.println("------Después-------");
        System.out.println("Numero: " + aux);

        aux = numero;
        System.out.println("Numero2: " + aux + "\n");*/


        /* VIDEO 2
        Una pequeña despensa desea calcular los sueldos de sus empleados. Los
        puestos de los mismos pueden tener 3 categorías: 1-repositor, 2-cajero
        y 3-supervisor.
            - Los repositores cobran 15.890 + un bono del 10%.
            - Los cajeros cobran 25.630,89 fijos.
            - Los supervisores cobran 35.560,20 en bruto al cual se le
              descuenta un 11% de jubilación.

        Se necesita un programa que, dependiendo del tipo de empleado del que
        se trate, calcule y muestre por pantalla el correspondiente sueldo.
        */

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 3: ");
        int n = scanner.nextInt();

        float sueldo_repositor;
        float sueldo_cajero;
        float sueldo_supervisor;

        if (n < 1 || n > 3) {
            System.out.println("Introduce un número entre el 1 y el 3");
            System.out.print("\nIntroduce un número del 1 al 3: ");
            n = scanner.nextInt();
            puesto(n);
        } else {
            puesto(n);
        }*/


        /* VIDEO 4
        Realizar un programa que dado por teclado un límite numérico por
        teclado (por ejemplo 100) muestre en pantalla todos los números hasta
        ese límite (empezando por 1).
        */

        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print("\nIntroduce el límite numérico: ");
        int n1 = scanner1.nextInt();

        if (n1 <= 0) {
            System.out.println("Introduce un número mayor o igual a 1");
        } else {
            for (int i = 1; i <= n1; i++) {
                System.out.print(i + " ");
            }
        }*/


        /* VIDEO 5
        Realizar un programa que permita cargar 15 números en un vector. Una
        vez cargados, se necesita que el programa cuente e informe por
        pantalla cuántas veces se cargó el número 3.
        */

        /*Scanner scanner2 = new Scanner(System.in);
        System.out.print("\n\nIntroduce la cantidad de números: ");
        int cantidad = scanner2.nextInt();

        System.out.print("\nIntroduce los números: ");

        int[] array = new int[cantidad];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner2.nextInt();
        }

        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " coincidencias del número 3");*/


        /* VIDEO 6
        En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos
        de secundaria. Cada fila corresponde a las notas y al promedio de cada
        alumno. Se necesita un programa que permita a un profesor cargar, en
        las 3 posiciones (columnas) de cada fila, las notas del alumno y que
        en la última columna se calculen los promedios. Una vez realizados los
        cálculos, se desea mostrar las 3 notas de cada alumno y el promedio
        correspondiente recorriendo la matriz.
        */

        /*Scanner scanner3 = new Scanner(System.in);
        double suma = 0;

        double[][] array2 = new double[4][4];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length -1; j++) {
                System.out.print("\nIntroduce las 3 notas del alumno nº " + i + ": ");
                array2[i][j] = scanner3.nextDouble();
                if (array2[i][j] < 0 || array2[i][j] > 10) {
                    System.out.println("Introduce una nota válida");
                    System.out.print("\nIntroduce las 3 notas del alumno nº " + i + ": ");
                    array2[i][j] = scanner3.nextDouble();
                } else {
                    suma += array2[i][j];
                }
            }
            array2[i][3] = suma / 3;
            suma = 0;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("\nLas notas del alumno nº " + i + " son: ");
            for (int j = 0; j < array2[0].length -1; j++) {
                System.out.print("\nNota nº" + j + ": " + array2[i][j]);
            }
            System.out.println("\n\nEl promedio de las notas es: " + array2[i][3]);
        }*/


        /* VIDEO 7
        - Crear una clase Planta con los atributos: nombre, alto del tallo,
          tieneHojas, clima ideal (con sus métodos y constructores correspondientes).

        - Crear sus clases hijas que compartan sus atributos y métodos:
            - Árbol: variedad, tipo de tronco, radio del tronco, color, tipo hojas.
            - Flor: color de pétalos, cantidad promedio de pétalos, color del
              pistillo, color de los pétalos, variedad de flor, estación que florece.
            - Arbusto: ancho arbusto, es doméstica, variedad arbusto, color hojas,
              se poda o no.

        - Una vez creadas las clases crear los siguientes métodos:
            - Árbol: método para mostrar un mensaje en pantalla que diga "Hola
              soy un árbol".
            - Flor: método para mostrar un mensaje en pantalla que diga "Hola soy
              una flor".
            - Arbusto: método para mostrar un mensaje en pantalla que diga "Hola
              soy un arbusto".

        - Crear en el Main un objeto de cada clase hija. Llamar a los 3 métodos
          desde cada objeto.

        - Cambiar el modificador de acceso de los métodos de public a private.
          Intentar acceder desde el main a estos métodos.
        */

        Arbol madrono = new Arbol("madroño", 2.4f, true, "invierno", "compacta", "recto y fuerte", 1.2f, "marrón rojizo", "perenne");

        Flor rosa = new Flor("rosa", 1.11f, true, "primavera u otoño", "rojo", 5, "rojo", "rojo", "rosas de té híbridas", "primavera o verano");

        Arbusto hortensia = new Arbusto("hortensia", 2, true, "otoño, invierno o primavera", 1.2f, true, "hortensia", "verde oscuro", true);

    }

    public static void puesto(int n) {
        float sueldo_repositor;
        float sueldo_cajero;
        float sueldo_supervisor;
        if (n == 1) {
            sueldo_repositor = 15890 + (15890 * 1.1f);
            System.out.println("Repositor\nSueldo: " + sueldo_repositor);
        } else if (n == 2) {
            sueldo_cajero = 25630.89f;
            System.out.println("Cajero\nSueldo: " + sueldo_cajero);
        } else {
            sueldo_supervisor = (float) (35560.20 - (35560.20 * 0.11));
            System.out.println("Supervisor\nSueldo: " + sueldo_supervisor);
        }
    }


}