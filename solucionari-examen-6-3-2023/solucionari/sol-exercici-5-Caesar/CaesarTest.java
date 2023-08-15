
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mg
 */
public class CaesarTest {
    
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String textProva = "en joaquin ha vingut molt prim !";
  
        Caesar enigma = new Caesar();
        
        int offset = 5 ;
        
        String textProvaXifrat = enigma.xifrar(textProva,offset);
        
        String textProvaDesXifrat = enigma.desXifrar(textProvaXifrat,offset);
        
        System.out.println("El text original és : "+textProva);
        
        System.out.println("El text xifrat és : "+textProvaXifrat);
        
        System.out.println("El text desxifrat és : "+textProvaDesXifrat);
    }
  
    
}

