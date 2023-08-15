public class ejercicio1 {
    public static void main(String[] args) {

        int numero = 2147483646;

        System.out.println(overflowConEnteros(numero));

    }

    public static int overflowConEnteros(int numero) {
        numero = 2147483646;
        while (numero < 2147483647) {
            System.out.println(numero);
            numero++;
        }
        return numero;
    }

}
