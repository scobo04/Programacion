import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        double a, b, c, x, y;

        Scanner leer = new Scanner(System.in);

        System.out.print("\nIntroduzca el coeficiente a: ");
        a = leer.nextDouble();
        System.out.print("\nIntroduzca el coeficiente b: ");
        b = leer.nextDouble();
        System.out.print("\nIntroduzca el coeficiente c: ");
        c = leer.nextDouble();
        System.out.printf("\nLa ecuación introducida es: %.2f x2 + %.2f x + %.2f",a,b,c);

    }

}
