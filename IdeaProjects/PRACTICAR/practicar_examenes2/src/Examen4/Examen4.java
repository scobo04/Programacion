package Examen4;

public class Examen4 {
    //27-03-2023

    public static void main(String[] args) {

        Examen4 examen4 = new Examen4();

        examen4.imprimirBubbleSort(examen4.bubbleSortArray(examen4.array));



    }

    private final int[] array = {3,65,43,2,65,1,34};


    private int[] bubbleSortArray (int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private void imprimirBubbleSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
