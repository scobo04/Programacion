public class Fifo extends InsercioExtraccio {
    public void enFifo (int[] array) {
        if (arrayBuit(array)) {
            System.out.println("La matriz está vacía");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
