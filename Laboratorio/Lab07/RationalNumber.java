/*
 * Kevin Manca
 * Matricola 978578
 */
import java.util.*;


/**
 * Gli oggetti di questa classe rappresentano numeri
 */
public class RationalNumber {
	
	// Campi
	private int num;
	private int den;

	/**
	 *	AF(num, den) = num / den
	 *	RI(num, den) = den > 0, gcd(num, den) = 1
	 *	AI(num, den) = den != 0 (La preservazione è garantita dalla preservazione della RI)
	 */
		/**
		* Costruisce il numero razionale num / den
		* num / den = -num/ -den = (num / cd)/(den/cd), dove cd = gcd(num, den)
		* @param num
		* @param den
	 */
	public RationalNumber(int num, int den) {
		if (den < 0)
			throw new InvalidArgumentException();

		if (num == 0)
			den = 1;
		// Metodo per semplificare
		// "Aggiustare i segni"
		if (den < 0) {
			num = -num;
			den = -den;
		}

		// Metodo per semplificare
		int cd = gcd(Math.abs(num), den);

		this.num = num/cd;
		this.den = den/cd;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RationalNumber)) return false;
		RationalNumber o = (RationalNumber) obj;
		return this.num == o.num && this.den == o.den;
	}
	

	/**
	* Post-condizioni: restituisce il numero razionale this * other
	* (numA * numB) / (denA * denB) = numA/denA * numB/denB
	 */
	public RationalNumber mul(RationalNumber other) {
		return new RationalNumber(num * other.num, den * other.den);
	}

	/**
	 *	Pre-condition:
    */
	public RationalNumber add(RationalNumber other) {
		return new RationalNumber(num + other.den + other.num * den, den * other.den);
	}

	/**
	 *	Post-condition: restituisce il reciproco di this, e solleva un'eccezione se this == 0
	 */
	public RationalNumber reciprocal() {
		return new RationalNumber(den, num);
	}

	/**
	 *	Post-condition: restituisce il numero razionale this / other	
	 */
	public RationalNumber div(RationalNumber other) {
		return mul(other.reciprocal());
	}

	
	private static int gcd(int a, int b) {
		if (a < 0 || b < 0)
			throw new IllegalArgumentException();
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}


	public RationalNumber(int num) {
		this(num, 1);
	}

}

