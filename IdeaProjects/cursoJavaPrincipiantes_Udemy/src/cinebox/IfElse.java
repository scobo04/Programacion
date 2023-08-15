package cinebox;

public class IfElse {

    public static void main(String[] args) {

        int totalEpisodes = 1;
        int totalSeasons = 1;

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

        /*
        if (totalEpisodes > 1 || totalSeasons > 1) {

            if (totalEpisodes <= 10) {

                System.out.println("Es una miniserie");

            } else {

                System.out.println("Es una serie");

            }

        } else if (totalEpisodes == 1) {

            System.out.println("Es una pelicula");

        } else {

            System.out.println("Debe tener al menos un episodio");

        }
        */

        if (totalEpisodes > 1 && totalEpisodes <= 10) {

                System.out.println("Es una miniserie");

        } else if (totalEpisodes > 10) {

            System.out.println("Es una serie");

        } else if (totalEpisodes == 1) {

            System.out.println("Es una pelicula");

        } else {

            System.out.println("Debe tener al menos un episodio");

        }

    }

}
