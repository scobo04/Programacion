public class Main {
    public static int elementMenorFinsFinal( int [] mat , int indexInicial ) {
        int indexElementMenor = indexInicial;

        //suposarem indexInicial coherent mat passada !! [ 0....lenght -1]
        // int[] arrayDeProva = { 5 , 2 , 12 , 1 , 16 , -5 , 12 , 14 }; index 0
        for ( int i = indexInicial + 1 ; i < mat.length ; i++ ){
            if ( mat[indexElementMenor] > mat[i] )
                indexElementMenor = i;
        }
        return indexElementMenor;
    }
    public static void ordenarMatriu( int[] M) {
        int indexCanvi = 0;
        int temp = 0;

        for (int k = 0 ; k < M.length ; k++ ){

            indexCanvi = elementMenorFinsFinal(M,k);
            temp = M[k];
            M[k] = M[indexCanvi]; // ( M[k] == M [indexCanvi] ) NO
            M[indexCanvi] = temp;
        }
    }
    public static void imprimirMatriu( int[] M){
        System.out.println();
        System.out.print("" +
                "{ ");
        // for ( int k = 0 ; k < M.length ; k++ )
        //   System.out.println(M[ k ] + ", ");
        for ( int k = 0 ; k < M.length ; k++ ){
            System.out.print( M[ k ]);
            if ( k < M.length -1 )
                System.out.print( ", ");
        }
        System.out.print( " }");
        System.out.println();
    }

    public static void main(String[] args) {
        // write your code here

        int[] arrayDeProva = { 5, 1 , 12 , -5 , 16 , 2 , 12 , 14 };

        int indexElementAIntercanviat = elementMenorFinsFinal(arrayDeProva,arrayDeProva.length-1);

        System.out.println(arrayDeProva[indexElementAIntercanviat]);

        imprimirMatriu(arrayDeProva);

        ordenarMatriu(arrayDeProva);

        imprimirMatriu(arrayDeProva);

        //codi per intercambiar index 0 1 index retornado

        // ja tendre el primer element de la matriu ordenado!!
    }
}