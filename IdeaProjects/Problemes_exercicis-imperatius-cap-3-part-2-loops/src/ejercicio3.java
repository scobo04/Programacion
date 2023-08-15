import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        double l, m, frecuencia;
        final double g = 9.8;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca la masa del pendulo en kg: ");
        m = Double.parseDouble(leer.next());


        if (m < 1.0) {

            System.out.print("Introduzca la longitud del pendulo (m): ");

            l = Double.parseDouble(leer.nextLine());

            frecuencia = Math.sqrt(g/l);
            frecuencia = frecuencia / (2.0*Math.PI);

            System.out.println("Frecuencia (1/s): " + frecuencia);

        }else {

            System.out.println("La masa debe ser menor de 1 kg");

        }

    }

}
