import java.util.list;
import java.util.Iterator;
package it.unimi.di.prog2.t08

public class Generator implements Iterator<Integer> {

	Iterator<Integer> elements() {

		return new Iterator<Integer>() { // classe locale anonima

			private int next = 0;
			
			@Override
			public boolean hasNext() {
				return next < els.size();
			};

			@Override
			public Integer next() {
				if (!hasNext()) throw new NoSuchElementException();
					return els.get(next++);
			};
		};
	}
}


