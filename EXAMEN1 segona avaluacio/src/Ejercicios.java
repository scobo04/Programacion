import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicios {
    public static void main(String[] args) {
        //DE EJERCICIO 4
        String texto = "soy sergio";
        char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //char[] delimitadorArray = {' ', '.', '!', '?', '-', '·', ','};
        System.out.println(cifradoCesar(texto, alfabeto, 3));
        System.out.println(descifradoCesar(texto, alfabeto, 3));

        /* MIO
        texto = cifrado(texto,alfabeto,delimitadorArray);
        System.out.println(texto);
        texto = descifrar(texto,alfabeto,delimitadorArray);
        System.out.println(texto);*/


        //DE EJERCICIO 5
        int[] array = {1,5,10,21,35,42,63,90};
        int n = 10;

        System.out.println(busquedaDicotomica(n,array));


        //DE EJERCICIO 6
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] b = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };

        System.out.println(Arrays.deepToString(matrizBidimensional(a, b)));


        /* MIO
        int[][] a = {
                {1,2,3},
                {4,5,6}
        };

        int[][] b = {
                {1,2},
                {3,4},
                {5,6}
        };

        int[][] c = new int[2][2];*/

    }

    //EJERCICIO 1


    //EJERCICIO 2
    //La signatura de un método es el método más su lista de parámetros.

    //OTRA RESPUESTA
    //Se denomina signatura de un método a lo que lo caracteriza de forma
    // inconfundible: su nombre y la serie de argumentos (número, tipo y orden).

    //EJERCICIO 3
    /*
    public static void punt () {
        private double x,y;
        public Punt (double x, double y) {
            this.x = x;
            this.y = y;
        }

        //..............


        public void moure (Punt p) {
            x = p.getX();
            y = p.getY();
        }

        public double distancia (Punt p) {
            double dx = x - p.getX();
            double dy = y - p.getY();

            return Math.sqrt(dx*dx+dy*dy);
        }
    }

    public static void poligono () {
        private ArrayList<Punt> llistaVertex = new ArrayList<Punt>();

        public Poligono (Punt ... llistaPunts) {
            for (Punt p : llistaPunts) {
                llistaVertex.add(p);
            }
        }

        public double calcularPerimetro () {
            double acumulado = 0;
            int next = 2;
            int tamany = llistaVertex.size();

            for (int i = 0; i < tamany; i++) {
                next = (tamany - 1 == i) ? 0 : i+1;
                acumulado += llistaVertex.get(i).distancia(llistaVertex.get(next))
            }

            return acumulado
        }

    }

    public static void perimetro () {
        Punt[] llistaPuntes = {new Punt}
    }
    */

    //EJERCICIO 4
    public static String cifradoCesar(String texto, char[] alfabeto, int posicion) {

        char[] delimitadorArray = {' ', '.', '!', '?', '-', '·', ','};

        texto = texto.toUpperCase();
        String codificado = "";

        for (int i = 0; i < texto.length(); i++) {

            for (int k = 0; k < delimitadorArray.length; k++) {
                if (texto.charAt(i) == delimitadorArray[k]) {
                    codificado += delimitadorArray[k];
                }
            }

            for (int j = 0; j < alfabeto.length; j++) {
                if (texto.charAt(i) == alfabeto[j]) {
                    codificado += alfabeto[(j + posicion) % alfabeto.length] ;
                }
            }

        }
        return codificado;
    }

    public static String descifradoCesar(String texto, char[] alfabeto, int posicion) {

        char[] delimitadorArray = {' ', '.', '!', '?', '-', '·', ','};
        texto = texto.toUpperCase();
        String descodificado = "";

        for (int i = 0; i < texto.length(); i++) {

            for (int j = 0; j < delimitadorArray.length; j++) {
                if (texto.charAt(i) == delimitadorArray[j]) {
                    descodificado += delimitadorArray[j];
                }
            }

            for (int k = 0; k < alfabeto.length; k++) {
                int indice = (k - posicion) % alfabeto.length;
                if (texto.charAt(i) == alfabeto[k]) {
                    descodificado += alfabeto[(k + alfabeto.length) % alfabeto.length] ;
                }
            }

        }
        return descodificado;
    }


    /* CÓDIGO EJERCICIO 4 EXAMEN
    public static String cifrar(String texto, char[] alfabeto, char[] delimitadores) {
        texto = texto.toUpperCase();
        String textoCodificado = "";

        for (int i = 0; i < texto.length(); i++) {
            texto.charAt(i) = alfabeto[i+3];
            for (int j = 0; j < delimitadores.length; j++) {
                if (texto.charAt(i) == delimitadores[j]) {
                    texto.charAt(i) = texto.charAt(i+1);
                }
            }
            textoCodificado += texto.charAt(i);
        }
        return textoCodificado;
    }

    public static String descifrar (String textoCodificado, char[] alfabeto, char[] delimitadores) {
        String frase = "";
        for (int i = 0; i < textoCodificado.length(); i++) {
            textoCodificado.charAt(i) = alfabeto[i-3];
            for (int j = 0; j < delimitadores.length; j++) {
                if (textoCodificado.charAt(i) == delimitadores[j]) {
                    textoCodificado(i) = textoCodificado.charAt(i+1);
                }
            }
            frase += textoCodificado.charAt(i);
        }
        return frase;
    }
    */


    /* EJEMPLO SOLUCIÓN
    public static String cifrado(String texto, char[] alfabeto, char[] delimitadores) {
        texto = texto.toUpperCase();
        String textoCodificado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != ' ') {
                int posicion = buscarPosicion(c, alfabeto);
                if (posicion >= 0) {
                    char cCodificado = alfabeto[(posicion + 3) % alfabeto.length];
                    textoCodificado += cCodificado;
                }
            } else {
                textoCodificado += c;
            }
        }
        return textoCodificado;
    }

    public static String descifrar(String textoCodificado, char[] delimitadores, char[] alfabeto) {
        String frase = "";
        for (int i = 0; i < textoCodificado.length(); i++) {
            char c = textoCodificado.charAt(i);
            if (c != ' ') {
                int posicion = buscarPosicion(c, alfabeto);
                if (posicion >= 0) {
                    char cDescifrado = alfabeto[(posicion - 3 + alfabeto.length) % alfabeto.length];
                    frase += cDescifrado;
                }
            } else {
                frase += c;
            }
        }
        return frase;
    }

    private static int buscarPosicion(char c, char[] alfabeto) {
        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == c) {
                return i;
            }
        }
        return -1;
    }
    */

    //EJERCICIO 5
    public static boolean busquedaDicotomica(int n, int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio] == n) {
                return true;
            } else if (array[medio] < n) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }


    /* CÓDIGO EJERCICIO 5 EXAMEN
    public static boolean busquedaDicotomica (int n, int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (n == array[i]) {
                return i;
            } else if (n > array.length / 2) {
                for (int j = array.length / 2; j < array.length; j--) {
                    if (n == array[j]) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }
    */


    //EJERCICIO 6
    public static int[][] matrizBidimensional (int[][] a, int[][] b) throws IllegalArgumentException {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Las matrices no son multiplicables");
        }

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


    /* CÓDIGO EJERCICIO 6 EXAMEN
    public int[][] matrizBidimensional(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < c.length; k++) {
                    c[i][j] = a[i] * b[j];
                }
            }
        }
        try {

        } catch (IllegalArgumentException exception) {
            System.out.println("Las matrices no son multiplicables");
        }
    }
    */

}