/*
 *	Java FilterIterator class
 */

import java.util.Iterator;
import java.util.function.predicate;


public class FilterIterator implements Iterator<T> {

	Iterator<T> iterator;
	Predicate<T> predicate;
	private boolean hasNext;
	private T next;

	FilterIterator(Iterator<T> iterator, Predicate<T> predicate) {
		this.iterator = iterator;
		this.predicate = predicate;
	}

	@Override
	public boolean hasNext() {
		while (!hasNext && iterator.hasNext()) {
			next = iterator.next();
			hasNext = predicate.test(next);
		}
		return hasNext;
	}

	@Override
	public T next() {
	if (!hasNext()) throw new NoSuchElementException();
		hasNext = false;	
		return null;
	}
}

