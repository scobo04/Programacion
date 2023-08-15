public class examen1 {

    public static void main(String[] args) {

        //multiplesDeN(8);
        //generaMultiples(8, 1000);
        //desactivarNoPrimos(8, 1000);

    }

    /*

    1- Calcula els nombres primers menors d’un nombre donat emprant el
    sedaç d’Erastótenes. El mètode ens ha de retornar una matriu amb
    tots els nombres primers menors del nombre donat. ( 3 punts )

    */
    //Si metes un 10 tiene que imprimir los primeros 10 numeros primos.

    public static boolean esPrimo(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                return false;

            }

        }
        return true;
    }


    public static void multiplesDeN(int n) {

        for (int i = 2; i < 1000; i++) {

            if (n * i < 1000) {

                System.out.println(n*i);

            }

        }

    }

    public static void generaMultiples( int nombre , int maxim ){

        // has de generar els múltiples de nombre menors que maxim

        for (int i = 2; i * nombre < maxim; i++) {

            System.out.println(nombre*i);

        }

    }


    public static boolean desactivarNoPrimos(int nombre, int maxim) {

        for (int i = 2; i * nombre < maxim; i++) {

            if (!esPrimo(i)) {

                return false;

            }

        }
        return true;
    }


    public static boolean[] sedacErastotenes( int max ){

        boolean[] sedac = new boolean[max];

        // suposo que despres de la creacio de la matriu tots estan a true

        for ( int index = 2 ; index < max ; index++ ){

            if ( sedac[index] ){

                // he de desactivar els elements multiples de l index


            }
        }

        return sedac;



    }






    public boolean[] arrayBooleanos(int n) {

        boolean[] array = new boolean[n];
        for (int i = 2; i < array.length; i++) {

            if (esPrimo(i)) {

                array[i] = true;

            }

        }

        return array;
    }



/*
    public static int[] imprimirNPrimos(int n) {

        int [] numeros = new int[];

    }
*/

    /*

    2- Calcula la descomposició factorial d’un nombre donat. ( 3 punts )

     */



}
