package org.example;

public class manipula_cadenas2 {

    public static void main(String[] args) {

        String frase = "Hoy es un horroroso día para aprender a programar en java";
        String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo...." + " y " +
                frase.substring(29, 57);
        System.out.println(frase_resumen);




    }

}
