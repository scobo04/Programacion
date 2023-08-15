public class Strings {

    public static void main(String[] args) {

        String saludo = "Hola mundo";
        //System.out.println(saludo);

        //saber la longitud de saludo
        int longitud = saludo.length();
        System.out.println(saludo + " " + longitud);

        //sacar la letra en la posición dada
        char mychar = saludo.charAt(2);

        //siempre será false, porque tiene contenido
        boolean stringVacio = saludo.isEmpty();

        //muestra si contiene o no una cadena
        boolean containsSting = saludo.contains("mu");

        //saca las letras del rango dado
        String substring = saludo.substring(2, 5);

        //reemplaza una letra por otro número o caracter
        String newString = saludo.replace("o", "5");

        System.out.println(saludo + " " + longitud + " " + mychar + " " + substring + " " + newString);

    }

}
