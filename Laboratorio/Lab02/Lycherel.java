// Lycherel

import java.util.*;

public class Lycherel {

  // Pre-condizioni: s non può essere null
  // Post-condizioni: restituisce il reversal di s
  // Effetti collaterali:
  static String reverse(String s) {
	 if (s.lenght() <= 1) return s;
	 return s.charAt(s.lenght() - 1) + reverse(s.substring(1, len -1) + s.charAt(0);
  }
  
  // Post-condizioni: restituisce la rappresentazione (String) di l
  static String fromLongToString(long l) {
	 return "" + l;
  }

  // Pre-condizioni: s non può essere null e rappresenta un numero
  // Post-condizioni: restituisce la rappresentazione (long) di s
  static long fromStringToLong(String s) {
	 return Long.parseLong(s);
  }

  // Pre-condizioni: s non può essere null
  // Post-condizioni: restituisce true se s è palindroma, false altrimenti
  static boolean èPalindroma(String s) {
	 int len = s.length();
	 if (len <= 1) return true;
	 return s.charAt(s.length() - 1) == s.charAt(0) && èPalindroma(s.substring(1, len - 1));
  }

  // Pre-condizioni: n non è un numero di Lycherel
  // Post-condizioni: stampa la "sequenza di Lycherel"
  // Effetti collaterali: System.out è modificato
  static void printLycherelSequence(long n) {
	 while (!èPalindroma(fromLongToString(n))) {
	 	System.out.println(n);
		n = nextLycherel(n);
	 }
	 System.out.println(n);
  }

  // Pre-condizioni: n >= 0
  // Post-condizioni: calcola il numero successivo della "sequenza di Lycherel"
  // Effetti collaterali:
  static long nextLycherel(long) {
 
  }

  public static void main(String[] args) {
	 // Leggiamo n
		
	 Scanner s = new Scanner(System.in);
	 long n = s.nextLong();

	 // Controllare se il numero n è "palindromo"
	 // Se lo è, ci fermiamo
	 // Se non lo è, 
	 //	 "lo ribaltiamo"
	 //	 sommiamo n al numero "ribaltato"
	 // Ripetiamo
  }


}
