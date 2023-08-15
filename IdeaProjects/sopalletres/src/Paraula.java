public class Paraula {
    private Lletra[] lletres;
    private DireccioParaula direccioParaula;
    private boolean reverse;

    public Paraula(Lletra[] lletres){
        this.lletres = lletres;
    }

    public Paraula(char[] lletres){
        this.lletres = new Lletra[lletres.length];
        for(int i=0; i<lletres.length; i++){
            this.lletres[i] = new Lletra(lletres[i]);
        }
    }

    public Paraula(String paraula){
        this.lletres = new Lletra[paraula.length()];
        for(int i=0; i<paraula.length(); i++){
            this.lletres[i] = new Lletra(paraula.charAt(i));
        }
    }

    public Lletra[] getLletres() {
        return lletres;
    }

    public DireccioParaula getDireccioParaula() {
        return direccioParaula;
    }

    public void setDireccioParaula(DireccioParaula direccioParaula) {
        this.direccioParaula = direccioParaula;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }
}
