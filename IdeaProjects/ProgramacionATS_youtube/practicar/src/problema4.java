import javax.swing.*;

public class problema4 {

    public static void main(String[] args) {

        //Creamos las variables
        int n_carrosVendidos, salario, comision, comisionValorCarro, valorCarro, total_salario = 0;

        //Asignamos el valor de los carros
        valorCarro = 20000;

        //Introducimos los datos necesarios
        n_carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de coches vendidos: "));

        //Sacamos los cálculos
        salario = 1000;
        comision = 150 * n_carrosVendidos;
        comisionValorCarro = (int) (n_carrosVendidos * valorCarro * 0.05);

        //Sumamos
        total_salario = salario + comision + comisionValorCarro;

        //Imprimimos el total
        JOptionPane.showMessageDialog(null, "Su salario mensual será de " + total_salario);
        
    }

}
