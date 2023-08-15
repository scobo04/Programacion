public class Main {
    public static void main(String[] args) {
        /*
        REALIZAR LAS SIGUIENTES SERIES NUMÉRICAS UTILIZANDO LAS ESTRUCTURAS REPETITIVAS
        for y while
        */

        //1- 1,2,3,4,5,6,7,8,9,10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        //2- 1,99,2,98,3,97,4,96,5,95
        int j = 99;
        for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
                System.out.print(j + " ");
                j--;
        }
        System.out.println();

        int k = 1;
        int l = 99;
        while (k <= 5) {
            if (k < 5) {
                System.out.print(k + " ");
                System.out.print(l + " ");
            }
            else {
                System.out.print(k + " ");
                System.out.print(l);
            }
            k++;
            l--;
        }

        //3- 0,1,1,2,3,5,8,13,21,34

    }
}