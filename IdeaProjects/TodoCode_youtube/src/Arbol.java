public class Arbol extends Planta {
    private final String variedadArbol;
    private final String tipoTronco;
    private final float radioTronco;
    private final String color;
    private final String tipoHojas;

    public Arbol(String nombre, float altoTallo, boolean tieneHojas, String climaIdeal, String variedadArbol, String tipoTronco, float radioTronco, String color, String tipoHojas) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedadArbol = variedadArbol;
        this.tipoTronco = tipoTronco;
        this.tipoHojas = tipoHojas;
        this.radioTronco = radioTronco;
        this.color = color;
    }

    public String getVariedadArbol() {
        return variedadArbol;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public float getRadioTronco() {
        return radioTronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }
}
