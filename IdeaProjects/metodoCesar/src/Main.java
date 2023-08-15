public class Main {

    //Programar una classe amb un mètode per xifrar emprant el mètode caesar i un altre mètode per desxifrar.
    public static String cifrar(String texto, String alfabeto) {
        String textoCodificado = "";
        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = alfabeto.indexOf(caracter);

            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += alfabeto.charAt( (pos + 3) % alfabeto.length() );
            }
        }
        return textoCodificado;
    }

    public static String descifrar(String texto, String alfabeto) {
        String textoDescodificado = "";
        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = alfabeto.indexOf(caracter);

            if(pos == -1){
                textoDescodificado += caracter;
            }else{
                if (pos - 3 < 0) {
                    textoDescodificado += alfabeto.charAt(alfabeto.length() + (pos - 3));
                } else {
                    textoDescodificado += alfabeto.charAt( (pos - 3) % alfabeto.length() );
                }
            }
        }
        return textoDescodificado;
    }

}