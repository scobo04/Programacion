public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber ejercicio = new HappyNumber();
        //System.out.println(ejercicio.isHappy(ejercicio.n));
        System.out.println(ejercicio.imprimir(ejercicio.n));
        System.out.println(ejercicio.resultados(ejercicio.n));
    }

    private final int n = 25;

    //SEGUIR

    public boolean isHappy (int n) {
        while (n == 1) {
            return true;
        }
        return false;
    }

    public double resultados (int n) {
        int n1 = n / 10;
        int n2 = n % 10;
        double resultado = 0;

        double numerosElevados = Math.pow(n1, 2) + Math.pow(n2, 2);

        if (!isHappy(n)) {
            resultado = numerosElevados;
            if (resultado >= 10) {
                resultado = numerosElevados;
            }
            //resultado = n1 + "² + " + n2 + "² = " + (Math.pow(n1, 2) + Math.pow(n2, 2));
        }

        return resultado;
    }

    public String imprimir (int n) {
        int n1 = n / 10;
        int n2 = n % 10;
        String resultado = "";

        resultado = n1 + "² + " + n2 + "² = " + (Math.pow(n1, 2) + Math.pow(n2, 2));

        return resultado;
    }
}
