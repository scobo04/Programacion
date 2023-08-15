import javax.swing.*;
import java.util.Scanner;

public class entradaSalidaDatos_JOptionPane {

    public static void main(String[] args) {

        //ENTRADA Y SALIDA POR CONSOLA
        //cadenas
        String cadena;
        cadena = JOptionPane.showInputDialog("Digita una cadena: ");

        //numero entero
        int entero;
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));

        //numero decimal
        float decimal;
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digita un número decimal: "));

        //caracter
        char letra;
        letra = JOptionPane.showInputDialog("Digita un caracter: ").charAt(0);


        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El número es: " + entero);
        //aquí se puede poner el punto en números decimales
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);

    }

}
