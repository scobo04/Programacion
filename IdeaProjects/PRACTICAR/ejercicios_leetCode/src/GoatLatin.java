public class GoatLatin {

    public static void main(String[] args) {
        GoatLatin ejercicio = new GoatLatin();

        String sentence = "I speak Goat Latin";
        System.out.println(sentence);
        System.out.println(ejercicio.toGoatLatin(sentence));

    }

    //FUNCIONA

    public String toGoatLatin(String sentence) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] delimitadores = {' ', ',', '.', '?', '!'};
        int contadorPalabras = 0;
        String palabra = "";
        String texto = "";
        String a = "a";

        for(int i = 0; i < sentence.length(); i++) {
            boolean esDelimitador = false;
            for(int j = 0; j < delimitadores.length; j++) {
                if(sentence.charAt(i) == delimitadores[j]) {
                    texto += modificarPalabras(palabra, vocales) + a + ' ';
                    a += "a";
                    palabra = "";
                    esDelimitador = true;
                    break;
                }
            }
            if (!esDelimitador) {
                palabra += sentence.charAt(i);
            }
        }
        texto += modificarPalabras(palabra, vocales) + a;
        return texto;
    }

    public boolean esVocal(String sentence, char[] vocales) {
        for(int i = 0; i < vocales.length; i++) {
            if(sentence.charAt(0) == vocales[i]) {
                return true;
            }
        }
        return false;
    }

    public String modificarPalabras(String sentence, char[] vocales) {
        String palabra = "";
        if(esVocal(sentence, vocales)) {
            palabra += sentence + "ma";
        } else {
            for(int i = 1; i < sentence.length(); i++) {
                palabra += sentence.charAt(i);
            }
            palabra += sentence.charAt(0) + "ma";
        }
        return palabra;
    }
}
