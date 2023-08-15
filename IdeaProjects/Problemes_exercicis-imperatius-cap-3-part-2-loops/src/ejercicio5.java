public class ejercicio5 {

    public static void main(String[] args) {

        int[] notasAlumno = {1, 10, 5};

        System.out.println("Media del array: " + media(notasAlumno));
        System.out.println("Nota mayor del array: " + valorMayor(notasAlumno));
    }

    public static int suma(int[] notasAlumno) {

        int suma = 0;

        for (int i = 0; i < notasAlumno.length; i++) {

            suma += notasAlumno[i];

        }

        return suma;
    }

    public static int valorMayor(int[] notasAlumno) {

        int mayor = notasAlumno[0];

        for (int j = 0; j < notasAlumno.length; j++) {

            if (notasAlumno[j] > mayor) {
                mayor = notasAlumno[j];
            }

        }

        return mayor;
    }

    /*
    public static int valorMenor(int[] notasAlumno) {

        int menor = notasAlumno[0];

        for (int k = 0; k < notasAlumno.length; k++) {

            if (notasAlumno[k] < menor) {
                menor = notasAlumno[k];
            }

        }
        return menor;
    }

     */

    public static float media(int[] notasAlumno) {

        float media = 0;
        int suma = 0;

        media = (float) suma(notasAlumno) / notasAlumno.length;

        return media;
    }
}
