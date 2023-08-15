import java.util.Arrays;

public class Examen {

    public static void main(String[] args) {



    }

    //EXERCICI 3


    //EJERCICIO 4



    //EJERCICIO 5
    public boolean dicotomica(int[] array, int numero) {

        if (numero >= array[array.length / 2]) {

            for (int i = array.length / 2; i < array.length; i++) {

                if (numero == array[i]) {

                    return true;

                }

            }

        } else {

            for (int i = 0; i < array.length / 2; i++) {

                if (numero == array[i]) {

                    return true;

                }

            }

        }

        return false;
    }
    
    //EJERCICIO 6
    public int[][] multiplicarMatrices(int[][] array1, int[][] array2) {

        int[][] array3 = new int[array1.length][array2[0].length];

        if (array1.length != array2[0].length) {

            System.out.println("No son multiplicables");

        } else {

            for (int i = 0; i < array1.length; i++) {

                for (int j = 0; j < array2[0].length; j++) {

                    for (int k = 0; k < array1[0].length; k++) {

                        array3[i][j] += array1[i][k] * array2[k][j];

                    }

                }

            }

        }

        return array3;
    }

    public void imprimirMultiplicacion(int[][] array1) {

        for (int i = 0; i < array1.length; i++) {

            System.out.println();

            for (int j = 0; j < array1[0].length; j++) {

                System.out.print("[" + array1[i][j] + "] ");

            }

        }

    }

}
