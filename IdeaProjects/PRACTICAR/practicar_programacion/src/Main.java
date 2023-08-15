public class Main {
    public static void main(String[] args) {

        int n;

        System.out.println(saberSiEsPrimo(39));

        System.out.println("----------------------");

        System.out.println(descomposicionFactorial(39));

        //System.out.println(devuelveMatriz(9));


    }

    // ejercicio 1
    public static boolean saberSiEsPrimo(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] devuelveMatriz(int n) {
        boolean[] matriz = new boolean[n];
        for (int i = 2; i < matriz.length; i++) {
            if (saberSiEsPrimo(i)) {
                matriz[i] = true;
            }
        }
        return matriz;
    }

    public static int[] numerosPrimos(boolean[] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]) {
                contador++;
            }
        }

        int[] numerosPrimos = new int[contador];
        int contador2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]) {
                numerosPrimos[contador2] = i;
                contador2++;
            }
        }
        return numerosPrimos;
    }

    // ejercicio 2
    public static int descomposicionFactorial(int n) {
        int[] arrayDePrimos = numerosPrimos(devuelveMatriz(n));

        for (int i = 0; i < arrayDePrimos.length; i++) {
            if (n % arrayDePrimos[i] == 0) {
                while (n % arrayDePrimos[i] == 0) {
                    System.out.println(n + "/" + arrayDePrimos[i]);
                    n = n/arrayDePrimos[i];
                }
            }
        }
        return n;
    }

    // ejercicio 3


}


/*

n = 100
i = 2

i % 2 == 0 --> 2 % 2 == 0



NUMEROS PRIMOS
Se puede dividir entre 1 y él mismo.

*/