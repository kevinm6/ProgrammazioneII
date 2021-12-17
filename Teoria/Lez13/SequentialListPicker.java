
package it.unimi.di.prog2.dalvivo;

import java.util.List;

public class SequentialListPicker extends AbstractListPicker {

  final private List<String> candidates;

	public AbstractListPicker(final List<String> candidates) {
    Objects.requireNonNull(candidates, "La lista di candidati non deve essere null.");
    for (final String c: candidates) Objects.requireNonNull(c, "I candidati non devono essere null.");
    this.candidates = new LinkedList<>(candidates);
	}

  /**
  * Rimuove l'i-esimo elemento e lo restituisce
  * 
  * @param i
  * @return
  */
  protected String remove(final int i) {
    return candidates.remove(i);
  }

  public int remaining() {
    return candidates.size();
  }

  /**
  * Restituisce uno dei candidati
  */
  public abstract String pick();

}
