import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
/**
 * OVEWVIEW: le istanze di questa classe rappresentano la parte dominio dell'indirizzo.
 * AF(l) = l.toString()
 * RI: dominio != null, !dominio.isEmpty()
 * La classe non è dichiarata come public dato che deve essere accessibile solamente 
 * all'interno del package
 */
 class Dominio {
    

    public final String d;
    private final static String er = "^[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    final static Predicate<String> VALIDO = Pattern.compile(er).asPredicate();

    /**
     * Inizializza una nuova parte dominio. 
     * @param dominio  dominio dell'indirizzo
     * @throws IllegalArgumentException se dominio è vuota oppure se non è in un formato corretto
     * @throws NullPointerException se dominio è una stringa null
     */
    public Dominio (final String dominio){
        Objects.requireNonNull(dominio);
        if (dominio.isEmpty()) throw new NullPointerException();
        if (!(VALIDO.test(dominio))) throw new IllegalArgumentException("L'indirizzo inserito non può essere un indirizzo dominio");
        d = dominio;
    }
    
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Dominio)) return false;
        Dominio other = (Dominio)o;
        return (other.d.equals(this.d));

    }

    @Override
    public String toString(){
        return d.toString();
    }

}

