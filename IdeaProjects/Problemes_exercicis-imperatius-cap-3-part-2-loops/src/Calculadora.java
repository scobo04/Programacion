public class Calculadora {

    public void parse(String input) {

        //Llevar espais en blanc
        String operacio = input.replaceAll(" ", "");

        int operacioMatematica = 0; //1-suma 2-resta 3-mult 4-div
        int[] operadors = new int[2];
        if (operacio.contains("+")) {
            operacioMatematica = 1;
            String[] operadorStr = operacio.split("\\+", 0);
            for (int i = 0; i < operadorStr.length; i++) {

                operadors[i] = Integer.parseInt(operadorStr[i]);

            }

        }

    }

}
