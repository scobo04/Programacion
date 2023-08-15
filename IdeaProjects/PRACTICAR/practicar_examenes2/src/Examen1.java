import java.util.Arrays;

public class Examen1 {
    //EXAMEN 28-11-2022

    public static void main(String[] args) {
        Examen1 examen1 = new Examen1();

        System.out.println(examen1.numerosPrimos(examen1.n));

        examen1.descomposicionFactorial(examen1.n);

        System.out.println(examen1.eliminarAparicionesSubtexto(examen1.text, examen1.subtext));

    }

    private final int n = 54;

    private String text = "Hola que tal";
    private String subtext = "que";


    //1- Calcula els nombres primers menors d’un nombre donat emprant
    //el sedaç d’Erastótenes. El mètode ens ha de retornar una matriu
    //amb tots els nombres primers menors del nombre donat. ( 3 punts )
    public String numerosPrimos (int n) {
        boolean[] numeros = new boolean[n + 1];
        int[] primos = new int[n];
        for (int i = 2; i < n; i++) {
            numeros[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (numeros[i]) {
                for (int j = i * i; j <= n; j+=i) {
                    numeros[j] = false;
                }
            }
        }

        int contador = 0;
        for (int i = 2; i < n; i++) {
            if (numeros[i]) {
                primos[contador] = i;
                contador++;
            }
        }

        int[] primosNueva = new int[contador];
        for (int i = 0; i < contador; i++) {
            primosNueva[i] = primos[i];
        }

        return Arrays.toString(primosNueva);

    }

    //2- Calcula la descomposició factorial d’un nombre donat.
    //( 3 punts )
    public void descomposicionFactorial(int n) {
        int divisor = 2;
        while (n != 1) {
            if (n % divisor == 0) {
                System.out.println(n + " | " + divisor);
                n = n / divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(1);
    }

    //3- Programa un mètode static que donats un text i un subtext
    //ens retorni una versió del text eliminant les aparicions del
    //subtext. El mètode ha de retornar un string amb el text
    //eliminades les aparicions del subtext. Has de tractar els
    //strings de forma matricial, l’únic mètode de la classe String
    // que pots emprar és length() i charAt(index). ( 4 punts )
    public String eliminarAparicionesSubtexto(String text, String subtext) {
        String temp = "";
        String textFInal = "";
        int posicion = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < subtext.length(); j++) {
                if (text.charAt(i) == subtext.charAt(j)) {
                    temp += text.charAt(i);
                } else {
                    textFInal += text.charAt(posicion);
                    posicion++;
                    /*if (textFInal.equals(text)) {

                    }*/
                }
                //(text.charAt(i) == subtext.charAt(j)) ? temp += text.charAt(i) : textFInal += text.charAt(posicion);
                /*PREGUNTAR COMO SE HACE*/
            }
        }
        return textFInal;
    }

}
