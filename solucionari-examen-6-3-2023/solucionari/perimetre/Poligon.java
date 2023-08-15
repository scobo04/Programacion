package perimetre;

import java.util.ArrayList;

/**
 *
 * @author mg
 */
public class Poligon {
    private ArrayList<perimetre.Punt> llistaVertex = new ArrayList<perimetre.Punt>();
    
    public Poligon( perimetre.Punt... llistaPunts) {
        
        for ( perimetre.Punt p : llistaPunts ){
            llistaVertex.add(p);
        }
    }
    
    public double calcularPerimetre(){
        
        double acumulat = 0;
        
        int next = 2 ;
        
        int tamany = llistaVertex.size();        
        
        for ( int i = 0 ; i < tamany ; i++) {
            next = ( tamany - 1 == i ) ? 0 : i+1 ;

            /* ES LO MISMO QUE EL NEXT DE ARRIBA
            if (tamany - 1 == i) {
                next = 0;
            } else {
                next = i + 1;
            }*/

            acumulat += llistaVertex.get(i).distancia(llistaVertex.get(next));
        }
       
        return acumulat;
        
    }
    
    
    
}

