import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {
    public static void main(String[] args) throws IOException {
        String frase;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce el nombre: ");
        String nombre = leer.readLine();
        System.out.println(frase(nombre));
    }

    public static String frase(String nombre) {

        String frase = "Hola, " + nombre + ".";

        return frase;
    }
}
