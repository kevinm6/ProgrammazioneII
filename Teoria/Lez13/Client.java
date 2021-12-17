/*
 *  Kevin Manca
 *  Client.java
 */


package it.unimi.di.prog2.dalvivo;


public class Client {

	public static void main (String[] args) {
    final List<String> candidates = List.of("Pino", "Clara", "Tom");

    final Picker slp = new SequentialListPicker(candidates);
    while (slp.remaining() > 0) System.out.println(Arrays.toString(slp.pick(2)));
    System.out.println("----");
    final Picker rlp = new RandomListPicker(candidates);
    while (rlp.remaining() > 0) System.out.println(Arrays.toString(rlp.pick(2)));
    System.out.println("----");
    final Picker rng = new SequentialNumberedPicker(4);
    while (rng.remaining() > 0) System.out.println(Arrays.toString(rng.pick(2)));
	}
}

