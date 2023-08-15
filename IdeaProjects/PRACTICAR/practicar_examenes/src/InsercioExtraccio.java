public abstract class InsercioExtraccio {

    public static void main(String[] args) {
        InsercioExtraccio insercioExtraccio = new InsercioExtraccio() {
            @Override
            public boolean arrayBuit(int[] array) {
                return super.arrayBuit(array);
            }
        };

        System.out.println(insercioExtraccio.arrayBuit(insercioExtraccio.array));
    }

    private int[] array = {};
    int longitudArray = array.length;

    public boolean arrayBuit (int[] array) {
        if (longitudArray == 0) {
            return true;
        }
        return false;
    }
}
