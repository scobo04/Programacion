public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate ejercicio = new ContainsDuplicate();
        System.out.println(ejercicio.containsDuplicate(ejercicio.numeros));
    }

    private final int[] numeros = {1,43,0,43};

    //FUNCIONA

    public boolean containsDuplicate(int[] numeros) {
        for (int i = 0; i < numeros.length -1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    return true;
                }
            }

        }
        return false;
    }
}
