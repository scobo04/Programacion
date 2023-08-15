package cinebox;

import java.util.Scanner;

public class ScannerPorTeclado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el día de la semana: ");
        int dayOfWeek = leer.nextInt();

        String myString = leer.next();

        switch (dayOfWeek) {

            case 1:
                System.out.println("Lunes de comedia");
                break;
            case 2:
                System.out.println("Martes de drama");
                break;
            case 3:
                System.out.println("Miércoles de acción");
                break;
            case 4:
                System.out.println("Jueves de animadas");
                break;
            case 5:
                System.out.println("Viernes de terror");
                break;
            case 6:
                System.out.println("Sábado de documentales");
                break;
            case 7:
                System.out.println("Domingo de comodín");
                break;
            default:
                System.out.println("¿En qué día vives?");

        }

    }

}
