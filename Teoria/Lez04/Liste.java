// Liste java

import java.util.LinkedList;
import java.util.List;

public class Liste {
	
	public static void main(String[] args) {

		List<Integer> lista = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(i); // Integer.valueOf(i)
		}	
		System.out.println(lista);
	}
}

