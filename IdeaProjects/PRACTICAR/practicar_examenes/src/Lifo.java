public class Lifo extends InsercioExtraccio {
    public void enLifo (int[] array) {
        if (arrayBuit(array)) {
            System.out.println("La matriz está vacía");
        }
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
