import java.util.*;
/**
 * OVERVIEW: Un alias è un elenco di parti
 * locali di indirizzo email a cui è associato un *nome* (dato da una stringa
 * qualunque, purché non vuota) e un *dominio*.
 * AF(nome, elenco):
 * IR:
 */
public class Alias implements Iterable<Indirizzo>{

    public final String nome;
    public final Dominio d;
    //I Set non permettono l'inserimento di elementi duplicati a differenza delle liste. 
    //Per questo motivo sono più indicati per questa implementazione.
    private final Set<Locale> elenco;

    public Alias(final String n, final Dominio d){
        if (n.isEmpty()) throw new IllegalArgumentException("Impossibile creare alias con una stringa vuota");
        this.d = Objects.requireNonNull(d);
        this.nome = Objects.requireNonNull(n);
        elenco = new HashSet<>();
    }

    /**
     * Se non è già presente, aggiunge l all'elenco degli indirizzi localo
     * @param l nuovo indirizzo locale da aggiungere a this
     */
    public void aggiungi(Locale l){
        Objects.requireNonNull(l);
        elenco.add(l);
    }


    /**
     * Se presente, rimuove l dall'elenco di indirizzi locali
     * @param l indirizzo da rimuovere da this
     */
    public void rimuovi(Locale l){
        Objects.requireNonNull(l);
        elenco.remove(l);
    }

    /** 
     * @return true se i è contenuto in this, false altrimenti
     */
    public boolean contiene(Indirizzo i){
        Objects.requireNonNull(i);
        if (!(i.d.equals(this.d))) return false;
        return elenco.contains(i.l);
    }

    @Override
    public boolean equals(Object o){
       if (!(o instanceof Alias)) return false;
       Alias other = (Alias)o;
       return other.nome.equals(this.nome);
    }


    @Override
    public String toString(){
        String str = "";
        Iterator<Indirizzo> it = this.iterator();
        while (it.hasNext())
            str += it.next();
        return str;
    }

    /**
     * @return iteratore che itera su tutti gli indirizzi contenuti nell'elenco
     */
    public Iterator<Indirizzo> iterator(){
        return new Iterator<Indirizzo>() {

            private final Iterator<Locale> it = elenco.iterator(); 
            private Indirizzo next = null;
            private int current;
            @Override
            public boolean hasNext() {
                return (current < elenco.size());
            }
    
            @Override
            public Indirizzo next() {
                current++;
                return new Indirizzo(it.next(), d);
        }
            
        };
    }


    public static void main(String[] args) {
        Alias a = new Alias("primo", new Dominio("studenti.it"));
        a.aggiungi(new Locale("marco"));
        a.aggiungi(new Locale("mauro"));
        a.aggiungi(new Locale("matteo"));
        System.out.println(a.toString());
    }
}
