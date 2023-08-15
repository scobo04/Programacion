package cinebox;

public class DoWhile {

    public static void main(String[] args) {

        int i = 0;
        int duration = 10;

        //do-while siempre se ejecuta al menos una vez
        do {

            if (i < 3) {

                System.out.println("Reproduciendo intro, segundo = " + i);

            } else if (i < 7) {

                System.out.println("Reproduciendo pelicula, segundo = " + i);
                i++;

            } else {

                System.out.println("Reproduciendo créditos, segundo = " + i);

            }

            i++;

        }

        while (i <= duration);

    }

}
