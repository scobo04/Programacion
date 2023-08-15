import javax.swing.*;
import java.awt.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        //EJERCICIO 1
        //Creamos las variables
        int cantidad;

        //Introducimos los datos
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad en miligramos: "));

        //Introducimos los condicionales e imprimimos las respuestas
        if (cantidad > 100) {

            JOptionPane.showMessageDialog(null, "Felicidades, es una buena poción!");

        } else {

            JOptionPane.showMessageDialog(null, "La poción es mediocre, sangre sucia inmunda");

        }
        */

        /*
        //EJERCICIO 2
        //Creamos las variables
        float distancia;
        boolean disponibilidad = true;

        //Introducimos los datos
        distancia = Float.parseFloat(JOptionPane.showInputDialog("Introduce la distancia: "));
        disponibilidad = Boolean.parseBoolean(JOptionPane.showInputDialog("Introduce si está disponible: "));

        //Introducimos los condicionales e imprimimos las respuestas
        if (distancia <= 0.5 && disponibilidad == true) {

            System.out.println("Listo para inciar recorrido");

        } else if (distancia <= 0.5 && disponibilidad == false) {

            System.out.println("Conductor cercano, pero no disponible");

        } else if (distancia > 0.5 && disponibilidad == true) {

            System.out.println("Conductor disponible pero muy lejos, aplicarán tarifas más altas");

        } else if (distancia > 0.5 && disponibilidad == false){

            System.out.println("No hay conductores disponibles");

        }
        */

        /*
        //EJERCICIO 3
        //Creamos las variables
        int n, sumaN = 0;

        //Introducimos los datos
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

        for (int i = 0; i <= n; i++) {
            
            sumaN += i;
            
        }

        //Imprimir resultado
        JOptionPane.showMessageDialog(null, "La suma es " + sumaN);
        */

        /*
        //EJERCICIO 4
        //Creamos el array
        int posicion;
        String[] weather = {"Soleado", "Nublado", "Lluvioso", "Tormentoso", "Nevado"};

        //Introducimos los datos e imprimimos resultado
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de clima: "));
        posicion--;

        for (int i = 0; i < weather.length;) {

            if (posicion >= 5 || posicion < 1) {

                JOptionPane.showMessageDialog(null, "Pregúntale a Google");

            }

            i = posicion;
            JOptionPane.showMessageDialog(null, weather[i]);
            break;

        }
        */

        /*
        //EJERCICIO 5
        //Creamos el array
        String masLargo = "";
        String[] titles = {"Jumanji", "Toy Story", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill"};
        masLargo = titles[0];

        //Sacamos e imprimimos el resultado
        for (int i = 1; i < titles.length; i++) {

            if (titles[i].length() > masLargo.length()) {

                masLargo = titles[i];

            }

        }

        System.out.println("El titulo mas largo es " + masLargo);
        */

        //EJERCICIO 6
        //Creamos las variables
        int n;

        //Introducimos los datos
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

        //Hacemos los cálculos
        for (int i = 2; i <= n; i++) {

            if (n <= 0) {

                JOptionPane.showMessageDialog(null, "Introduce un número positivo");

            }

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }

    }

}
