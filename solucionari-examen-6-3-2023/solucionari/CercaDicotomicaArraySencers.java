/**
 *
 * @author mg
 */
public class CercaDicotomicaArraySencers {

    public static int dicotomia(int cercat, int[] numsAmbOrdre) {
        
        int p = -1;

        int limitInferior = 0;
        int limitSuperior = numsAmbOrdre.length - 1 ;
        int posTest = limitSuperior / 2;
        
        while ( limitInferior <= limitSuperior ) {
        
            if (numsAmbOrdre[posTest]==cercat){
                p=posTest;
                break;
            }
            
            if (numsAmbOrdre[posTest]>cercat){
                limitSuperior=posTest-1;
            } else {
                limitInferior=posTest+1;
            }
            posTest= limitInferior + ( ( limitSuperior - limitInferior ) / 2 ) ;

        }

        return p;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] numsProva = {1, 2, 15, 16, 19, 25, 30, 45, 50};
        
        int lloc = dicotomia(45,numsProva);
        
        System.out.println("Està a la posició : "+lloc);

    }

}

