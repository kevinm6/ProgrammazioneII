package it.unimi.di.prog2.dalvivo;

import java.util.List;
import java.util.Random;

public class RandomListPicker extends AbstracListPicker {

  private final Random rng = new Random();

	public RandomListPicker(List<String> candidates) {
    super(candidates);
	}

  @Override
  public String pick() throws IllegalArgumentException {
    if (remaining() == 0) throw new IllegalArgumentException("Non sono rimasti candidati.");
    return remove(rng.nextInt(remaining()));
  }

}

