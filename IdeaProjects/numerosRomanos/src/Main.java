public class Main {
    public static void main(String[] args) {

    }

    public int romanToInt(String n) {

        int suma = 0;

        for (int i = 0; i < n.length(); i++) {

            if (n.charAt(i) == 'I') {

                if (i < n.length() -1 && (n.charAt(i+1) == 'V' || n.charAt(i+1) == 'X')) {

                    suma -= 1;

                } else {

                    suma += 1;

                }

            } else if (n.charAt(i) == 'V') {

                suma += 5;

            } else if (n.charAt(i) == 'X') {

                if (i < n.length() -1 && (n.charAt(i+1) == 'L' || n.charAt(i+1) == 'C')) {

                    suma -= 10;

                } else {

                    suma += 10;

                }

            } else if (n.charAt(i) == 'L') {

                suma += 50;

            } else if (n.charAt(i) == 'C') {

                if (i < n.length() -1 && (n.charAt(i+1) == 'D' || n.charAt(i+1) == 'M')) {

                    suma -= 100;

                } else {

                    suma += 100;

                }

            } else if (n.charAt(i) == 'D') {

                suma += 500;

            } else if (n.charAt(i) == 'M') {

                suma += 1000;

            }

        }
        return suma;
    }
}