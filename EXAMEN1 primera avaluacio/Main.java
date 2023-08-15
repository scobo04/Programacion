package com.company;

public class Main {

    public static void main(String[] args) {

        DescomposicionFactorial(200);
        //System.out.println(Final("hola que estas hola tal"," "));

    }

    // ejercicio 1

    public static boolean saberSiEsPrimo(int n){

        for (int i = 2; i < n; i++) {

            if (n % i == 0){

                return false;

            }

        }

        return true;

    }

    public static boolean[] ArrayDeBooleans(int n){

        boolean[] array = new boolean[n];

        for (int i = 2; i < array.length; i++) {

            if (saberSiEsPrimo(i)){

                array[i] = true;

            }
            
        }

        return array;

    }

    public static int[] NumerosPrimosEnteros (boolean[] array){

        int contador = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i]){
                contador++;
            }

        }

        int[] numerosPrimos = new int[contador];
        int contador2 = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]){
                numerosPrimos[contador2] = i;
                contador2++;
            }

        }

        return numerosPrimos;

    }

    // ejercicio 2

    public static void DescomposicionFactorial(int n){

        int[] arrayDePrimos = NumerosPrimosEnteros(ArrayDeBooleans(n));

        for (int i = 0; i < arrayDePrimos.length; i++) {

            if (n % arrayDePrimos[i] == 0){

                while (n % arrayDePrimos[i] == 0){

                    System.out.println(n + "/" + arrayDePrimos[i]);
                    n = n/arrayDePrimos[i];

                }

            }

            if (n == 1){
                System.out.println(1);
                break;
            }

        }

    }

    // ejercicio 3

    public static char[] arrayDeChars(String text){

        char[] array = new char[text.length()];
        for (int i = 0; i < array.length; i++) {

            array[i] = text.charAt(i);

        }

        return array;

    }

    public static boolean esDelimitador(int n,char[] array){

        char[] delimitadores = {' ','?','-'};

        for (int i = 0; i < delimitadores.length; i++) {

            if (array[n] == delimitadores[i]){
                return true;
            }

        }

        return false;

    }

    public static int longuitudPalabra(int n,char[] array){

        int contador = 0;

        for (int i = n; i < array.length; i++) {

            if (!(esDelimitador(i,array))){
                contador++;
            } else {
                break;
            }

        }

        return contador;

    }

    public static String palabraDesdeIndex(int n,char[] array){

        String paraula = "";

        for (int i = n; i < (longuitudPalabra(n,array)+n); i++) {

            paraula += array[i];

        }

        return paraula;

    }

    public static String[] Palabras(char[] array){

        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            i += longuitudPalabra(i,array);
            contador++;

        }

        String[] palabras = new String[contador];
        int contadorIndex = 0;

        for (int i = 0; i < array.length; i++) {

            palabras[contadorIndex] = palabraDesdeIndex(i,array);
            i += longuitudPalabra(i,array);
            contadorIndex++;

        }

        return palabras;

    }

    public static String Final(String text, String subtext){

        String[] arrayTextoNormal = Palabras(arrayDeChars(text));
        String[] arraySubText = Palabras(arrayDeChars(subtext));
        boolean[] array = new boolean[arrayTextoNormal.length];
        String Final = "";

        for (int i = 0; i < arraySubText.length; i++) {

            for (int j = 0; j < arrayTextoNormal.length; j++) {

                if (arrayTextoNormal[j].equals(arraySubText[i])){

                    array[j] = true;

                }

            }

        }

        for (int i = 0; i < arrayTextoNormal.length; i++) {

            if (!(array[i])){
                Final += arrayTextoNormal[i] + " ";
            }

        }

        return Final;
    }

}
