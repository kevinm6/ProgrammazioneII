/*
 *  Kevin Manca
 *  SequentialNumberedPicker.java
 */

package it.unimi.di.prog2.dalvivo;

public class SequentialNumberedPicker implements Picker {

  private final int tot;
  private int next;

  public SequentialNumberedPicker(final int tot) {
    if (tot < 0) throw new IllegalArgumentException("Il numero di candidati non può essere nullo.");
    this.tot = tot;
    next = 0;
  }

  @Override
  public int remaining() {
    return 0;
  }

  @Override
  public int pick() {
    return 0;
  }




}
