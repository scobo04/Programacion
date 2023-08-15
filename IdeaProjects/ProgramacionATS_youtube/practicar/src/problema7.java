import javax.swing.*;

public class problema7 {

    public static void main(String[] args) {

        //Creamos las variables
        int totalHoras, n_semanas, n_dias, n_horas, total;

        //Introducimos los datos
        totalHoras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de horas a transformar: "));

        //Sacamos los cálculos
        n_semanas = totalHoras / 24 / 7;
        n_dias = (totalHoras % 168) / 24;
        n_horas = totalHoras % 24;

        //Imprimimos el total
        JOptionPane.showMessageDialog(null, totalHoras + " horas son " + n_semanas + " semanas, " +
                n_dias + " días y " + n_horas + " horas");

    }

}
