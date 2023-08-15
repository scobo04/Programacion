import javax.swing.*;
import java.awt.*;

public class problema5 {

    public static void main(String[] args) {

        //Creamos las variables
        float participacion,primer_examen,segundo_examen,examen_final, total;

        //Pedimos los datos necesarios
        participacion = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de participación: "));
        primer_examen = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del primer examen: "));
        segundo_examen = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del segundo examen: "));
        examen_final = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del examen final: "));

        //Sacamos los cálculos
        participacion = participacion * 0.1f;
        primer_examen = primer_examen * 0.25f;
        segundo_examen = segundo_examen * 0.25f;
        examen_final = examen_final * 0.4f;

        //Sumamos las notas
        total = participacion + primer_examen + segundo_examen + examen_final;

        //Imprimimos el resultado total
        JOptionPane.showMessageDialog(null, "La calificación final del alumno es " + total);

    }

}
