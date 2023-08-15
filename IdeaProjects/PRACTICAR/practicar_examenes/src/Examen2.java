import java.util.Arrays;

public class Examen2 {
    //EXAMEN 28-11-2022

    public static void main(String[] args) {
        Examen2 examen2 = new Examen2();

        System.out.print("Números primos menores que " + examen2.n + ": ");


        System.out.print(examen2.numerosPrimerosDeN(examen2.n));
        System.out.println();

        examen2.descomposicionFactorial(examen2.n);
        System.out.println(1);

        String textoNuevo = examen2.textoFinal(examen2.texto, examen2.subtexto);
        System.out.println(textoNuevo);

    }

    private final int n = 20;

    private final String texto = "Hola que tal estás";
    private final String subtexto = "que";




    public String numerosPrimerosDeN(int n) {

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
    }

    public String textoFinal(String texto, String subtexto) {
        int indice = 0;
        String textoNuevo = "";

        while (indice < texto.length()) {
            boolean encontrado = true;
            for (int i = 0; i < subtexto.length(); i++) {
                if (texto.charAt(indice + i) != subtexto.charAt(i)) {
                    encontrado = false;
                    break;
                }
            }
            if (encontrado) {
                indice += subtexto.length();
            } else {
                textoNuevo += texto.charAt(indice);
                indice++;
            }
        }
        return textoNuevo;
    }

}
