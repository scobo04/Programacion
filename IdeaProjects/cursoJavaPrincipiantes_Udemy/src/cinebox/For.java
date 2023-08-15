package cinebox;

public class For {

    public static void main(String[] args) {

        int i = 0;
        int duration = 10;

        for (int j = 0; j <= duration; j++) {

            if (i < 3) {

                System.out.println("Reproduciendo intro, segundo = " + j);

            } else if (i < 7) {

                System.out.println("Reproduciendo pelicula, segundo = " + j);
                i++;

            } else {

                System.out.println("Reproduciendo créditos, segundo = " + j);

            }

        }


    }

}
