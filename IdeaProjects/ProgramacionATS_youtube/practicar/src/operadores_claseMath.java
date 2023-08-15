public class operadores_claseMath {

    public static void main(String[] args) {

        //CLASE MATH
        //Metodo sqrt
        int raiz = (int) Math.sqrt(9);
        double raiz2 = Math.sqrt(36.67);

        System.out.println(raiz);
        System.out.println(raiz2);

        //Metodo pow
        double base = 5, exponente = 2;
        int resultado = (int) Math.pow(base, exponente);

        System.out.println(resultado);

        //Metodo round
        float numero = 4.56f;
        int resultado2 = Math.round(numero);

        System.out.println(resultado2);

        //Metodo random
        double numero2 = Math.random();

        System.out.println(numero2);

    }

}
