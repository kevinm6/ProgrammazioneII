/*
 * File         : ListTesting.java
 * Description  : playing w/ java
 * Author       : Kevin
 * Last Modified: 02 Aug 2022, 17:59
*/

import java.util.List;
import java.util.Iterator;

public class ListTesting {

  public static void PrintList(List<Integer> l) {
   while (l.iterator().hasNext()) {
      System.out.println(l.iterator().next());
   } 
  }

  public static void main (String[] args) {
    List<Integer> lst = List.of(1, 2, 3, 4);

    int sum1 = 0;
    Iterator<Integer> it = lst.iterator();

    while (it.hasNext()) {
      int x = it.next();
      sum1 += x;
    }

    List<Integer> lst2 = List.of(4, 4, 4);
    int sum2 = 0;
    Iterator<Integer> it2 = lst2.iterator();

    while (it2.hasNext()) {
      int x = it2.next();
      sum1 += x;
    }

    System.out.println("finalSum: " + (sum1 + sum2));
    System.out.printf("\n Media somme parziali: %d", (sum1 + sum2) / 2);
    System.out.println("\tLista 1: ");
    ListTesting.PrintList(lst);
  }
}
