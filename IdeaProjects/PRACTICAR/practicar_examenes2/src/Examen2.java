import java.util.Arrays;

public class Examen2 {
    //EXAMEN 14-11-2019

    public static void main(String[] args) {
        Examen2 examen2 = new Examen2();

        System.out.println(examen2.mediaArray(examen2.array));

        System.out.println(examen2.valorMinimoArray(examen2.array));

        System.out.println(examen2.indiceValorMinimoArray(examen2.array));

        System.out.println(examen2.valorMaximoArray(examen2.array));

        System.out.println(examen2.indiceValorMaximoArray(examen2.array));

        System.out.println(examen2.arrayOrdenada(examen2.array));

        System.out.println(examen2.elementosIndicesImparesDescendente(examen2.array));

        System.out.println(examen2.arrayAlReves(examen2.array));

        System.out.println(examen2.indicePrimeraOcurrenciaNDado(examen2.array, examen2.n));

    }

    private final int[] array = {1,9,3,8,5,7,7,6};

    private final int n = 0;

    private float mediaArray (int[] array) {
        float suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return suma / array.length;
    }

    private int valorMinimoArray (int[] array) {
        int minimo = array[0];

        for (int i : array) {
            if (i < minimo) minimo = i;
        }

        return minimo;
    }

    private int indiceValorMinimoArray (int[] array) {
        int indiceMinimo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indiceMinimo]) indiceMinimo = i;
        }

        return indiceMinimo;
    }

    private int valorMaximoArray (int[] array) {
        int valorMaximo = array[0];

        for (int i : array) {
            if (i > valorMaximo) valorMaximo = i;
        }

        return valorMaximo;
    }

    private int indiceValorMaximoArray (int[] array) {
        int indiceMaximo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indiceMaximo]) indiceMaximo = i;
        }

        return indiceMaximo;
    }

    private boolean arrayOrdenada (int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i+1]) return false;
        }
        return true;
    }

    private boolean elementosIndicesImparesDescendente (int[] array) {
        for (int i = 1; i < array.length -1; i+=2) {
            if (array[i] < array[i+=2]) return false;
        }
        return true;
    }

    private String arrayAlReves (int[] array) {
        int[] arrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length -1 -i];
        }

        return Arrays.toString(arrayInvertido);
    }

    private int indicePrimeraOcurrenciaNDado (int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return i;
        }
        return -1;
    }

    /*private int valorMasCercanoALaMedia (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i])
        }
    }*/



}
