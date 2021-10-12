// Liste java

import java.util.List;
import java.util.LinkedList;

public class Liste {
	
	public static void main(String[] args) {
		
		List<Integer> lista = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(i); // Integer.valueOf(i)
		}	
		System.out.println(lista);
	}
}

