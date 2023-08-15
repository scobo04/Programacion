/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacioMatrius;

/**
 *
 * @author mg
 */
public class MultiplicacioMatrius {
    
    public static int[][] Multiplica(int [][] A, int B[][]) throws IllegalArgumentException {
        
        int ample_A, alt_A, ample_B, alt_B;
        int[][] resultat ; 
        
        alt_A = A.length;
        ample_A = A[0].length;
        
        alt_B = B.length;
        ample_B = B[0].length;
        
        if ( ample_A != alt_B ) {
            throw new IllegalArgumentException("Les Matrius no són multiplicables");
        }
        
        resultat = new int[alt_A][ample_B];
        
        for ( int k = 0 ; k < alt_A ; k++ ) {
            for ( int j = 0 ; j < ample_B ; j++ ){
                for ( int n = 0 ; n < ample_A ; n++ ){
                    resultat[k][j]+=A[k][n]*B[n][j];
                }
            }
        }
        
        return resultat;
        
    }
    
    public static void imprimirMatriu(int[][] M) {
        
        int ample_M, alt_M ;
        
        ample_M = M.length;
        alt_M = M[0].length;
        
        for ( int k = 0 ; k < ample_M ; k++ ){
            for ( int j = 0 ; j < alt_M ; j++ ){
                System.out.print(" "+M[k][j]);
            }
            System.out.println();
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] A={{1,0,0},
                   {3,4,2}
                  };
        
        int[][] B={{2,1},
                   {0,3},
                   {1,0}
                  };
        
        int [][] R;
        
        try {
            R=Multiplica(A,B);
            imprimirMatriu(R);
        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
                   
        } 
        
    }
    
}
