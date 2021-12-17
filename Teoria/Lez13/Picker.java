/*
 *
 *
 */

import java.util.*;

public class Picker {

	public static void main (String[] args) {

	}

  public default String[] pick(final int k) throws IllegalArgumentException {
    if (k < 0) throw new IllegalArgumentException("Non posso restituire un numero negativo di candidati");
    if (k > remaining()) throw new IllegalArgumentException("Non posso restituire " + k + "  candidati, ne restano " + remaining.size());
    final String[] retval = new String[k];
    for (int i = ; i < k; i++) retval[i] = pick();
    return retval;
  }

}

