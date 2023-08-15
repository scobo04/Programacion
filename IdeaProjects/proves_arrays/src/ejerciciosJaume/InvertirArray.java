package ejerciciosJaume;

import java.util.Arrays;

public class InvertirArray {

    public void nuevaArray(int[] array) {

        for (int i = array.length -1; i >= 0; i--) {

            System.out.print(array[i] + " ");

        }

    }

    /*
    EJERCICIO JAUME
    array -->1,2,3,4,5,6
    con metodo sacar numeros pares y meterlo en otra array
     */
    public void numerosPares(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");

            }

        }
    }

    /*
    EJERCICIO JAUME
    tenemos dos arrays y hay que juntarlos y ordenarlos de menor a mayor
     */
    public int[] juntarArrays(int[] array, int[] array2) {

        Arrays.sort(array);
        Arrays.sort(array2);

        int[] resultado = new int[array.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array.length && j < array2.length) {

            if (array[i] < array2[j]) {

                resultado[k++] = array[i++];

            } else {

                resultado[k++] = array2[j++];

            }

        }

        while (i < array.length) {

            resultado[k++] = array[i++];

        }

        while (j < array2.length) {

            resultado[k++] = array2[j++];

        }
        return resultado;
    }

}


