/*
 * Kaprekar.java
 *
 */

import java.util.*;
import java.io.*;
import java.net.URL;

public class Kaprekar {

  /***
  * Pre-conditions: a non null
  * Post-conditions: al termine della procedura, a conterrà il suo reversal
  * Effects: a potrebbe essere modificato
  */
  static void reverse(byte[] a) {

  }

  /***
  *  Pre-conditions: a non null, ciascuna posizione di a 
  *					  deve contenenere un numero compreso tra 0 e 9 (inclusi)
  *  Post-conditions: restituisce l'intero le cui cifre sono rappresentate 
  *						 dai numeri memorizzati in a
  */
  static int digitsToNum(byte[] a) {
	 int n = 0;

	 for (int i =  a.length; i >= 0; i--) {
		n *= 10;
		n += a[i];
	 }
	 return n;
  }

  /***
  * Pre-conditions: 0 < digits, digits >= cifre di n, n ≥ 0
  * Post-conditions: resistuisce un array contenente le cifre di n
  */  
  static byte[] numToDigits(int n, int digits) {
	 byte[] a = new byte[digits];
	 for (int i = 0; i < digits; i++) {
		a[i] = (byte) (n % 10);
		n /= 10;
	 }
	 return a;
  }

  /***
   * Pre-conditions: n ≥ 0
   * Post-conditions: resistuisce il numero successivo della sequenza
   */
  static int nextKaprekar(int n) {
	 byte[] a = numToDigits(a, 4);
	 Arrays.sort(a);
	 
	 n = digitsToNum(a);
	 reverse(a);
	 n += digitsToNum(a);
	 return n;
  }


  /***
   * Pre-conditions: 0 <= n ≤ 9999, n deve avere almeno due cifre diverse
   * Post-conditions: Stampa la sequenza di Kaprekar a partire dal numero n
   * Effect: System.out viene modificato
   */
  static void printKaprekar(int n) {
	 if (n < 0 || n > 9999) {
		throw new IllegalArgumentException("L'input dev'essere compreso tra 0 e 9999."); 
	 }

	 while(n != 6174) {
		System.out.println(n);
		n = nextKaprekar(n);
	 }
	 System.out.println(n);
  }

  public static void main(String[] args) {
	 InputStream is;
	 try {
	 	 is = new URL("https://www.random.org/integers/?num=1&min=0&max=9999&col=1&bas=10&format=plain&rnd=new").openStream();
	 } catch (MalformedURLException e) {
		is = System.in;
		System.err.println("URL non valido");
		// e.printStackTrace();
	 } catch (IOException e) {
		is = System.in;
	 }

	 Scanner s = new Scanner(System.in);
	 printKaprekar(s.nextInt());
  }

}
