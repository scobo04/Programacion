public class AddDigits {

    public static void main(String[] args) {
        AddDigits ejercicio = new AddDigits();
        System.out.println(ejercicio.addDigits(38));
    }

    //FUNCIONA

    public int addDigits(int n) {
        int resultado = 0;

        while (n > 0) {
            resultado += n % 10;
            n = n / 10;
        }
        return resultado;
    }
}
