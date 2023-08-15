package cinebox;

public class ArgumentosEnMetodos {

    public static void main(String[] args) {

        String[] titleArray = {"La naranja mecánica", "Buscando a Nemo", "Misión imposible", "Star Wars", "Troya",
        "Yo Robot", "Ip Man"};

        play(titleArray, 6);
        System.out.println("");
        pause();

    }

    public static void play(String[] titleArray, int index) {

        if (index < titleArray.length) {

            String title = titleArray[index];

            for (int i = 0; i < 10; i++) {

                System.out.println("Playing mode: " + title);

            }

        } else {

            System.out.println("Index is too big");

        }

    }

    public static void pause() {

        System.out.println("Movie paused");

    }




}
