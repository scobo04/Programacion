import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce la cantidad en euros: ");
        float euros = Float.parseFloat(leer.readLine());
        convertirEurosADolares(euros);
    }

    public static float convertirEurosADolares(float euros) {
        float dolares;
        dolares = euros * 1.04f;

        System.out.println("Conversión en dólares: " + dolares + " $");
        return dolares;
    }

}
