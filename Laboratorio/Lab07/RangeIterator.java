import java.util.*;

public class RangeIterator {

	// Attributi
	private int end;
	private int next;
	private int step;
	private int hasNext;

	public RangeIterator(int start, int end, int step) {
		if (step == 0) throw new IllegalArgumentException("Step non può valere 0.");
		this.end = end;
		this.step = step;
		hasNext = step > 0 ? start < end : end < start;
		next = start;
	}

	@Override
	public Iterator<Integer> iterator() {
		Integer next() {
			if (!hasNext()) throw new NoSuchElementException();
			hasNext = false;
			return next;
		}

		boolean hasNext() {
			if (!hasNext()) {
				next += step;
				hasNext = step > 0 ? next < end : end < next;
			}
			return hasNext;
		}
	}


}

