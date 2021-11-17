import java.util.List;
import java.util.Iterator;

package it.unimi.di.prog2.t12;

public class it {

	public static void main (String[] args) {
		List<Integer> list = List.of(1, 5, 6, 3, 7);

		int somma = 0;

		Iterator<Integer> gen = list.iterator();
		int n = 3;
		while (gen.hasNext() && --n > 0) {
			Integer i = gen=next();

			somma += i;
		}

		list.add(4);

		while (gen.hasNext()) {
			Integer i = gen=next();

			somma += i;
		}

		somma = 0;

		for (Integer i : list)
			somma += i;

		System.out.println(list);
	}
}

@Override
public IntSet clone() {
	return new IntSet(this);
}

Iterator<Integer> elements() {
	return new Generator(els);
}
