package org.example;

import javax.swing.*;

public class curso_metodosClaseString {

    public static void main(String[] args) {

        String variable = "Hola";

        String texto = "Códigos de programación";
        /*JOptionPane.showMessageDialog(null, texto);*/

        //length()
        /*JOptionPane.showMessageDialog(null, texto.length());*/

        //substring
        /*JOptionPane.showMessageDialog(null, texto.substring(0,7));*/

        //toLowerCase()
        /*JOptionPane.showMessageDialog(null, texto.toLowerCase());*/

        //toUpperCase()
        /*JOptionPane.showMessageDialog(null, texto.toUpperCase());*/

        //equals()
        /*JOptionPane.showMessageDialog(null, texto.equals("Codigos de programacion"));*/ //devuelve false
        /*JOptionPane.showMessageDialog(null, texto.equals("Códigos de programación"));*/  //devuelve true

        //contac()
        /*JOptionPane.showMessageDialog(null, texto.concat("\n" + variable));*/

        //replace()
        /*JOptionPane.showMessageDialog(null, texto.replaceAll("Códigos", "Mis códigos"));*/


        JOptionPane.showMessageDialog(null, texto.toUpperCase() .replace("DE", "dE"));



    }

}
