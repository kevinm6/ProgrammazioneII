//
//	Kevin Manca
//	Matricola 978578
//	SparsePoly.java
//


import java.util.List;

import jdk.internal.misc.TerminatingThreadLocal;

/**
 *	Gli oggetti di questa classe rappresentano polinomi sparsi.
 *	Gli oggetti di questa classe sono immutabili.
 */

public class SparsePoly {
	/**
	 *	InnerSparsePoly
	 *	Questo record rappresenta un termine (coppia (esponente, coefficiente))
	 */
	private record Term(int coeff, int degree) {
		public Term {
			if (degree < 0) throw new NegativeDegreeException("Il grado dev'essere non negativo");
		}
	}

	// Attributi
	// I termini del polinomio.
	// (1, 2), (3, 4), (5, 6) -> x^2 + 3x^4 + 5x^6
	private List<> term;

	// Costruttori
	/**
	 *	Costruisce il polinomio zero
	 */
	public SparsePoly() {
		term = new ArrayList();
		// term.add(new Term(coeff, degree))
	}

	// Metodi
	
	/**
	* Post-condition: restituisce il grado del polinomio
	*/
	public int degree() {
		if (term.size() == 0) return -1;
		return term.get(term.size() - 1).degree;
	}
	
	private int findByDegree(int degree) {
		int min = 0;
		int max = term.size()-1;

		while (min <= max) {
			int mid = (max + min)>>1;	// shift logico di 1
			if (term.get(mid) == degree) {
				return mid;
			}

			if (term.get(mid).degree > degree) min = mid + 1;
			else max = mid - 1;
		}
		return -(min + 1);
	}


	/**
	*	Pre-condition: degree ≥ 0
	* Post-condition: restituisce il coefficiente di x^degree se degree degree ≥0
	* Effects: 
	*/
	public int coeff(int degree) {
		int i = findByDegree(degree);
	}

	/**		
	* Pre-condition: p diverso da null
	* Post-condition: restituisce il polinomio this + p
	*/
	public SparsePoly sum(SparsePoly p) {
		int indexThis = 0, indexP = 0;
		SparsePoly result = new SparsePoly();

		while (indexThis < term.size() && indexP < p.term.size()) {
			int diff = term.get(indexThis).degree - p.term.get(indexP).degree;
			if (diff == 0) {
		int newCoeff = term.get(indexThis).coeff + p.term.get(indexP).coeff;
			if (newCoeff != 0)
				result.term.add(new term.get(indexThis).coeff + term.get(indexP).coeff, term.get(indexThis))
				indexThis++; indexP++;
			}

			}
			else if (diff < 0) {
				result.term.add(term.get(indexThis++));
			} else result.term.add(p.term.get(indexP++));
		}
		
	for (; indexThis < term.size() ) {


	}

		return result;
	}

	/**		
	* Pre-condition: p diverso da null
	* Post-condition: restituisce il polinomio this * p
	*/
	public SparsePoly mul(SparsePoly p) {
		SparsePoly result = new SparsePoly();
		if (degree() == -1 || p.degree() == -1)
			return result;
		
		for (int i = 0; i < term.size(); i++)
			for	(int j = 0; j < p.term.size(); j++) {
				int newCoeff = term.get(i).coeff * term.get(j).coeff;
				int newDegree = term.get(i).degree + p.term.get(j).degree;
				int index = result.findByDegree(newDegree);
				
				if (index >= 0)
					result.term.set(index, new Term(result.term
								.get(index).coeff + newCoeff, newDegree))
				else result.term.add(-index-1, new Term(newCoeff, newDegree));
			}
		return result;
	}

	/**		
	* Pre-condition: p diverso da null
	* Post-condition: restituisce il polinomio this - p
	*/
	public SparsePoly diff(SparsePoly p) {
		return this.sum(p.minus());
	}

	/**		
	* Pre-condition: p diverso da null
	* Post-condition: restituisce il polinomio this - this
	*/
	public SparsePoly minus() {
		SparsePoly result = new SparsePoly();

		for (int i = 0; i < term.size(); i++) 
			result.term.add(new Term(-term.get(i).degree));

		return result;
	}

}
