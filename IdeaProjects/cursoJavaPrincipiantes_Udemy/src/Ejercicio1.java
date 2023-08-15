public class Ejercicio1 {

    public static void main(String[] args) {

        //EJERCICIO 1
        //largo = 15; ancho = 23; alto = 12; Obten su volumen (cubo rectangular)

        int largo = 15;
        int ancho = 23;
        int alto = 12;

        //volumen
        int crVolumen = largo * ancho * alto;
        System.out.println(crVolumen);


        //EJERCICIO 2
        //masa = 12 kg; velocidad = 3 m/s;

        int m = 12;
        int v = 3;

        //energia cinetica
        double cinetica = 0.5 * m * Math.pow(v, 2);
        System.out.println(String.format("%.2f", cinetica));


        //EJERCICIO 3
        //clasificar con tipos de datos

        //a ('R')
        char letra = 'R';

        //b (1495970192837664)
        long distancia = 1495970192837664L;

        //c (12.5)
        float decimal = 12.5f;

        //d (true)
        boolean verdad = true;

        //e (90)
        int numero = 90;

        //f ("No tengo trono")
        String frase = "No tengo trono";

        //g (6.626070040)
        double deciamles = 6.626070040;


        //EJERCICIO 4
        int n_clics = 180;
        float promedioCostesClics = 0.30f * 0.25f * 0.80f;
        float totalSinIva = promedioCostesClics * n_clics;
        float totalConIva = (promedioCostesClics * n_clics) * 1.16f;
        System.out.println(totalConIva);

    }

}
