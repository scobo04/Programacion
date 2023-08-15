public abstract class Planta {
    private final String nombre;
    private final float altoTallo;
    private final boolean tieneHojas;
    private final String climaIdeal;

    public Planta (String nombre, float altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAltoTallo() {
        return altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public abstract void decirLoQueSoy();
}
