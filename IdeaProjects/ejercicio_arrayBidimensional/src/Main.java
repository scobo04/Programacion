public class Main {
    public static void main(String[] args) {

        int[][] array1 = {
                        {2,0,1,
                         3,0,0,
                         5,1,1}
                        };

        int[][] array2 = {
                        {1,0,1,
                         1,2,1,
                         1,1,0}
                        };

        System.out.println(multiplicacionMatrices(array1, array2));

    }


    public static int multiplicacionMatrices(int[] array1, int[] array2) {

        int multiplicacion1 = 0;
        int posicionA1 = 0;
        int posicionA2 = 0;

        for (int i = 0; i < array1.length-1; i++) {

            for (int j = 0; j < array2.length-1; j++) {

                if (array1[posicionA1] < array1.length && array2[posicionA2] < array2.length) {

                    //if (posicionA2) {

                        multiplicacion1 = array1[posicionA1] * array2[posicionA2];

                        //if (multiplicacion1(array2[posicionA2] <= array2[posicionA2]))

                        System.out.println(multiplicacion1);
                        if (posicionA2 <= array2.length-1) {
                            posicionA2++;
                        }

                    //}


                }
            }
        }
        return multiplicacion1;
    }




}