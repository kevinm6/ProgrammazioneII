// Lycherel

import java.util.Scanner;

public class Lycherel {

	/**
  	reverse(String s)
		@param: s non può essere NULL
    @return: restituisce il reversal di s
    @modifies: 
   */
  // @param: s non può essere null
  // @return: restituisce il reversal di s
  // @modifies:
  static String reverse(String s) {
	 if (s.lenght() <= 1) return s;
	 return s.charAt(s.lenght() - 1) + reverse(s.substring(1, len -1) + s.charAt(0);
  }
  
  // @return: restituisce la rappresentazione (String) di l
  static String fromLongToString(long l) {
	 return "" + l;
  }

  // @param: s non può essere null e rappresenta un numero
  // @return: restituisce la rappresentazione (long) di s
  static long fromStringToLong(String s) {
	 return Long.parseLong(s);
  }

  // @param: s non può essere null
  // @return: restituisce true se s è palindroma, false altrimenti
  static boolean èPalindroma(String s) {
	 int len = s.length();
	 if (len <= 1) return true;
	 return s.charAt(s.length() - 1) == s.charAt(0) && èPalindroma(s.substring(1, len - 1));
  }

  // @param: n non è un numero di Lycherel
  // @return: stampa la "sequenza di Lycherel"
  // @modifies: System.out è modificato
  static void printLycherelSequence(long n) {
	 while (!èPalindroma(fromLongToString(n))) {
	 	System.out.println(n);
		n = nextLycherel(n);
	 }
	 System.out.println(n);
  }

  // @param: n >= 0
  // @return: calcola il numero successivo della "sequenza di Lycherel"
  // @modifies:
  static long nextLycherel(long n) {
 
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
