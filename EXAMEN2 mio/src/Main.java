public class Main {
    //algoritmos + estructuras de datos = programas
    public static void main(String[] args) {

        String texto = "abcdfgh";

        //VERSION EJERCICIO3 PROFESOR
        /*
        private static final char[] lletresRomanes = {'I','V','X','L','C','D','M'};
        private static final int[] numeros = {1,5,10,50,100,500,1000};

        private statuc ubt valorDigitRoma (char digit) {

            for(int i = 0; i < digitsRomans.length; i++) {

                if(digit == digitsRomans[i]) {

                    return valorDigitsRomans[i];

                }

            }
            return 0;

        }

        public static int conversioANombreDecimal(String nombreRoma) {

            int numeroDecimal = 0;
            int difitActual = 0;
            int signe;
            int valorDigitROmaAnterior = 0;

            //Ejemplo --> CMXXIV

            for(int i = nombreRoma.length() -1; i>= 0; i--) {

                digitActual = valorDigitROma(nombreROma.charAt(i));

                signe = (valorDigitROmaAnterior > digitRoma) ? 1 : -1;

                numeroDecimal += signe * digitActual;

                valorDigitRomaAnterior = digitActual;

            }
            return numeroDecimal;
        }

        */

        //LLAMADA DE MÉTODOS
        //System.out.println(esPerfecto(28));
        //primerosNPerfectos(28);
        //numero('X'); //NO IMPRIME, MÉTODO DE IMPRIMIR MAL
        System.out.println(panagrama(texto));

    }

    //EJERCICIO 1
    //a)
    public static boolean esPerfecto(int n) {

        int suma = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {

                suma += i;

            }

        }
        return suma == n;
    }

    //b)
    public static void primerosNPerfectos(int n) {

        int contPerfectos = 0;
        int nombreCandidato = 1;

        while (contPerfectos < n) {

            if (esPerfecto(nombreCandidato)) {

                System.out.println(nombreCandidato);
                contPerfectos++;

            }
            nombreCandidato++;

        }

        //NOS PIDE LOS PRIMEROS NUMEROS PERFECTOS, NO LOS PRIMEROS PERFECTOS DE N.
        /*
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {

                System.out.print(i + " ");

            }

        }

         */

    }

    //EJERCICIO 2
    public static int[][] multiplicarMatrices(int[][] array1, int[][] array2) {

        // A[3][4] ==> @A + 3 * tamañoFila + 4

        int ample_A = array1.length;
        int alt_A = array1[0].length;

        int ample_B = array2.length;
        int alt_B = array2[0].length;


        int[][] resultado = new int[alt_A][ample_B];

        if (ample_A != alt_B) {

            return null; // LES MATRIUS NO SON MULTIPLICABLES

        }
        //ARA JA SABEM QUE SÍ HO SON
        else {

            for (int fila = 0; fila < ample_A; fila++) {

                for (int columna = 0; columna < ample_B; columna++) {

                    for (int k = 0; k < ample_A; k++) {

                        resultado[fila][columna] += array1[fila][k] * array2[k][columna];

                    }

                }

            }
        }
        return resultado;
    }

    //EJERCICIO 3
    public static int numerosRomanos(char letraRomana) {

        int numero = 0;
        char[] letrasRomanas = {'I','V','X','L','C','D','M'};
        int[] numeros = {1,5,10,50,100,500,1000};

        for (int i = 0; i < letrasRomanas.length; i++) {

            if (letrasRomanas[i] == letraRomana) {

                numero = numeros[i];

            }

        }
        return numero;
    }

    public static void numero(int letra) {

        System.out.println(numerosRomanos('X'));

    }

    //EJERCICIO 4

    /*

    public static int indexLletra(char c) {

        if((c >= 'a') || (c <= 'z')) {

            //ME FALTA EL CODIGO

        }
        return c - 'a';

    }

     */

    public static boolean panagrama(String texto) {

        boolean EsPanagrama = true;
        char[] alfabeto = {'a','b','c','d','e','f','g','h'};

        /*
        //VERSIÓ PROFESOR
        String motEnMinuscules = mot.toLowerCase();
        boolean[] lletresTrobades = new boolean[alfabet.length()];

        for(int i = 0; i < mot.enMinuscules.length() ; i++) {

            index = motEnMinuscules.char.At(i) - 'a';
            lletresTrobades[index] = true;
            //PARA EL METODO indexLletralletresTrobades[indexLletra(motEnMinuscules.charAt(i))] = true;

        }

        for(int i = 0; i < alfabet.length(); i++) {

            if( ! lletresTrobades[i]) {

                return false;

            }

        }


         */


        for (int i = 0; i < alfabeto.length; i++) {

            for (int j = 0; j < texto.length(); j++) {

                if (texto.charAt(j) == alfabeto[i]) {

                    EsPanagrama = true;
                    break;

                }else {

                    EsPanagrama = false;

                }

            }

            if (!EsPanagrama) {

                return false;

            }

        }
        return true;
    }


}