public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord prueba = new LengthOfLastWord();

        System.out.println(prueba.lengthOfLastWord("Hola que tal"));

    }

    //FUNCIONA

    public int lengthOfLastWord(String s) {
        int contador = 0;
        boolean encontrado = false;

        for(int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (encontrado) {
                    break;
                }
            } else {
                encontrado = true;
                contador++;
            }
        }
        return contador;
    }
}
