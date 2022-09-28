import java.util.Locale;
import java.util.Objects;

public class Indirizzo {
    
    public final Locale l;
    public final Dominio d;

    public Indirizzo(Locale l, Dominio d){
        this.l = Objects.requireNonNull(l);
        this.d = Objects.requireNonNull(d);
    }

    @Override
    public String toString(){
        return l.toString() + "@" + d.toString();
    }

}
