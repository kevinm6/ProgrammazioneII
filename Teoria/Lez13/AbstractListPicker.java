/*
 * Kevin Manca
 * AbstractListPicker.java
 */

package List;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractListPicker {

  private final List<String> candidates;

  public AbstractListPicker(final List<String> candidates) {
    Objects.requireNonNull(candidates, "La lista di candidati non deve essere null.");
    for (final String c : candidates)
      Objects.requireNonNull(c, "I candidati non devono essere null.");
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

  /** Restituisce uno dei candidati */
  public abstract String pick();
}
