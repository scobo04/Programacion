package ejerciciosConEstructuraSecuencial;

import java.util.Scanner;

public class Ejercicios {

    //1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
    public static void muestraDosNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.print(n1 + " " + n2);
        System.out.println();
    }

    //2. Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
    public static void leerNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tú nombre: ");
        String nombre = scanner.next();

        System.out.println("Buenos días " + nombre);
    }

    //3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el
    // doble y el triple de ese número.
    public static void numero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        System.out.println(n*2 + " " + n*3);
    }

    //4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La
    // fórmula correspondiente es: F = 32 + ( 9 * C / 5)
    public static void grados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de grados en ºC: ");
        float grados = scanner.nextFloat();

        float fahrenheit;
        fahrenheit = 32 + (9 * grados / 5);

        System.out.println(grados + " ºC son " + fahrenheit + "ºF");
    }

    //5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y
    // muestra por pantalla la longitud y el área de la circunferencia. Longitud de la
    // circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
    public static void longitudYAreaCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del radio: ");
        double radio = scanner.nextDouble();

        double longitud;
        double area;

        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.sqrt(radio);

        System.out.println("La longitud de la circunferencia es de " + longitud);
        System.out.println("El area de la circunferencia es de " + area);
    }

    //6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
    public static void kilometroshoraAMinutosSegundo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la velocidad en Km/h: ");
        double km_h = scanner.nextDouble();

        double m_s;

        m_s = km_h / 3.6;

        System.out.println("La distancia resultante es " + m_s + " m/s");
    }

    //7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
    // la longitud de la hipotenusa según el teorema de Pitágoras.
    public static void longitudHipotenusa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la longitud de los catetos: ");
        double cateto1 = scanner.nextDouble();
        double cateto2 = scanner.nextDouble();

        double hipotenusa;

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La hipotenusa es de " + hipotenusa);
    }

    //8. Programa que calcula el volumen de una esfera. Formula: V = 4/3 πr³
    public static void volumenEsfera() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del radio: ");
        float radio = scanner.nextFloat();

        double volumen;
        volumen = 4/3 * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen es de " + volumen);
    }

    //9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
    public static void areaTrianguloPorLados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de los catetos: ");
        float cateto1 = scanner.nextFloat();
        float cateto2 = scanner.nextFloat();
        float cateto3 = scanner.nextFloat();

        float area;
        area = (cateto1+cateto2+cateto3) / 2;

        System.out.println("El area es " + Math.sqrt(area * (area - cateto1) * (area - cateto2) * (area - cateto3)));

    }

    //10. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
    public static void cifrasPorSeparado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de tres cifras: ");
        int n = scanner.nextInt();

        System.out.print(n / 100 + " ");
        System.out.print((n / 10) % 10 + " ");
        System.out.println(n % 10);
    }

    //11. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el principio como en el ejemplo.
    public static void mostrarCifras() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de cinco cifras: ");
        int n = scanner.nextInt();

        System.out.println(n / 10000 + " ");
        System.out.println((n / 1000) + " ");
        System.out.println(n / 100);
        System.out.println(n / 10);
        System.out.println(n);
    }

    //12. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final igual que en el ejemplo.
    public static void mostrarCifrasDelsdeFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de cinco cifras: ");
        int n = scanner.nextInt();

        //12345
        System.out.println(n%10);
        System.out.println(n%100);
        System.out.println(n%1000);
        System.out.println(n%10000);
        System.out.println(n);
    }

    //13. Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento.
    public static void numeroSuerte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento: ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int any = scanner.nextInt();
        int suma,cifra1,cifra2,cifra3,cifra4;

        suma = dia+mes+any;
        cifra1 = suma / 1000;
        cifra2 = suma / 100 % 10;
        cifra3 = suma / 10 % 10;
        cifra4 = suma % 10;

        int numero = cifra1+cifra2+cifra3+cifra4;

        System.out.println(numero);
    }

    //14. Programa para calcular el precio final de venta de un producto.
    public static void precioFinalProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el precio unitario: ");
        float precioUnitario = scanner.nextFloat();
        System.out.print("Introduce la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Introduce el iva aplicado: ");
        float iva = scanner.nextFloat();

        float precioProducto;
        float precioSinIva;
        float precioConIva;

        precioSinIva = precioUnitario * cantidadVendida;
        precioConIva = precioSinIva * iva / 100;

        precioProducto = precioSinIva + precioConIva;

        System.out.println("El precio del producto es " + precioProducto);

    }

    //15. Programa quite a una variable N sus m últimas cifras.


    //16. Programa para pasar de grados centígrados a grados Kelvin y grados Reamur.

}
