import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Examen dicotomica = new Examen();
        int[] array = {1, 5, 67, 98, 256, 788, 888, 900};
        System.out.print(dicotomica.dicotomica(array, 98));


        Examen multiplicar = new Examen();

        int[][] array1 = {
                {1, 65, 67},
                {56, 5, 32},
                {21, 54, 8}
        };
        int[][] array2 = {
                {21, 27, 7},
                {35, 98, 12},
                {4, 23, 6}
        };

        Examen imprimir = new Examen();

        System.out.println(Arrays.deepToString(multiplicar.multiplicarMatrices(array1, array2)));
        imprimir.multiplicarMatrices(array1, array2);

    }
}
