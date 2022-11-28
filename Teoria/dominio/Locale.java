import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * OVEWVIEW: le istanze di questa classe rappresentano la parte locale dell'indirizzo.
 * AF(l) = l.toString()
 * RI: locale != null, !locale.isEmpty()
 * La classe non è dichiarata come public dato che deve essere accessibile solamente 
 * all'interno del package
 */
 class Locale {
    

    public final String l;
    private final static String er = "^[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*$";
    final static Predicate<String> VALIDO = Pattern.compile(er).asPredicate();

    /**
     * Inizializza una nuova parte locale. 
     * @param locale indirizzo locale
     * @throws IllegalArgumentException se locale è vuota oppure se non è in un formato corretto
     * @throws NullPointerException se locale è una stringa null
     */
    public Locale (final String locale){
        Objects.requireNonNull(locale);
        if (locale.isEmpty()) throw new NullPointerException();
        if (!(VALIDO.test(locale))) throw new IllegalArgumentException("L'indirizzo inserito non può essere un indirizzo locale");
        l = locale;
    }
    

    @Override
    public String toString(){
        return l.toString();
    }

}
