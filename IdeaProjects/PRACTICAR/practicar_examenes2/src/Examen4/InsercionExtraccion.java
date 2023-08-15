package Examen4;

public abstract class InsercionExtraccion {

    public static void main(String[] args) {

        InsercionExtraccion insercionExtraccion = new InsercionExtraccion() {
            @Override
            public boolean arrayVacio(int[] array) {
                return super.arrayVacio(array);
            }
        };

        System.out.println(insercionExtraccion.arrayVacio(insercionExtraccion.array));

    }

    int[] array = {};
    int longitudArray = array.length;

    public boolean arrayVacio  (int[] array) {
        if (longitudArray == 0) {
            return true;
        }
        return false;
    }
}
