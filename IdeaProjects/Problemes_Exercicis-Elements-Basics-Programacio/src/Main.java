import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        //5- Exercicis Elements bàsics de programació (EXERCICI ADICIONAL)

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Tabla: ");
        int n1 = Integer.parseInt(leer.readLine());

        multiplicar(n1);

    }

    public static void multiplicar(int n1) {

        for (int i = 1; i <= 10; i++) {
            int resultado = n1 * i;

            System.out.println(n1 + " * " + i + " = " + resultado);
        }
    }
}