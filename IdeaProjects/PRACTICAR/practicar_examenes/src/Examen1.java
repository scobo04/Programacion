import java.util.Arrays;

public class Examen1 {
    //EXAMEN 14-11-2019

    public static void main(String[] args) {
        Examen1 examen1 = new Examen1();
        System.out.println(examen1.mediaAritmeticaArray(examen1.array));

        System.out.println(examen1.valorMinimoArray(examen1.array));

        System.out.println(examen1.valorMaximoArray(examen1.array));

        System.out.println(examen1.indexValorMinimoArray(examen1.array));

        System.out.println(examen1.indexValorMaximoArray(examen1.array));

        System.out.println(examen1.estaOrdenadoAsc(examen1.array));

        System.out.println(examen1.indicesImparesOrdenadosDesc(examen1.array));

        System.out.println(examen1.matrizOrdenadaAlReves(examen1.array));

        System.out.println(examen1.indiceDado(examen1.array, examen1.n));

        System.out.println(examen1.valorMasCercanoALaMedia(examen1.array));

        int posicion = 5;
        System.out.println(examen1.valorMayorPosicionDadaHaciaAbajo(examen1.array, posicion));

        System.out.println(examen1.devolverArrayOrdenadaAsc(examen1.array));

    }

    private final int[] array = {1,9,7,3,11,3,7,2};
    private final int n = 1;

    public float mediaAritmeticaArray(int[] array) {
        float suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }

    public int valorMinimoArray(int[] array) {
        int minimo = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public int valorMaximoArray(int[] array) {
        int maximo = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public int indexValorMinimoArray(int[] array) {
        int indiceMinimo = 0;
        int minimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
                indiceMinimo = i;
            }
        }
        return indiceMinimo;
    }

    public int indexValorMaximoArray(int[] array) {
        int indiceMaximo = 0;
        int maximo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
                indiceMaximo = i;
            }
        }
        return indiceMaximo;
    }

    public boolean estaOrdenadoAsc(int[] array) {
        boolean ordenado = true;
        int indice = 0;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < array[i+1]) {
                indice++;
            } else {
                ordenado = false;
            }
        }
        return ordenado;
    }

    public boolean indicesImparesOrdenadosDesc(int[] array) {
        boolean ordenado = true;
        int indice = 0;
        for (int i = 1; i < array.length -2; i+=2) {
            if (array[i] > array[i+2]) {
                indice+=2;
            } else {
                ordenado = false;
            }
        }
        return ordenado;
    }

    public String matrizOrdenadaAlReves(int[] array) {
        int[] arrayAlReves = new int[array.length];
        for (int i = array.length -1; i >= 0; i--) {
            for (int j = 0; j < arrayAlReves.length; j++) {
                arrayAlReves[j] = array[i];
                i--;
            }
        }
        return Arrays.toString(arrayAlReves);
    }

    public int indiceDado(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public int valorMasCercanoALaMedia(int[] array) {
        int indiceMasCercano = 0;
        double media = mediaAritmeticaArray(array);
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(mediaAritmeticaArray(array) - array[i]) < Math.abs(media - array[indiceMasCercano])) {
                indiceMasCercano = i;
            }
        }
        return indiceMasCercano;
    }

    public String valorMayorPosicionDadaHaciaAbajo(int[] array, int posicion) {
        int indice = posicion;
        int valorMasGrande = array[posicion];
        int aux;
        for (int i = posicion; i >= 0; i--) {
            if (array[i] >= array[indice]) {
                valorMasGrande = array[i];
                indice = i;
            }
        }

        aux = array[posicion];
        array[posicion] = array[indice];
        array[indice] = aux;

        return Arrays.toString(array);
    }

    public String devolverArrayOrdenadaAsc(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                if (array[j] > array[j+1]) {
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        return Arrays.toString(array);
    }


}
