public class Flor extends Planta {
    private final String colorDePetalos;
    private final float cantidadPromedioPetalos;
    private final String colorPistillo;
    private final String colorDeLosPetalos;
    private final String variedadFlor;
    private final String estacionFlorece;

    public Flor(String nombre, float altoTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos, float cantidadPromedioPetalos, String colorPistillo, String colorDeLosPetalos, String variedadFlor, String estacionFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistillo = colorPistillo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public float getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy una flor");
    }
}
