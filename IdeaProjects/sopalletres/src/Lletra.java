import java.util.Objects;

public class Lletra {
    private char lletra;

    public Lletra(char lletra) {
        this.lletra = lletra;
    }

    public char getLletra() {
        return lletra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lletra lletra1 = (Lletra) o;
        return lletra == lletra1.lletra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lletra);
    }
}
