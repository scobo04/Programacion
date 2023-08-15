import java.util.Scanner;

public class entradaSalidaDatos_Scanner {

    public static void main(String[] args) {

        //ENTRADA Y SALIDA POR CONSOLA
        //numero entero
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digita un número: ");
        int numero;

        numero = entrada.nextInt();
        System.out.println("El número es " + numero);

        //numero decimal
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Digita un número: ");
        float numero2;

        numero2 = entrada2.nextFloat();
        System.out.println("El número es " + numero2);

        //cadenas
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Digita una cadena: ");
        String cadena;

        cadena = entrada3.next(); //solo guarda una palabra
        System.out.println("La cadena es " + cadena);

        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Digita una cadena: ");
        String cadena2;

        cadena2 = entrada4.nextLine(); //guarda toda la cadena
        System.out.println("La cadena es " + cadena2);

        //caracter
        Scanner entrada5 = new Scanner(System.in);
        System.out.print("Digita una cadena: ");
        char caracter;

        caracter = entrada5.next().charAt(0); //guarda la posicion del caracter indicada
        System.out.println("La cadena es " + caracter);


    }

}
