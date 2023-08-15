import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        //2. Suma los pares y los impares hasta un número pedido por teclado

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = leer.nextInt();
        
        int sumapares = 0;
        int sumaimpares = 0;

        for (int i = 2; i < n; i+=2) {

                sumapares += i;

            
        }

        for (int i = 1; i < n; i+=2) {

                sumaimpares += i;



        }

        System.out.println("Suma impares: " + sumaimpares);
        System.out.println("Suma pares: " + sumapares);

    }

}
