package Examen4;

public class Lifo extends InsercionExtraccion {

    public void enLifo (int[] array) {
        if (arrayVacio(array)) {
            System.out.println("La matriz está vacía");
        }

        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
