import java.util.Scanner;

public class ejercicio1_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el número1: ");
        int n1 = leer.nextInt();

        System.out.print("Introduce el número2: ");
        int n2 = leer.nextInt();

        devuelveMayor(n1,n2);

    }

    public static void devuelveMayor(int n1, int n2) {

        if (n1 > n2) {

            System.out.println("El número mayor es " + n1);

        } else if (n2 > n1) {

            System.out.println("El número mayor es " + n2);

        } else {

            System.out.println("Los números son iguales");

        }

    }

}
