package repasar2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

    //EJERCICIOS DE OPERADORES
    public int sumaCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 3 calificaciones: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int suma = 0;

        suma += n1+n2+n3;
        return suma;
    }

    public int salarioSemanal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el salario por hora: ");
        int salario_hora = scanner.nextInt();
        System.out.print("Introduce las horas semanales realizadas: ");
        int horas = scanner.nextInt();
        int salario_semanal;

        salario_semanal = salario_hora * horas;
        return salario_semanal;
    }

    public int dineroTotal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el dinero que tiene Guillermo: ");
        int nGuillermo = scanner.nextInt();

        int nLuis = nGuillermo / 2;
        int nJuan = (nGuillermo + nLuis) / 2;
        int dineroTotal = nGuillermo + nLuis + nJuan;

        return dineroTotal;
    }

    public int salarioVendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de coches vendidos: ");
        int coches_vendidos = scanner.nextInt();
        System.out.print("Valor del coche: ");
        int valor_coche = scanner.nextInt();
        int salario_total;

        salario_total = (int) (1000 + (150 * coches_vendidos) + (0.05 * (coches_vendidos * valor_coche)));

        return salario_total;
    }

    public float calificacionFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota de participación: ");
        float participacion = scanner.nextFloat();
        System.out.print("Introduce la nota del primer examen parcial: ");
        float primer_examen = scanner.nextFloat();
        System.out.print("Introduce la nota del segundo examen parcila: ");
        float segundo_examen = scanner.nextFloat();
        System.out.print("Introduce la nota del examen final: ");
        float examen_final = scanner.nextFloat();
        float nota_final;

        nota_final = (float) ((participacion * 0.1) + (primer_examen * 0.25) + (segundo_examen * 0.25) + (examen_final * 0.4));

        return nota_final;
    }

    public int cuadradoSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = scanner.nextInt();
        int operacion;

        operacion = (int) (Math.pow(n1, 2) + Math.pow(n2, 2) + 2*n1*n2);

        return operacion;
    }

    public void semanasDiasHorasMinutosSegundos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el total de horas: ");
        int h = scanner.nextInt();
        int semanas;
        int dias;
        int horas;

        semanas = h / 168;
        dias = (h % 168) / 24;
        horas = h % 24;

        System.out.println(semanas + " " + dias + " " + horas);
    }

    public void ecuacionSegundoGrado() { //NO SÉ HACERLO
        int a = 3;
        int b = 6;
        int c = 5;
        int x;

        x = (int) (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c) / 2*a);

        System.out.println(x);
    }

    //EJERCICIOS DE CONDICIONALES
    public void esMultiploDeDiez() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (n % 10 == 0) {
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("No es múltiplo de 10");
        }
    }

    public void mayoresOIguales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce un número: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Son iguales");
        } else if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
    }

    public void siEsMayuscula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        String caracter = scanner.next();

        if (caracter == caracter.toUpperCase()) {
            System.out.println("Es mayúscula");
        } else {
            System.out.println("Es minúscula");
        }
    }

    public float cantidadAPagar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de la compra: ");
        float compra = scanner.nextFloat();

        if (compra > 300) {
            compra = compra * 0.8f;
        }
        return compra;
    }

    public int sueldoSemanal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de horas trabajadas: ");
        int horas = scanner.nextInt();
        int salario_hora;
        int salario_hora_extra;
        int salario_semanal;

        if (horas <= 40) {
            salario_hora = 16;
            salario_semanal = salario_hora * horas;
        } else {
            salario_hora = 16;
            salario_hora_extra = 20;
            salario_semanal = (salario_hora * 40) + (salario_hora_extra * (horas - 40));
        }
        return salario_semanal;
    }

    public void paresOImpares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce un número: ");
        int n2 = scanner.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("Son pares");
        } else if (n1 % 2 == 0 && n2 % 2 != 0){
            System.out.println(n1 + " es par");
        } else if (n1 % 2 != 0 && n2 % 2 == 0) {
            System.out.println(n2 + " es par");
        } else {
            System.out.println("Son impares");
        }
    }

    public void deMayorAMenor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 3 números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 > n2 & n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n3 > n2 && n2 > n1){
            System.out.println(n3 + " " + n2 + " " + n1);
        }
    }

    //EJERCICIOS DE ARRAYS
    public void array() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 5 números: ");

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("\nImprimir los elementos");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public void arrayInverso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 5 números: ");

        int[] array = new int[5];
        int[] arrayInvertido = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = arrayInvertido.length -1, j = 0; i >= 0; i--, j++) {
            arrayInvertido[i] = array[j];
        }

        System.out.println("Imprimir los elementos");
        for (int j : arrayInvertido) {
            System.out.print(j + " ");
        }
    }

    public void arrayOperaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 5 números: ");

        int[] array = new int[5];
        int positivos = 0;
        int conteo_positivos = 0;
        int negativos = 0;
        int conteo_negativos = 0;
        int conteo_ceros = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] > 0) {
                positivos += array[i];
                conteo_positivos++;
            } else if (array[i] == 0) {
                conteo_ceros++;
            } else {
                negativos += array[i];
                conteo_negativos++;
            }
        }
        if (conteo_positivos == 0) {
            System.out.println("No hay ceros");
        } else {
            System.out.println(positivos / conteo_positivos);
        }

        if (conteo_negativos == 0) {
            System.out.println("No hay negativos");
        } else {
            System.out.println(negativos / conteo_negativos);
        }
        System.out.println(conteo_ceros);
    }

    public void arregloOrdenadoPorMi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            if (i == j) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + " " + array[j] + " ");
            }
        }
    }

    public void mezclarArraysEnOtra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Introduce 10 números: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            array3[j] = array1[i];
            j++;
            array3[j] = array2[i];
            j++;
        }

        System.out.print("Array3: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }

    public void mezclarTablasEnOtra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 12 números: ");

        int[] array1 = new int[12];
        int[] array2 = new int[12];
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Introduce 12 números: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < 24; i+=6) {
            for (int j = 0; j < 3; j++) {
                array3[i + j] = array1[a];
                array3[i + j + 3] = array2[b];
                a++;
                b++;
            }
        }

        System.out.print("Array3: ");
        System.out.print(Arrays.toString(array3));
    }

    public void arrayCreDecDes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array = new int[10];
        boolean creciente = false;
        boolean decreciente = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i+1]) {
                decreciente = true;
            } else if (array[i] < array[i+1]) {
                creciente = true;
            }
        }

        if (creciente == true && decreciente == false) {
            System.out.println("Creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("Decreciente");
        } else {
            System.out.println("Desordenado");
        }
    }

    //18-03
    public void meterNumeroNuevoEnArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 8 números: ");

        int[] array = new int[10];

        for (int i = 0; i < array.length -2; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        System.out.print("Introduce una posición: ");
        int posicion = scanner.nextInt();

        for (int i = array.length -2; i > posicion; i--) {
            array[i] = array[i-1];
        }
        array[posicion] = n;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public void desplazarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int ultimo = array[array.length-1];

        for (int i = array.length -2; i >= 0; i--) {
            array[i+1] = array[i];
        }
        array[0] = ultimo;

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public void desplazarNumerosXPosiciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array = new int[10];
        int[] resultado = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Introduce el desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            int j = (i+desplazamiento) % 10;
            resultado[j] = array[i];
        }

        for (int j : resultado) {
            System.out.print(j + " ");
        }
    }

    public void insertarNumeroEnArrayOrdenado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 5 números: ");

        int[] array = new int[10];

        boolean creciente = true;

        do {
            for (int i = 0; i < 5; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                if (array[i] > array[i+1]) {
                    creciente = false;
                    break;
                }
                if (array[i] < array[i+1]) {
                    creciente = true;
                }
            }

            if (creciente == false) {
                System.out.println("\nNo está ordenado ascendentemente, vuelve a digitar:\n");
            }
        } while (creciente == false);


        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int posicion = 0;
        int j = 0;

        while (array[j] < n && j < 5) {
            posicion++;
            j++;
        }

        for (int i = 4; i >= posicion; i--) {
            array[i+1] = array[i];
        }
        array[posicion] = n;

        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void eliminarNumeroEnArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Introduce la posición: ");
        int posicion = scanner.nextInt();

        for (int i = posicion; i < array.length -1; i++) {
            array[i] = array[i+1];
        }
        array[array.length -1] = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void guardarParesEImparesEnOtra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int pares = 0;
        int impares = 0;

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        int[] arrayPares = new int[pares];
        int[] arrayImpares = new int[impares];
        int[] arrayNuevo = new int[array.length]; //PREGUNTAR PARA JUNTARLOS EN ESTE

        pares = 0;
        impares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPares[pares] = array[i];
                pares++;
            } else {
                arrayImpares[impares] = array[i];
                impares++;
            }
        }

        for ( int i = 0; i < pares; i++) {
            System.out.print(arrayPares[i] + " ");
        }

        for ( int i = 0; i < impares; i++) {
            System.out.print(arrayImpares[i] + " ");
        }
    }

    public void copiarDosTablasEnOtraOrdenadosAsc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 10 números: ");

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Introduce 10 números: ");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array3[i] = array1[i];
            }
        }

        for (int i : array3) { //SOLO IMPRIME LO DEL PRIMER ARRAY
            System.out.print(array3[i] + " ");
        }


    }

}
