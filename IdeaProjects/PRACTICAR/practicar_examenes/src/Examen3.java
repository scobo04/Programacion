public class Examen3 {
    //EXAMEN 19-12-2023

    public static void main(String[] args) {

        Examen3 examen3 = new Examen3();

        System.out.println(examen3.esPerfecto(examen3.n));
        examen3.imprimirPerfectosDeN(examen3.n);
        System.out.println();

        //examen3.devolverMatriz(examen3.array3);

        //System.out.println(examen3.deRomanoAEntero(examen3.nRomano));

    }

    /* EJERCICIO PALINDROMO LEETCODE
     public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        String numeroAString = Integer.toString(x);
        String numeroInvertido = "";

        for(int i = numeroAString.length() -1; i >= 0; i--) {
            numeroInvertido += numeroAString.charAt(i);
        }
        return numeroInvertido.equals(numeroAString);
    }
     */



    private final int n = 1000;

    private final int[][] array1 = {
            {4,65,6,
            54,5,6,
            6,4,2}
    };
    private final int[][] array2 = {
            {2,4,65,
            54,6,23,
            23,4,5}
    };
    int[][] array3 = multiplicacionMatrices(array1, array2);

    String nRomano = "DLXI";

    public boolean esPerfecto(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return (suma == n);
    }

    public void imprimirPerfectosDeN(int n) {
        for (int i = 1; i <= n; i++) {
            if (esPerfecto(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public int[][] multiplicacionMatrices(int[][] array1, int[][] array2) {
        int[][] array3 = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return array3;
    }

    public void devolverMatriz(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int deRomanoAEntero(String nRomano) {
        int suma = 0;
        int pre = 0;
        for(int i = 0; i < nRomano.length(); i++) {
            int valorActual = 0;
            if(nRomano.charAt(i) == 'I') {
                valorActual = 1;
            } else if(nRomano.charAt(i) == 'V') {
                valorActual = 5;
            } else if(nRomano.charAt(i) == 'X') {
                valorActual = 10;
            } else if(nRomano.charAt(i) == 'L') {
                valorActual = 50;
            } else if(nRomano.charAt(i) == 'C') {
                valorActual = 100;
            } else if(nRomano.charAt(i) == 'D') {
                valorActual = 500;
            } else if(nRomano.charAt(i) == 'M') {
                valorActual = 1000;
            }
            if(valorActual > pre) {
                suma += valorActual - 2 * pre;
            } else {
                suma += valorActual;
            }
            pre = valorActual;
        }
        return suma;
    }


}
