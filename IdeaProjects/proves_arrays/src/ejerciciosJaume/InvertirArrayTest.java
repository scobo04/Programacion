package ejerciciosJaume;

import java.util.Arrays;

public class InvertirArrayTest {

    public static void main(String[] args) {

        InvertirArray prueba = new InvertirArray();
        int[] array = {1,45,54,87,21,12};
        prueba.nuevaArray(array);

        int[] array2 = {43,6,76,342,67,7,4,53,54};
        System.out.print("|| ");
        prueba.numerosPares(array2);

        int[] array3 = {342,98,90};
        int[] array4 = {32,54,45,67,4};
        System.out.println();
        System.out.println(Arrays.toString(prueba.juntarArrays(array3, array4)));

    }

}
