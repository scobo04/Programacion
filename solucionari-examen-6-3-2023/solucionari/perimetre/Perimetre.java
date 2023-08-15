/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetre;

/**
 *
 * @author mg
 */
public class Perimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perimetre.Punt[] llistaPuntes = {new perimetre.Punt(1,1),new perimetre.Punt(1,2),new perimetre.Punt(2,2),new perimetre.Punt(2,1)};
        
        Poligon figura = new Poligon(llistaPuntes);
        
        double distVoltant = figura.calcularPerimetre();
        
        System.out.println("El perimetre de la figura és : "+distVoltant);
        
    }
    
}

