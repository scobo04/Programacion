import java.util.Arrays;

public class Examen3 {
    //19-12-2023

    public static void main(String[] args) {

        Examen3 examen3 = new Examen3();

        examen3.nPerfecto(examen3.n);
        System.out.println();

        System.out.println(Arrays.deepToString(examen3.multiplicarMatrices(examen3.a, examen3.b)));

        System.out.println(examen3.conversioRomanoADecimal(examen3.nRomano));

        System.out.println(examen3.esPanagrama(examen3.texto));//NO FUNCIONA

    }

    private final int n = 28;

    private final String nRomano = "MDC";

    private final String texto = "abcdefghijklmnñopqrstuvwxyz";

    private final int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    int[][] b = {
            {9,8,7},
            {6,5,4},
            {3,2,1}
    };


    private void nPerfecto (int n) {
        for (int i = 1; i < n -1; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }

    private int[][] multiplicarMatrices (int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    private int conversioRomanoADecimal (String nRomano) {
        int suma = 0;

        for (int i = 0; i < nRomano.length(); i++) {
            if (nRomano.charAt(i) == 'I') {
                suma += 1;
            } else if (nRomano.charAt(i) == 'V') {
                if (nRomano.charAt(i-1) == 'I') {
                    suma += 3;
                } else {
                    suma += 5;
                }
            } else if (nRomano.charAt(i) == 'X') {
                suma += 10;
            } else if (nRomano.charAt(i) == 'L') {
                suma += 50;
            } else if (nRomano.charAt(i) == 'C') {
                suma += 100;
            } else if (nRomano.charAt(i) == 'D') {
                suma += 500;
            } else if (nRomano.charAt(i) == 'M') {
                suma += 1000;
            }
        }
        return suma;
    }

    private boolean esPanagrama (String texto) { //NO FUNCIONA
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        int contador = 0;
        String temp = "";

        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if (texto.charAt(i) == alfabeto.charAt(j)) {
                    temp += texto.charAt(i);
                    break;
                }
            }
            //if (temp.contains(texto.charAt(i))) return true;
        }
        return false;
    }

}
