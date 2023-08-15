package cinebox;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        //ARRAYS 1
        /*
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe el número de episodios que quieras saber su duración: ");
        int episodeIndex = leer.nextInt();
        episodeIndex--;


        int[] episodeDurationArray = new int[5];

        episodeDurationArray[0] = 30;
        episodeDurationArray[1] = 32;
        episodeDurationArray[2] = 27;
        episodeDurationArray[3] = 31;
        episodeDurationArray[4] = 60;

        if (episodeIndex >= 0 && episodeIndex < 5) {

            int episodeDuration = episodeDurationArray[episodeIndex];
            System.out.println("El episodio dura " + episodeDuration + " minutos");

        } else {

            System.out.println("Error, la serie solo tiene " + episodeDurationArray.length + " episodios");

        }
        */

        /*
        //ARRAYS 2
        int[] episodeDurationArray = new int[] {30,32,27,31,60};
        int n = episodeDurationArray.length;

        if (episodeIndex >= 0 && episodeIndex < n) {

            int episodeDuration = episodeDurationArray[episodeIndex];
            System.out.println("El episodio dura " + episodeDuration + " minutos");

        } else {

            System.out.println("Error, la serie solo tiene " + n + " episodios");

        }
        */

        //ARRAYS Y LOOPS
        int[] episodeDurationArray = new int[] {30,32,27,31,60};
        int n = episodeDurationArray.length;

        int seasonDuration = 0;

        /*
        for (int i = 0; i < n; i++) {

            seasonDuration += episodeDurationArray[i];

        }

        System.out.println(seasonDuration);
        */

        //EJERCICIO ANTERIOR CON WHILE
        int j = 0;
        while (j < n) {

            seasonDuration += episodeDurationArray[j];
            j++;

        }

        System.out.println(seasonDuration);

    }

}
