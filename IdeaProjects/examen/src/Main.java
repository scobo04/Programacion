public class Main {
    public static void main(String[] args) {

    }

    // ejercicio 1
    public static boolean saberSiEsPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] erastotenes(int n) {
        boolean[] primers = new boolean[n];
        for (int i = 0; i < primers.length; i++) {
            primers[i] = true;
        }

        primers[0] = false;
        primers[1] = false;

        for (int i = 2; i < primers.length; i++) {
            if (primers[i]) {
                for (int j = i * 2; j * i < primers.length; j+=i) {
                    primers[j] = false;
                }
            }
        }
        return primers;
    }

    public static int[] primersMenorsOIgualsQue(int n, boolean[] primers) {
        int contador = 0;
        for (int i = 0; i < primers.length; i++) {
            if (primers[i]) {
                contador++;
            }
        }

        int[] numerosPrimos = new int[contador];
        int contador2 = 0;

        for (int i = 0; i < primers.length; i++) {
            if (primers[i]) {
                numerosPrimos[contador2] = i;
                contador2++;
            }
        }
        return numerosPrimos;
    }

    public static void imprimirPrimers(boolean[] primers) {

    }

    public static void imprimirPrimers(int[] primers) {

    }


    // ejercicio 2
    public static String descomposicioFactorial(int n) {
        String resultat = "";
        int factor = 2;
        while (n != 1) {
            while (n % factor == 0) {
                n = n / factor;
                resultat += "  " + factor;
            }
            factor++;
        }
        return resultat;
    }

    // ejercicio 3
    public static boolean textConteStringALaPosicio(String text, String paraulaACercar, int pos) {
        if ((pos < 0) || (pos >= text.length())) {
            return false;
        }

        if ((pos + paraulaACercar.length()) > text.length()) {
            return false;
        }

        for (int r = 0; r < paraulaACercar.length(); r++) {
            if (paraulaACercar.charAt(r) != text.charAt(r+pos)) {
                return false;
            }
        }

        // contarNombreOcurrenciesParsulDinsText (...)

        return false;
    }
}