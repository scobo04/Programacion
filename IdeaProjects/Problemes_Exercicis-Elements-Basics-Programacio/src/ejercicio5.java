import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio5 {

    public static void main(String[] args) throws Exception {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce el nombre: ");
        String nombre = leer.readLine();
        System.out.print("Introduce el apellido1: ");
        String apellido1 = leer.readLine();
        System.out.print("Introduce el apellido2: ");
        String apellido2 = leer.readLine();
        System.out.print("Introduce la edad: ");
        byte edad = Byte.parseByte(leer.readLine());
        System.out.print("Introduce la estatura: ");
        double estatura = Double.parseDouble(leer.readLine());
        System.out.println("---------------------------------");
        nombrePersona(nombre);
        apellidoUnoPersona(apellido1);
        apellidoDosPersona(apellido2);
        edadPersona(edad);
        estaturaPersona(estatura);

    }

    public static String nombrePersona(String nombre) {
        System.out.println("Nombre: " + nombre);
        return nombre;
    }

    public static String apellidoUnoPersona(String apellidoUno) {
        System.out.println("Apellido1: " + apellidoUno);
        return apellidoUno;
    }

    public static String apellidoDosPersona(String apellidoDos) {
        System.out.println("Apellido2: " + apellidoDos);
        return apellidoDos;
    }

    public static byte edadPersona(byte edad) {
        edad += 2;

        System.out.println("Edad: " + edad);
        return edad;
    }

    public static double estaturaPersona(double estatura) {
        estatura /= 2;

        System.out.println("Estatura: " + estatura);
        return estatura;
    }

}
