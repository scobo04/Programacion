package cinebox;

public class While {

    public static void main(String[] args) {

        int i = 0;
        int duration = 10;

        while (i < duration) {

            if (i < 3) {

                System.out.println("Reproduciendo intro");

            } else if (i < 7) {

                System.out.println("Reproduciendo pelicula");
                i++;

            } else {

                System.out.println("Reproduciendo créditos, segundo = " + i);

            }

            i++;

        }


    }

}
