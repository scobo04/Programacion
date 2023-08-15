public class Examen4 {
    //EXAMEN 27-03-2023

    public static void main(String[] args) {

        Examen4 examen4 = new Examen4();

        examen4.imprimirArray(examen4.bubbleSort(examen4.array));

        //examen4.metodeSainteLague();


    }

    private final int[] array = {43,65,32,1,3,5,34};


    //1- Programa l’algoritme d’ordenació bublesort que rebi un array
    //de sencers i el retorni ordenat. ( 3 p.)
    public int[] bubbleSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j+1]) {
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        return array;
    }

    public void imprimirArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    //2- FIFO ( First In First Out ) i LIFO ( Last In First Out )
    //són dues polítiques d’inserció i extracció a coleccions. La
    //diferència és obvia la primera és una coa i la segona és una pila.



    //3- Programa el mètode de Sainte-Laguë per tal de saber el
    //repartiment en escons. Suposa que al teu mètode li passan
    //un array d’strings amb els noms dels partits, un array d’ints
    //amb els vots per partit, el nombre d’escons a repartir.
    //Fes-ne una versió pel mètode modificat on a més se li passa el
    //percentatge mínims de vots que s’ha de superar per entrar en
    //el repartiment. ( 4 p.)
    public int[] metodeSainteLague (String[] partit, int[][] vots, int nEsconsTotals) {
        int major = vots[0][0];
        int[] esconsPerPartit = {};
        for (int i = 0; i < vots.length; i++) {
            for (int j = 0; j < vots[0].length -1; j++) {
                if (vots[i][j] > vots[0][j+1]) {
                    major = vots[i][j];
                }
            }
        }
        return esconsPerPartit;
    }


}
