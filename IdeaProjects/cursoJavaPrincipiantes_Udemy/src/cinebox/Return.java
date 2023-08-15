package cinebox;

import java.util.Random;

public class Return {

    public static void main(String[] args) {

        String[] titleArray = {"La naranja mecánica", "Buscando a Nemo", "Misión imposible", "Star Wars", "Troya",
                "Yo Robot", "Ip Man"};

        String title = play(titleArray, 3);
        String title2 = play(titleArray);
        System.out.println("");
        pause(title);
        System.out.println("");
        pause(title2);

    }

    public static String play(String[] titleArray, int index) {

        if (index < titleArray.length) {

            String title = titleArray[index];

            for (int i = 0; i < 10; i++) {

                System.out.println("Playing mode: " + title);

            }

            return title;

        } else {

            System.out.println("Index is too big");

        }

        return null;

    }

    public static String play(String[] titleArray) {

        Random random = new Random();
        int index = random.nextInt(titleArray.length -1);

        String title = titleArray[index];

        for (int i = 0; i < 10; i++) {

            System.out.println("Playing mode: " + title);

        }

        return title;

    }

    public static String pause(String title) {

        if (title.isEmpty()) {

            System.out.println("No movie playing");

        } else {

            System.out.println("Movie paused: " + title);

        }

        return null;

    }

}
