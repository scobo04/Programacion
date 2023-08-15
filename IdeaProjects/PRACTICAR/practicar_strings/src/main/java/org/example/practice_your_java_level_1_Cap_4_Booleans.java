package org.example;

public class practice_your_java_level_1_Cap_4_Booleans {

    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        int z = 25;

        boolean x2 = false;
        boolean y2 = true;

        ejercicio4(x,y);
        ejercicio5(x,y);
        ejercicio6(x,y);
        ejercicio7(x,y);
        ejercicio8(x,y);
        ejercicio9(x,y);
        ejercicio10(x,y);
        ejercicio11(x2,y2);
        ejercicio12(x,y);
        ejercicio15(x,y);
        ejercicio17(x,y);
        ejercicio18(x,y);
        ejercicio19(x,y);
        ejercicio20(x,y);
        ejercicio21(x,y,z);
        ejercicio22(x,y,z);
        ejercicio23(x,y,z);
        ejercicio24(x,y,z);
        ejercicio25(x,y,z);

    }

    public static void ejercicio4(int x, int y) {

        boolean result = x == y;

        System.out.println("//EJERCICIO 4");
        System.out.printf("El resultado de si %d es igual a %d es %b\n\n",x,y,result);

    }

    public static void ejercicio5(int x, int y) {

        boolean result = x > y;

        System.out.println("//EJERCICIO 5");
        System.out.printf("El resultado de si %d es mayor que %d es %b\n\n",x,y,result);

    }

    public static void ejercicio6(int x, int y) {

        boolean result = x <= y;

        System.out.println("//EJERCICIO 6");
        System.out.printf("El resultado de si %d es menor o igual que %d es %b\n\n",x,y,result);

    }

    public static void ejercicio7(int x, int y) {

        boolean result = x >= y;

        System.out.println("//EJERCICIO 7");
        System.out.printf("El resultado de si %d es mayor o igual que %d es %b\n\n",x,y,result);

    }

    public static void ejercicio8(int x, int y) {

        boolean result = x < y;

        System.out.println("//EJERCICIO 8");
        System.out.printf("El resultado de si %d es menor que %d es %b\n\n",x,y,result);

    }

    public static void ejercicio9(int x, int y) {

        boolean result = x != y;

        System.out.println("//EJERCICIO 9");
        System.out.printf("El resultado de si %d no es igual a %d es %b\n\n",x,y,result);

    }

    public static void ejercicio10(int x, int y) {

        boolean result = !(x > y);

        System.out.println("//EJERCICIO 10");
        System.out.printf("El resultado de si %d no es mayor que %d es %b\n\n",x,y,result);

    }

    public static void ejercicio11(boolean x2, boolean y2) {

        boolean result = x2 == y2;

        System.out.println("//EJERCICIO 11");
        System.out.printf("El resultado de si %b es igual a %b es %b\n\n",x2,y2,result);

    }

    public static void ejercicio12(int x, int y) {

        boolean result;

        System.out.println("//EJERCICIO 12");

        x = 1; y = 1; result = ((x > 5) && (y > 7)); System.out.printf("El resultado de si %d es mayor que 5 y si %d es mayor que 7 es %b\n\n",x,y,result);
        x = 6; y = 7; result = ((x > 5) && (y > 7)); System.out.printf("El resultado de si %d es mayor que 5 y si %d es mayor que 7 es %b\n\n",x,y,result);
        x = 15; y = 15; result = ((x > 5) && (y > 7)); System.out.printf("El resultado de si %d es mayor que 5 y si %d es mayor que 7 es %b\n\n",x,y,result);

    }

    //EJERCICIO 13 Y 14
    //& evalúa ambos lados de la operación.
    //&& evalúa el lado izquierdo de la operación, si es true continúa y evalúa el lado derecho.

    public static void ejercicio15(int x, int y) {

        boolean result;

        System.out.println("//EJERCICIO 15");

        x = 1; y = 1; result = ((x < 5) && (y < 7)); System.out.printf("El resultado de si %d es menor que 5 y si %d es menor que 7 es %b\n\n",x,y,result);
        x = 6; y = 5; result = ((x < 5) && (y < 7)); System.out.printf("El resultado de si %d es menor que 5 y si %d es menor que 7 es %b\n\n",x,y,result);
        x = 4; y = 5; result = ((x < 5) && (y < 7)); System.out.printf("El resultado de si %d es menor que 5 y si %d es menor que 7 es %b\n\n",x,y,result);

    }

    public static void ejercicio17(int x, int y) {

        boolean result;

        System.out.println("//EJERCICIO 17");

        x = 1; y = 1; result = ((x > 5) || (y < 7)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es menor que 7 es %b\n\n",x,y,result);
        x = 6; y = 5; result = ((x > 5) || (y < 7)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es menor que 7 es %b\n\n",x,y,result);
        x = 4; y = 15; result = ((x > 5) || (y < 7)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es menor que 7 es %b\n\n",x,y,result);

    }

    public static void ejercicio18(int x, int y) {

        boolean result;

        System.out.println("//EJERCICIO 18");

        x = 6; y = 0; result = ((x >= 5) || (y == 0)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es igual que 7 es %b\n\n",x,y,result);
        x = 5; y = 0; result = ((x >= 5) || (y == 0)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es igual que 7 es %b\n\n",x,y,result);
        x = 4; y = 1; result = ((x >= 5) || (y == 0)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es igual que 7 es %b\n\n",x,y,result);

    }

    public static void ejercicio19(int x, int y) {

        boolean result;

        System.out.println("//EJERCICIO 19");

        x = 6; y = 0; result = ((x >= 5) && (y != 0)); System.out.printf("El resultado de si %d es mayor o igual a 5 y si %d es diferente que 7 es %b\n\n",x,y,result);
        x = 5; y = 0; result = ((x >= 5) && (y != 0)); System.out.printf("El resultado de si %d es mayor o igual a 5 y si %d es diferente que 7 es %b\n\n",x,y,result);
        x = 4; y = 1; result = ((x >= 5) && (y != 0)); System.out.printf("El resultado de si %d es mayor o igual a 5 y si %d es diferente que 7 es %b\n\n",x,y,result);
        x = 7; y = 2; result = ((x >= 5) && (y != 0)); System.out.printf("El resultado de si %d es mayor o igual a 5 y si %d es diferente que 7 es %b\n\n",x,y,result);

    }

    public static void ejercicio20(int x, int y) {

        boolean result;

        System.out.println("//EJERCICIO 20");

        x = 6; y = 0; result = ((x > 5) || (x > 5)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 es %b\n\n",x,y,result);
        x = 5; y = 0; result = ((x > 5) || (x > 5)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 es %b\n\n",x,y,result);
        x = 4; y = 1; result = ((x > 5) || (x > 5)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 es %b\n\n",x,y,result);
        x = 7; y = 2; result = ((x > 5) || (x > 5)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 es %b\n\n",x,y,result);

    }

    public static void ejercicio21(int x, int y, int z) {

        boolean result;

        System.out.println("//EJERCICIO 21");

        x = 5; y = 16; z = 25; result = ((x > 5) || (y > 15) || (z <= 25)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 o si %d es menor o igual que 25 es %b\n\n",x,y,z,result);
        x = 5; y = 16; z = 24; result = ((x > 5) || (y > 15) || (z <= 25)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 o si %d es menor o igual que 25 es %b\n\n",x,y,z,result);
        x = 5; y = 15; z = 24; result = ((x > 5) || (y > 15) || (z <= 25)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 o si %d es menor o igual que 25 es %b\n\n",x,y,z,result);
        x = 4; y = 5; z = 30; result = ((x > 5) || (y > 15) || (z <= 25)); System.out.printf("El resultado de si %d es mayor que 5 o si %d es mayor que 5 o si %d es menor o igual que 25 es %b\n\n",x,y,z,result);

    }

    public static void ejercicio22(int x, int y, int z) {

        boolean result;

        System.out.println("//EJERCICIO 22");

        x = 5; y = 14; z = 20; result = ((x >= 5) && (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 y si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 15; z = 13; result = ((x >= 5) && (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 y si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 10; z = 10; result = ((x >= 5) && (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 y si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 4; y = 5; z = 30; result = ((x >= 5) && (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 y si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);

    }

    public static void ejercicio23(int x, int y, int z) {

        boolean result;

        System.out.println("//EJERCICIO 23");

        x = 5; y = 14; z = 20; result = ((x >= 5) || (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 15; z = 13; result = ((x >= 5) || (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 10; z = 10; result = ((x >= 5) || (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 4; y = 5; z = 30; result = ((x >= 5) || (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 1; y = 20; z = 7; result = ((x >= 5) || (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 1; y = 20; z = 20; result = ((x >= 5) || (y < 15) || (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);

    }

    public static void ejercicio24(int x, int y, int z) {

        boolean result;

        System.out.println("//EJERCICIO 24");

        x = 5; y = 14; z = 14; result = ((x >= 5) || (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 20; z = 13; result = ((x >= 5) || (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 6; y = 5; z = 30; result = ((x >= 5) || (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 6; y = 20; z = 20; result = ((x >= 5) || (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);

    }

    public static void ejercicio25(int x, int y, int z) {

        boolean result;

        System.out.println("//EJERCICIO 25");

        x = 5; y = 14; z = 14; result = ((x >= 5) && (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 15; z = 13; result = ((x >= 5) && (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);
        x = 5; y = 10; z = 10; result = ((x >= 5) && (y < 15) ^ (z < 15)); System.out.printf("El resultado de si %d es mayor o igual que 5 o si %d es menor que 15 o si %d es menor que 15 es %b\n\n",x,y,z,result);

    }




}
