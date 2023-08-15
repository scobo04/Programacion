import java.sql.SQLOutput;
import java.util.Arrays;

public class Prova {
    public static void main(String[] args) {

        int[] array = {11,60,24,45,70,25,1,21};
        int index = 45;
        int mayor = 5;
        int i = mayor;

        System.out.println("Suma del array: " + suma(array));
        System.out.println("¿Está ordenado?: " + estaOrdenatAscendent(array));
        System.out.println("Valor mínimo en el array: " + minimoValor(array));
        System.out.println("Valor máximo en el array: " + maximoValor(array));
        System.out.println("Media del array: " + mediana(array));
        System.out.println("¿Elementos de indice impares ordenados de mayor a menor?: " + indexSenarsOrdenatsDescendentment(array));
        System.out.println("Índice con valor más pequeño: " + indiceValorMinimo(array));
        System.out.println("Índice con valor más grande: " + indiceValorMaximo(array));
        System.out.println("Array al revés: " + Arrays.toString(arrayAlRevesOrdenado(array)));
        System.out.println(indexDado(array, index));
        System.out.println(Arrays.toString(intercambioIndex(array, i)));


        System.out.println(numeroEsPrimo());


    }

    public static int numeroEsPrimo() {
        String resultado = "";

        int contador = 0;
        int numero = 1;
        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 primeros números primos son: " + resultado);
        return contador;
    }

    //CURSO JAVA
    public static boolean esPrimo(int numero) {
        boolean esUnNumeroPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }
        }

        return esUnNumeroPrimo;
    }

    //RETORNA ÍNDEX ON ES TROBA EL VALOR MÍNIM C
    public static int indiceValorMinimo(int[] array) {
        int indiceMasPequeno = 0;
        for (int k=0; k<array.length; k++) {
            if (minimoValor(array) == array[k]) {
                indiceMasPequeno = k;
            }
        }
        return indiceMasPequeno;
    }

    //RETORNA ÍNDEX ON ES TROBA EL VALOR MÀXIM E
    public static int indiceValorMaximo(int[] array) {
        int indiceMasGrande = 0;
        for (int l=0; l<array.length; l++) {
            if (maximoValor(array) == array[l]) {
                indiceMasGrande = l;
            }
        }
        return indiceMasGrande;
    }

    //MATRIZ ORDENADA DE MAYOR A MENOR, TRUE O FALSE F
    public static boolean estaOrdenatAscendent( int [] M){
        for ( int k = 0 ; k < M.length - 1 ; k++){
            if ( M[k] > M[k+1] )
                return false;
        }

        return true;
    }

    //SUMA TOTAL DEL ARRAY
    public static int suma(int[] array) {

        int suma = 0;

        for (int i = 0; i < array.length; i++){

            suma += array[i];

        }
        return suma;
    }

    //RETORNA VALOR MÍNIM B
    public static int minimoValor(int[] array) {
        int valorMasPequeno = array[0];
        for (int h=0; h<array.length; h++) {
            if (array[h] < valorMasPequeno) { //si array[0] < 21
                valorMasPequeno = array[h]; //21 = array[0]; --> 21 = 21;
            }
        }
        return valorMasPequeno;
    }

    //RETORNA VALOR MÁXIM D
    public static int maximoValor(int[] array){
        int valorMasGrande = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] > valorMasGrande) { //si array[0] > 21. i=1 --> si array[1] > 21
                valorMasGrande = array[i]; //21 = array[0]; --> 21 = 21; i=1 --> 21 = 45;
            }
        }
        return valorMasGrande;
    }

    //RETORNA MITJANA A
    public static float mediana(int[] array) {
        float media = 0.0F;

        media = (float) suma(array) / array.length;

        return media;
    }

    //RETORNA TRUE SI ELS INDEXS SENARS DE L'ARRAY ESTÁN ORDENATS DE FORMA DESCENDENT, SINO FALSE G
    public static boolean indexSenarsOrdenatsDescendentment( int [] array )  {

        // int[] array = {11,21,24,25,70,45,1,60};
        for (int i = 1; i < array.length - 2; i+=2){

            if (array[i] < array[i +2]){
                return false;
            }

        }

        return true;
    }

    //RETORNA NOVA MATRIU AMB ELS MATEIXOS VALORS PERÒ POSICIONATS EN ORDRE INVERS H
    public static int[] arrayAlRevesOrdenado(int [] array) {
        int[] arrayAlReves = new int[array.length];

        for (int k = 0; k<array.length; k++) {
            arrayAlReves[k] = array[array.length -1 -k];
        }
        return arrayAlReves;
    }

    //BUSCA INDICE DONDE APARECE UN NOMBRE DADO O EL VALOR -1 EN CASO DE QUE EL NOMBRE NO APAREZCA I
    public static int indexDado (int[] M, int index){
        for (int c=0;c<M.length;c++){
            if (M[c]==index){
                return c;
            }
        }
        return -1;
    }

    //10


    //11
    public static int[] intercambioIndex (int[] M,int i){
        int mayor = i;
        for (int c=i;c>=0;c--){
            if (M[c]>M[i]){
                mayor=c;
            }
        }
        int valorOriginal = M[mayor];
        M[mayor]=M[i];
        M[i]=valorOriginal;
        return M;
    }
}
