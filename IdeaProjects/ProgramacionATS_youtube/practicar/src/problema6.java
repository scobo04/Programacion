import javax.swing.*;

public class problema6 {

    public static void main(String[] args) {

        //Creamos las variables
        int valor1, valor2, cuadrado, total;

        //Pedimos los datos necesarios
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor2: "));

        //Calculamos
        total = valor1*valor1 + valor2*valor2 + 2*valor1*valor2;

        //Imprimimos el resultado total
        JOptionPane.showMessageDialog(null, "El resultado es " + total);
    }

}
