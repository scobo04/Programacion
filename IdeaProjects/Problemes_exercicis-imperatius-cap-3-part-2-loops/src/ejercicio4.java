import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int n1 = leer.nextInt();

        System.out.println("Suma de los cuadrados: " + sumaCuadrados(n1));

    }

    public static int sumaCuadrados(int n1) {

        int contador = 1;
        int n_2 = n1 * n1;

        return n_2;
    }

}
