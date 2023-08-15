import java.util.Scanner;

public class ejercicio6 {

    /*

    11456

    1+1+4+5+6 ==> 17

    65411

     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = leer.nextInt();

        System.out.println("Suma cifras: " + suma(n));
        System.out.println("Número cifras: " + nCifras(n));
        invertirCifra(n);

    }

    public static int suma(int n) {

        int resultado = 0;

        while (n > 0) {

            resultado += n % 10;
            n = n / 10;

        }

        return resultado;

    }

    public static int nCifras(int n) {

        int cifras = 0;

        while (n != 0) {

            n = n / 10;
            cifras++;

        }

        return cifras;

    }

    public static void invertirCifra(int n) {

        int residuo;
        int nInvertido = 0;

        while (n > 0) {

            residuo = n % 10;
            nInvertido = nInvertido * 10 + residuo;
            n /= 10;

        }

        System.out.println("Número invertido: " + nInvertido);

    }

}
