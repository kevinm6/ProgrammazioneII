/*
* Kevin Manca
* 
*/

import java.util.*;

public class Sottotipo {

  public static <T extends Number> double somma(List<T> val) {
    double risultato = 0;
    for (Number i: val) risultato += i.doubleValue();
    return risultato;
  }

  public static <T> void copia(List<T> sorgente, List<S> destinazione) {
    for (S s: sorgente) destinazione.add(s);
  }

	public static void main (String[] args) {
    // Integer i;
    // Object o;

    // List<Integer> li = new ArrayList<>();
    // List<Object> lo = li;
    //
    // lo.add(new Object());
    // i = li.get(0);


    // Integer[] ai = new ArrayList<>();
    // Object[] ao = li;
    //
    // ao[0] = new Object();


    // List<Integer> li = List.of(1, 2, 3);
    // List<Number> lc = new ArrayList<>();
    //
    // copia(li, lc);
    // copia(li, lc);
    // System.out.print(lc);

    List<? extends Number> lan;
    List<Integer> li = List.of(1, 2, 3);
    // List<?> lw;
    List<Double> ld = List.of(4.0);
    
    lan = li;

    Number n = lan.get(0);

    lw = li;

    Object o = lw.get(0);


	}
}

