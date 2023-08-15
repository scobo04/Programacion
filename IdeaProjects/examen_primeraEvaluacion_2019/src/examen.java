public class examen {

    public static void main(String[] args) {

        int[] array = {43,72,13,41,56,2,6,1};
        int index = 41;
        int posicion = 2;

        //1
        System.out.println("Media del array: " + medianaMatriz(array));

        //2
        System.out.println("Valor mínimo del array: " + valorMinimo(array));

        //3
        System.out.println("Índice menor del array: " + indiceMinimo(array));

        //4
        System.out.println("Valor máximo del array: " + valorMaximo(array));

        //5
        System.out.println("Índice mayor del array: " + indiceMaximo(array));

        //6
        System.out.println("¿Está ordenado el array de mayor a menor?: " + matrizOrdenadaDescendentemente(array));

        //7
        System.out.println("¿Están ordenados los índices pares del array de forma ascendente?: " + indicesParesOrdenadosAscendientemente(array));

        //8
        System.out.print("Nueva matriz al revés: ");
        nuevaMatrizAlReves(array);

        //9
        System.out.println("\nÍndice dado: " + indexDado(array, index));

        //10
        System.out.println("Índice más cercano a la mediana: " + indiceMasCercanoALaMediana(array));

        //11
        System.out.print("Nueva matriz sobreescrita: ");
        imprimeMatrizEjercicio11(sobrescribePosicionDada(array, 2));

        //12 NO FUNCIONA
        System.out.println();
        matrizOrdenadaEjercicio11(array,posicion);
    }

    // 1- Mètode estàtic que retorni la mitja aritmètica dels valors continguts dins la matriu.
    public static double medianaMatriz(int[] array) {

        double suma = 0;

        for (int i = 0; i < array.length; i++) {

            suma += array[i];

        }
        return suma / array.length;
    }

    // 2- Mètode estàtic que retorni el valor mínim dels valors continguts dins la matriu.
    public static int valorMinimo(int[] array) {

        int minimo = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minimo) {

                minimo = array[i];

            }

        }
        return minimo;
    }

    // 3- Mètode estàtic que retorni l’índex on hi ha el valor mínim dels valors de la matriu.
    public static int indiceMinimo(int[] array) {

        int minimo = array[0];
        int indiceMenor = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minimo) {

                minimo = array[i];
                indiceMenor = i;

            }

        }
        return indiceMenor;
    }

    // 4- Mètode estàtic que retorni el valor màxim dels valors continguts dins la matriu.
    public static int valorMaximo(int[] array) {

        int maximo = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maximo) {

                maximo = array[i];

            }

        }
        return maximo;
    }

    // 5- Mètode estàtic que retorni l’índex on hi ha el valor màxim dels valors continguts
    // dins la matriu.
    public static int indiceMaximo(int[] array) {

        int indiceMayor = 0;
        int maximo = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maximo) {

                maximo = array[i];
                indiceMayor = i;

            }

        }
        return indiceMayor;
    }

    // 6- Mètode estàtic que retorni true si la matriu està ordenada de forma descendent i
    // false en cas contrari.
    public static boolean matrizOrdenadaDescendentemente(int[] array) {

        boolean ordenado = true;
        int indice = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[indice] > array[indice + 1]) {

                indice++;

            } else {

                ordenado = false;

            }

        }
        return ordenado;
    }

    // 7- Mètode estàtic que retorni true si la matriu té els elements d’índex parell ordenats
    // de forma ascendent i false en cas contrari.
    public static boolean indicesParesOrdenadosAscendientemente(int[] array) {

        boolean ordenado = true;
        int indice = 0;

        for (int i = 0; i < array.length - 2; i += 2) {

            if (array[indice] < array[indice += 2]) {

                ordenado = true;

            }else {

                ordenado = false;

            }
        }
        return ordenado;
    }

    // 8- Mètode estàtic que retorni una nova matriu amb els mateixos valors però posicionats
    // en ordre invers, el que hi havia al primer lloc que estigui al darrer lloc de la nova
    // matriu, etc.
    public static void nuevaMatrizAlReves(int[] array) {

        for (int i = array.length - 1; i >= 0 ; i--) {

            System.out.print(array[i] + " ");
            /*
            System.out.print(array[i]);
             */
        }

        //NO FUNCIONA
        /*
        int[] arrayAlReves = {};

        for (int i = 0; i < array.length; i++) {

            arrayAlReves[i] = array[array.length -i -1];
            String guardarArray = String.valueOf(arrayAlReves[i]);

        }

         */
    }

    // 9- Mètode estàtic que ens cerqui l’índex on es doni la primera ocurrència, el primer
    // lloc on apareix, un nombre donat o el valor -1 en cas que aquest nombre no estigui
    // dins la matriu.
    public static int indexDado(int[] array, int index) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == index) {

                return i;

            }

        }

        return -1;
    }

    // 10- Mètode estàtic que ens retorni el valor més proper de la mirja aritmètica dels valors
    // continguts dins la matriu unidimensional.
    public static int indiceMasCercanoALaMediana(int[] array) {

        int indiceMasCercano = 0;

        double media = medianaMatriz(array);

        for (int i = 0;  i < array.length; i++) {

            if (Math.abs(medianaMatriz(array) - array[i]) < Math.abs(media - array[indiceMasCercano])) {

                indiceMasCercano = i;

            }

        }
        return indiceMasCercano;
    }

    // 11- Mètode estàtic que donada una posició de la matriu cerqui el valor major de la part de
    // la matriu que comença per aquesta posició fins al principi i l’intercanvii amb el valor de
    // la posició donada.
    public static int valorMayorDeLaPosicionDada(int[] array, int posicion) {

        int indiceValorMasGrande = posicion;

        for (int i = posicion; i >= 0; i--) {

            if (array[i] > array[indiceValorMasGrande]) {

                indiceValorMasGrande = i;

            }

        }
        return indiceValorMasGrande;
    }
    public static int[] sobrescribePosicionDada(int[] array, int posicion) {

        int valorIndiceOriginal = array[posicion];
        int indiceValorMasGrandeEncontrado = valorMayorDeLaPosicionDada(array, posicion);

        array[posicion] = array[valorMayorDeLaPosicionDada(array, posicion)];
        array[indiceValorMasGrandeEncontrado] = valorIndiceOriginal;

        return array;

    }
    public static void imprimeMatrizEjercicio11(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    // 12- Mètode estàtic, que emprant el mètode anterior, ens retorni la matriu ordenada.
    public static void matrizOrdenadaEjercicio11(int[] array, int posicion) {



    }

}