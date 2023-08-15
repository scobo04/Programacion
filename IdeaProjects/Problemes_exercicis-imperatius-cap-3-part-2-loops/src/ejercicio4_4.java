import java.util.Scanner;

public class ejercicio4_4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el numero 1: ");
        int r1 = leer.nextInt();

        System.out.print(sumaCuadrados(r1));

    }

    public static int sumaCuadrados(int r1) {

        int i = 1;
        int n_2 = 0;

        while (i <= r1) {

            n_2 = n_2 + i*i;
            i++;

        }

        return n_2;
    }


}
