import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner leer1 = new Scanner(System.in);
        System.out.print("Introduce el número1: ");
        int n1 = leer1.nextInt();

        System.out.println(n1 + (n1 % 2 == 0 ? " es par " : " es impar"));


        Scanner leer2 = new Scanner(System.in);
        System.out.print("Introduce el número2: ");
        int n2 = leer2.nextInt();

        System.out.println(n2 + (n2 >= 0 ? " es positivo" : " es negativo"));


        Scanner leer3 = new Scanner(System.in);
        System.out.print("Introduce el número3: ");
        int n3 = leer3.nextInt();

        System.out.println(n3 + (n3 >= 0 ? " es positivo, " : " es negativo, ") +
                (n3 % 2 == 0 ? "es par, " : " es impar, ") + (n3 % 5 == 0 ?
                "es múltiplo de 5, " : "no es múltiplo de 5, ") +
                (n3 % 10 == 0 ? "es múltiplo de 10, " : "no es múltiplo de 10, ") +
                (n3 < 100 ? "es menor que 100 " : "es mayor que 100 "));

    }
}