public class Main {
    public static void main(String[] args) {

        int[] array = {3,40,1,61,32,53,86,11};

        System.out.println(suma(array));
        System.out.println(valorMinimoMatriz(array));
        System.out.println(valorMaximoMatriz(array));
        System.out.println(indiceValorMinimoMatriz(array));
        System.out.println(indiceValorMaximoMatriz(array));
    }

    public static int suma(int[] Matriz) {
        int suma = 0;
        for (int i = 0; i < Matriz.length; i++) {
            suma += Matriz[i];
        }
        return suma;
    }

    public static int valorMinimoMatriz(int[] Matriz) {
        int minimoValor = Matriz[0];
        for (int i = 0; i < Matriz.length; i++) {
            if (Matriz[i] < minimoValor) {
                minimoValor = Matriz[i];
            }
        }
        return minimoValor;
    }

    public static int valorMaximoMatriz(int[] Matriz) {
        int maximoValor = Matriz[0];
        for (int i = 0; i < Matriz.length; i++) {
            if (Matriz[i] > maximoValor) {
                maximoValor = Matriz[i];
            }
        }
        return maximoValor;
    }

    public static int indiceValorMinimoMatriz(int[] Matriz) {
        int indiceValorMinimo = 0;
        for (int i = 0; i < Matriz.length; i++) {
            if (valorMinimoMatriz(Matriz) == Matriz[i]) {
                indiceValorMinimo = i;
            }
        }
        return indiceValorMinimo;
    }

    public static int indiceValorMaximoMatriz(int[] Matriz) {
        int indiceValorMaximo = 0;
        for (int i = 0; i < Matriz.length; i++) {
            if (valorMaximoMatriz(Matriz) == Matriz[i]) {
                indiceValorMaximo = i;
            }
        }
        return indiceValorMaximo;
    }
}