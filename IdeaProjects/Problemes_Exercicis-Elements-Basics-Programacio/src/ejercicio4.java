import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio4 {
    public static void main(String[] args) throws IOException {
        float celsius;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce los grados en celsius: ");
        celsius= Float.parseFloat(leer.readLine());

        System.out.println("Grados en fahrenheit: " + fahrenheit(celsius));

    }

    public static float fahrenheit(float celsius) {

        float fahrenheit = (celsius*9/5) + 32;

        return fahrenheit;
    }
}
