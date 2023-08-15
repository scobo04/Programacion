import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) throws IOException {

        //SOLUCIÓN DEL EJERCICIO
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce las unidades: ");
        int unidades = leer.nextInt();
        System.out.printf("\nTotal de %d unidades\n", unidades);
        int docenas = unidades/12;
        int resto = unidades % 12;

        System.out.println ("\nConvirtiendo a docenas");
        System.out.printf ("Docenas: %d\n", docenas);
        System.out.printf ("Restan %d unidades", resto );


        //MI SOLUCIÓN
        Scanner escribir = new Scanner(System.in);
        System.out.print("\n\nIntroduce las unidades: ");
        int unidades2 = escribir.nextInt();
        System.out.println("\nTotal: " + unidades2 + " unidades");
        int docenas2 = unidades2 / 12;
        System.out.println("Total: " + docenas2 + " docenas");
        int resto2 = unidades2 % 12;
        System.out.println("Resto: " + resto2 + " unidades");

    }
}
