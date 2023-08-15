package Examen4;

public class Fifo extends InsercionExtraccion {


    public void enFifo (int[] array) {
        if (arrayVacio(array)) {
            System.out.println("La matriz está vacía");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
