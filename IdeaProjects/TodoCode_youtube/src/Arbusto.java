public class Arbusto extends Planta {
    private final float anchoArbusto;
    private final boolean esDomestica;
    private final String variedadArbusto;
    private final String colorHojas;
    private final boolean sePodaONo;

    public Arbusto(String nombre, float altoTallo, boolean tieneHojas, String climaIdeal, float anchoArbusto, boolean esDomestica, String variedadArbusto, String colorHojas, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestica = esDomestica;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public float getAnchoArbusto() {
        return anchoArbusto;
    }

    public boolean isEsDomestica() {
        return esDomestica;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");
    }
}
