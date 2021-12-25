/**
*	Kevin Manca
*	Matricola 978578
*	MapExample.java
*/

package Lez15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;


public class MapExample {
	
	record Persona(String nome, int età) {}

	public static void main(String[] args) {
		List<Persona> persone = List.of(
			new Persona("Kevin", 28),
			new Persona("Kevin", 48),
			new Persona("Tim", 62),
			new Persona("Phil", 60),
			new Persona("Eddy", 52),
			new Persona("Jony", 58)
		);

		Map<Integer, List<Persona>> età2persone = new TreeMap<>();
		for (final Persona p: persone) {
			if (età2persone.containsKey(p.età)) {
				età2persone.get(p.età).get(p.età);
			} else {
				final List<Persona> coetanei = new ArrayList<>();
				coetanei.add(p);
				età2persone.set(p.età, coetanei);
			}
		}

		for (final Integer età: età2persone.keySet()) {
			final List<Persona> coetanei = età2persone.get(età);
			System.out.println(coetanei.size() + " persone di " + età + " anni:");
			Collections.sort(coetanei);
			for (final Persona p: coetanei)
				System.out.println("\t" + p.nome);
		}

		System.out.println(età2persone);
	}

}
