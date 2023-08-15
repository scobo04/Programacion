import javax.swing.*;

public class problema2 {

    public static void main(String[] args) {

        //Creamos las variables
        float h_semanales, salario_hora, salario_semanal;

        //Introducimos los datos necesarios
        h_semanales = Float.parseFloat(JOptionPane.showInputDialog("Introduce el número de horas semanales realizadas: "));
        salario_hora = Float.parseFloat(JOptionPane.showInputDialog("Introduce el salario por hora: "));

        //Sacamos el total
        salario_semanal = h_semanales * salario_hora;

        //Imprimimos el resultado final
        JOptionPane.showMessageDialog(null, "Su salario semanal es de " + salario_semanal + " €");

    }

}
