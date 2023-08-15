public class Main {
    public static void main(String[] args) {

    }

    public static int [][] matrizMultiplicable (int [] [] A, int [][] B){
        int [] [] R;

        int ample_A = A[0].length;
        int alt_A = A.length;
        int ample_B = B[0].length;
        int alt_B = B.length;

        if (ample_A != alt_B){
            System.out.println("Les matrius NO son multipicables");
            return null;
        }
        R =  new int[alt_A][ample_B];

        for (int fila=0 ; fila < alt_A ; fila++){
            for (int col = 0 ; col < ample_B; col ++){

                for (int k = 0 ; k < ample_A; k++){
                    R[fila] [col] += A[fila][k] * B [k][col];
                }
            }
        }
        return R;
    }
}