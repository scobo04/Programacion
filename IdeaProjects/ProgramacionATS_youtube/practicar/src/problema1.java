import javax.swing.*;
import java.util.Scanner;

public class problema1 {

    public static void main(String[] args) {

        //Creamos las variables
        float nota1, nota2, nota3, suma = 0;

        //Introducimos los datos necesarios
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota1: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota1: "));

        //Sumamos
        suma = nota1 + nota2 + nota3; //suma las 3 notas

        //Imprimimos el total
        JOptionPane.showMessageDialog(null, "El total es " + suma);

    }

}
