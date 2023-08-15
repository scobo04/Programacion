public class examen {

    public static void main(String[] args) {

        String frase = "Anina, estoy programando con anina."; //cambiar palindromas a toLowerCase
                      //0123456789012345678901234567890123

        //3
        imprimirArrayDeChars(pasarDeStringAArrayDeChars(frase));

        //4
        System.out.println("\n¿Es un delimitador?: " + esDelimitador(pasarDeStringAArrayDeChars(frase), 0));

        //5
        System.out.println("¿Es inicio de palabra?: " + inicioDePalabraONo(pasarDeStringAArrayDeChars(frase), 6));

        //6
        System.out.println("Longitud de la palabra: " + longitudPalabra(pasarDeStringAArrayDeChars(frase), 6));

        //7
        System.out.println("Palabra: " + devuelvePalabra(frase, 0));

        //8
        System.out.println("¿Es palindroma?: " + esPalindromo(devuelvePalabra(frase, 0)));

        //9
        System.out.println("Número de palabras palindromas: " + palabrasPalindromasDeLaFrase(frase));

        //10
        //System.out.println("Palabras palindromas: " + palabrasPalindromas(frase));

        //11
        imprimirPalabrasPalindromas(palabrasPalindromas(frase));

        //12
        devuelveArrayBidimensional(arrayBidimensional(frase));

        //14
        arrayOrdenadaAscendentemente()

    }

    public static void deArrayUnidimensionalABidimensional() {

        char[] array_prueba = {'A','B','C','D','E','F','G'};

        int contador = 0;
        int cols = 2;

        for (int i = 0; i < array_prueba.length-1; i++) {

            //..............

        }

    }



    // 1- La classe ha d’analitzar un text que es definirà emprant un
    // String on se suposa que només hi haurà caràcters corresponents a
    // l’alfabet anglès ( a-zA-Z ) i els següents delimitadors : ‘ ‘
    // (espai en blanc), ‘-’ (guió) , ‘,’ (coma) , ‘.’ (punt),‘!’
    // (admiració), ‘?’ (interrogant),’’’ (apostrof. Pots programar tot
    // el problema suposant que no hi apareixerà cap altre tipus de
    // caràcter. Has de tenir present que consideram que la frase està
    // formada per paraules separades per un o més delimitadors.


    // 2- La frase a analitzar podrà tenir majúscules i minuscules i
    // estarà definida mitjançant un String. Per tant has de programar
    // un mètode per passar l’String inicial a una matriu de chars que
    // només contengui lletres minúscules i delimitadors, has de
    // convertir les lletres majúscules a l’equivalent en minúscula
    // ( mètodes toLowerCase() i charAt() de la classe String ).
    // Aquesta matriu de chars serà la que hauràs d’emprar a la majoria
    // de tractaments d’aquest examen.

    /* MAL
    public static String posicionFraseDada(String frase) {

        String palabra = frase.charAt(3)

        return palabra;
    }

     */

    public static char[] pasarDeStringAArrayDeChars(String frase) {

        char[] Array = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {

            Array[i] = frase.toLowerCase().charAt(i);

        }
        return Array;
    }

    // 3- També has de programar un mètode que pugui imprimir una matriu
    // de chars passada per paràmetre.
    public static void imprimirArrayDeChars(char[] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            System.out.print(matriz[i]);

        }

    }

    // 4- Has de programar també un mètode que ens determini , mitjançant
    // el retorn d’un valor de veritat, si una posició específica d’una
    // matriu de chars és un dels delimitadors definits o no.
    public static boolean esDelimitador(char[] matriz, int posicion) {

        char[] delimitadores = {'!',' ','.','-',',','?','\''};

        for (int i = 0; i < delimitadores.length; i++) {

            if (matriz[posicion] == delimitadores[i]) {

                return true;

            }

        }
        return false;
    }

    // 5- Programa també un mètode que ens retorni true o false depenent de si a una matriu de
    // chars en una posició donada és inici de paraula o no.
    public static boolean inicioDePalabraONo(char[] Array, int posicion) {

        if (posicion != 0) {

            if (esDelimitador(Array, posicion - 1) && !esDelimitador(Array, posicion)) {

                return true;

            }
            else {

                return false;

            }

        }
        return false;
    }

    // 6- Codifica també un mètode que ens retorni quina longitud té una paraula suposant que
    // aquesta paraula comença a un index donat de la matriu de chars.
    public static int longitudPalabra(char[] Array, int posicion) {

        int longitud = 0;

        if (inicioDePalabraONo(Array, posicion)) {

            while (!esDelimitador(Array, posicion)) {

                posicion++;
                longitud++;

            }

        }
        return longitud;
    }

    // 7- Després programa un mètode que ens retorni un String que contengui la paraula que comenci
    // a un determinat index de la matriu de chars, pots suposar que qui cridi aquest mètode ja s’ha
    // assegurat que a la posició que passam per paràmetre hi ha un inici de paraula.
    public static String devuelvePalabra(String frase, int posicion) {

        String palabra = "";

        for (int i = posicion; i < frase.length(); i++) {

            if (!esDelimitador(pasarDeStringAArrayDeChars(frase), posicion)) {

                palabra += frase.toLowerCase().charAt(i);
                posicion++;

            }
        }
        return palabra;
    }


    // 8- Programa un mètode que donat un String que se li passi per paràmetre ens retorni true o
    // false depenent de si és palíndroma o no.
    public static boolean esPalindromo(String palabra) {

        char[] textoCaracteres = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            textoCaracteres[i] = palabra.charAt(i);

        }

        for (int j = 0; j < textoCaracteres.length / 2; j++) {

            if (textoCaracteres[j] != textoCaracteres[palabra.length() - 1 - j]) {

                return false;

            }
        }
        return true;
    }

    /*

    public static boolean esPalindromo(String palabra) {

        char[] textoCaracteres = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++) {

            textoCaracteres[i] = palabra.charAt(i);

        }

        if (textoCaracteres.length % 2 == 0) {

            for (int j = 0; j < textoCaracteres.length / 2; j++) {

            }

            if (textoCaracteres[i] == textoCaracteres[palabra.length() -1 -i]) {

                return false;

            }
            return true;
        }
        return false;
    }

     */



    // 9- Codifica un mètode que ens retorni el nombre de paraules palíndromes que conté el text
    // codificat a una matriu de chars.
    public static int palabrasPalindromasDeLaFrase(String frase) {

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (inicioDePalabraONo(pasarDeStringAArrayDeChars(frase), i)) {

                String palabra = devuelvePalabra(frase, i);

                if (esPalindromo(palabra)) {

                    contador++;

                }
            }
        }
        return contador;

        /*

        String palabra = devuelvePalabra(frase, i);

        if (esPalindromo(palabra)) {

        contador++;

        }

        */



        /*
        for (int i = 0; i < frase.length(); i++) {

            if (esPalindromo(palabra)) {

                contador++;

            }

        }

         */



            /*
            for (int j = 0; j < palabra.length() / 2; j++) {

                if (esPalindromo(palabra)) {

                    contador++;

                }
            }

             */

            /*
            for (int j = 0; j < palabra.length() / 2; j++) {

                if (textoCaracteres[i] == textoCaracteres[palabra.length() - 1 - j]) {

                    contador++;

                }

            }

             */
    }


    // 10- Ara has de programar un mètode que ens retorni un array d’Strings amb la llista de
    // paraules palíndromes que conté el text codificat a una matriu de chars.
    public static String[] palabrasPalindromas(String frase) {

        String[] mostrarPalabrasPalindromas = new String[palabrasPalindromasDeLaFrase(frase)];
        char[] arrayDeChars = pasarDeStringAArrayDeChars(frase);
        String palabra = "";

        int contador = 0;

        for (int i = 0; i <= arrayDeChars.length-1; i++) {

            if (inicioDePalabraONo(arrayDeChars, i)) {

                palabra = devuelvePalabra(frase, i);

                if (esPalindromo(palabra)) {

                    mostrarPalabrasPalindromas[contador] = palabra;
                    ++contador;

                }

            }

        }
        return mostrarPalabrasPalindromas;

        /*

        String[] mostrarPalabrasPalindromas = new String[palabrasPalindromasDeLaFrase(frase)];

        int contador = 0;

        for (int i = 0; i <= palabrasPalindromasDeLaFrase(frase); i++) {

            if (esPalindromo(devuelvePalabra(frase, i))) {

                mostrarPalabrasPalindromas[contador] = devuelvePalabra(frase, i);
                contador++;

            }

        }
        return mostrarPalabrasPalindromas;

         */



        /*
        if (esPalindromo(palabrasPalindromas(frase))) {

            System.out.println(frase);

        }

         */

    }


    // 11- Programa un mètode que donat un array d’Strings passat per paràmetres ens imprimeixi per
    // pantalla tots els Strings continguts en aquest array.
    public static void imprimirPalabrasPalindromas(String[] frase) {

        System.out.print("Las palabras palindromas son: ");

        for (int i = 0; i < frase.length; i++) {

            System.out.print(frase[i] + " ");

        }

    }


    // 12- Programa un mètode que analitzi l’array de chars que conté el text ( passa-li com a
    // paràmetre ) i ens retorni un array bidimensional de sencers que contengui el nombre
    // d’aparicions de les diferents combinacions de dues lletres de l’alfabet anglès. Per exemple
    // l’element d’indexos [0,0] ha de contenir el nombre de cops que la seqüència «aa» apareix a
    // la matriu de chars que conté el text en chars i minúscules.
    public static int[][] arrayBidimensional(String frase) {

        int[][] bidimensional = new int[26][26];

        char[] arrayDeChars = pasarDeStringAArrayDeChars(frase);

        for (int i = 0; i < frase.length(); i++) {

            if (!esDelimitador(arrayDeChars, i) && !esDelimitador(arrayDeChars, i+1)) {

                bidimensional[arrayDeChars[i] - 'a'] [arrayDeChars[i+1] - 'a'] += 1;

            }
        }
        return bidimensional;
    }


    // 13- Codifica un mètode que ens imprimeixi aquestes estadístiques del punt anterior tal com
    // surten a l’output definit a l’annex.
    public static void devuelveArrayBidimensional(int[][] frase) {

        int contador = 0;
        char letra = 'a';

        for (int i = 0; i < frase.length; i++) {

            for (int j = 0; j < frase.length; j++) {

                if (contador % 13 == 0) {

                    System.out.println();

                }

                System.out.print((char) (letra+i) + "+" + (char) (letra+j) + " = " + frase[i][j] + " | ");
                contador++;

            }

        }

    }


    // 14- Programa un mètode que donada un array d’Strings ens ho ordeni de forma ascendent
    // emprant el criteri de longitud de l’String.
    public static String[] arrayOrdenadaAscendentemente(String[] frase) { //EL OTRO MÉTODO NO ESTÁ HECHO

        String menor = frase[0];

        for (int i = menor.length(); i < frase.length; i++) {

            if (frase[i].length() < menor.length()) {

                menor = frase[i];

            }

        }
        return frase;
    }


    public static void imprimeOrdenarAscendentementeArray(String frase) {



    }


    // 15- Codifica un mètode que ens imprimeixi una llista de paraules de forma vertical.



    // 16- Empra tot lo programat anteriorment per generar amb el mètode main de la classe tot
    // l’output que surt a l’annex.



}
