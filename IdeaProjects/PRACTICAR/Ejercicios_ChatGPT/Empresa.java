import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Scanner seguir = new Scanner(System.in);
        System.out.println("Introducir más?");
        int n = seguir.nextInt();
        empresa.imprimirUsuarios(n);
    }

    String[] empleados = new String[20];


    private boolean seguir (int n) {

        if (n == 1) {
            return true;
        }
        return false;
    }


    private String[] anadirUsuario (int n) {
        if (seguir(n)) {
            for (int i = 0; i < empleados.length; i++) {
                Scanner empleado = new Scanner(System.in);
                System.out.print("Introduce el nombre: ");
                String nombre = empleado.next();
                empleados[i] = nombre;
            }
        }

        return empleados;
    }

    private void imprimirUsuarios (int n) {
        System.out.println(Arrays.toString(anadirUsuario(n)));
    }
}
