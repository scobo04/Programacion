public class FormatoStrings {

    public static void main(String[] args) {

        int edad = 18;

        float altura = 1.78f;

        double valordePi = 3.141597465837463512;

        long distanciaAlSol = 471628376481726846L;

        boolean isDay = false;

        char miInicial = 'S';

        System.out.println(String.format("Mi edad es %d", edad));
        System.out.println(String.format("Mi edad es %d", distanciaAlSol));
        System.out.println(String.format("Mi altura es %.4f", altura));
        System.out.println(String.format("Mi altura es %.20f", valordePi));

    }
}
