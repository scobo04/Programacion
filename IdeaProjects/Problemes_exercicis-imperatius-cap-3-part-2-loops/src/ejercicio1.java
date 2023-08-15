import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca el número 1: ");
        int n1 = leer.nextInt();
        System.out.print("Introduzca el número 2: ");
        int n2 = leer.nextInt();
        Numeros(n1, n2);

    }

    public static void Numeros(int n1, int n2) {

        if (n1 > n2) {
            System.out.println("\nEl número1 es mayor que el número2");
        }else if (n2 < n1){
            System.out.println("El número1 es menor que el número2");
        }

        if (n1 == n2) {
            System.out.println("El número1 y el número2 son iguales");
        }

    }

}
