import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3 {
    public static void main(String[] args) throws IOException {


        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un número real: ");
        float n1 = Float.parseFloat(leer.readLine());

        System.out.print("Introduce un número entero: ");
        float n2 = Float.parseFloat(leer.readLine());

        System.out.println("------------------------------");
        dividirNumeros(n1, n2);
        residuoNumeros(n1, n2);
        System.out.println("------------------------------");

    }

    public static void dividirNumeros(float n1, float n2) {

        float division = n1 / n2;

        System.out.println("División = " + division);

    }

    public static void residuoNumeros(float n1, float n2) {

        int residuo = (int)n1 % (int)n2;

        System.out.println("El residuo es " + residuo);

    }
}
