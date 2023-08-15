/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mg
 */
public class Caesar {
    final String alfabet="abcçdefghijklmnopqrstuvwxyz";
    
    public String xifrar( String text, int num ) {
        
        String textXifrat ="";
        
        for ( int i = 0 ; i < text.length() ; i++ ) {
            
            int posicio = alfabet.indexOf(text.charAt(i));

            //faltaba = en la siguiente línea
            if ( posicio >= 0 ) {
                textXifrat += alfabet.charAt((posicio+num)%alfabet.length());
            } else {
                textXifrat += text.charAt(i);
            }
               
        }
        return textXifrat;
        
    }
    
    public String desXifrar( String textXifrat , int num ) {
        
        String textDesXifrat ="";
        
        for ( int i = 0 ; i < textXifrat.length() ; i++ ) {
            
            int posicio = alfabet.indexOf(textXifrat.charAt(i));

            //faltaba = en la siguiente línea
            if ( posicio >= 0 ) {
                textDesXifrat += alfabet.charAt((posicio-num+alfabet.length())%alfabet.length());
            } else {
                textDesXifrat += textXifrat.charAt(i);
            }
               
        }
        return textDesXifrat;
        
    }

    
}

