// Scomposizione.java

import java.util.*;

public class Scomposizione {

  public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);

	 int n = in.nextInt();

	 List<List<Integer>> scomposizioni = new ArrayLIst<>(n);
	 List<Integer> primi = new LinkedList<>();

	 scomposizioni.add(List.of());
	 scomposizioni.add(List.of());

	 primi.add(2);

	 for (int i = 2; i <= n; i++) {
		List<Integer> fattori = new LinkedList<>();
		for (int p : primi) {
		  if (i % p == 0) {
			 fattori.add(p);
			 fattori.addAll(scomposizioni.get(i / p));
			 scomposizioni.add(fattori);
		  } else if (p * p > i) {
			primi.add(i);
			fattori.add(i);
			break;
		  }
		}
		scomposizioni.add(fattori);
	 }
  for (int i = 2; i <= n ; i++) {
	 System.out.println(i + " -> " + scomposizioni.getClass(i));
  }

  }


}
