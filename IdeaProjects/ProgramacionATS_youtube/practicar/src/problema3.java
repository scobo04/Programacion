import javax.swing.*;

public class problema3 {

    public static void main(String[] args) {

        //Creamos las variables
        int guillermo, luis, juan, suma;

        //Introducimos los datos necesarios
        guillermo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dinero que tiene Guillermo: "));

        //Sacamos los cálculos
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;

        //Sumamos
        suma = guillermo + luis + juan;

        //Imprimimos el total
        JOptionPane.showMessageDialog(null, "La cantidad de dinero que tienen entre los tres son " + suma + " $");

    }

}
