package cinebox;

public class If_else {

    public static void main(String[] args) {

        int totalEpisodes = 0;

        /*
        if (totalEpisodes == 1) {

            System.out.println("Es una pelicula");

        } else {

            System.out.println("Es una serie");

        }
        */

        /*
        if (totalEpisodes > 1) {

            System.out.println("Es una serie");

        } else {

            System.out.println("Es una pelicula");

        }
        */

        if (totalEpisodes > 1) {

            System.out.println("Es una serie");

        } else if (totalEpisodes == 1) {

            System.out.println("Es una pelicula");

        } else {

            System.out.println("Debe tener al menos un episodio");

        }

    }

}
