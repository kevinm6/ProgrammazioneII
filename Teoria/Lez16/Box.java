/**
*	Kevin Manca
* Matricola 978578
* Box.java
*/

import java.util.*;
import java.Object;

public class Box<E> {

	private final E o;
	public Box(E o) {
		this.o = o;
	}

	public Object get() {
		return o;
	}

	public static void main (String[] args) {
		Box b0 = new Box("PIPPO");
		Box b1 = new Box(Integer.valueOf(3));

		System.out.println(
			((String)b0.get()).lenght() + ((String)b1.get()).lenght();
		)
	}
	

}

