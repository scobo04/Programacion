public class OperacionesClaseMath {

    public static void main(String[] args) {

        //Rectangle
        int b = 15;
        int a = 8;

        //Area
        int rArea = b * a;

        //Perimeter
        int rPerimeter = (2 * b) + (2 * a);

        //Triangle
        b = 5;
        a = 3;

        double sumaCatetos = Math.pow(a, 2) + Math.pow(b, 2);
        double area = Math.sqrt(sumaCatetos);
        System.out.println(area);

        //Math.round();
        //Math.abs();

        //Area
        double tArea = b * a / 2.0;

        //Circle
        int r = 60;

        //Area
        double pi = Math.PI;

        double cArea = pi * Math.pow(r, 2);
        System.out.println(cArea);

    }
}
