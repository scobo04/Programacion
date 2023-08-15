import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la frase: ");
        String frase = scanner.next();

        String texto = Main.cifrar(frase, alfabeto);
        System.out.println(texto);

        texto = Main.descifrar(texto, alfabeto);
        System.out.println(texto);
    }
}
