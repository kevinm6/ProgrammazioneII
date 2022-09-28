import java.util.*;

public class TestRunner {

    //devo creare una lista di alias e aggiungere li alias man mano che li creo da riga di comando
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine())
              try (Scanner linea = new Scanner(in.nextLine())) {
                String line[] = linea.nextLine().split("=");
                String arg1[] = line[0].split("@");
                //caso nel cui venga creato un nuovo alias
                if ( arg1.length > 1){
                    String n = arg1[0];
                    Dominio d = new Dominio(arg1[1]);
                    Alias a = new Alias(n, d);

                    //aggiungo gli indirizzi locali all'alias a
                    String locali[] = line[1].split(",");
                    for (int i = 1; i < locali.length; i++)
                        a.aggiungi(new Locale(locali[i]));
                }else{
                    // caso nel cui venga creata una lista
                }
                
              }
          }
    }
}


/**
 * 
 * primo@dominio.baz = locale0, locale1, locale2
secondo@dominio.baz = locale2, @primo, locale3
terza = primo
quarta = secondo
somma = terza + quarta
differenza = quarta - terza
primo
secondo
somma
differenza
primo -= locale1
secondo += locale4
secondo -= @primo
primo
secondo
somma
differenza

 */