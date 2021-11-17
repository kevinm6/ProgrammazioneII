# Lez11.md

---

ASTRAZIONE  
 -> ITERAZIONE

| IO | ALTRO |
| :---: | :---: |
| class | [  ] <br> <- riferimento |

---

GENERATORE (Liskov) > ***INTERFACE***

Iterator (**API**)

> `boolean hasNext()`  
> `hasNext()`


```java
package it.unimi.di.prog2.t12;
import java.util.List;
import java.util.Iterator;

  public class it {

    public static void main (String[] args) {
      List<Integer> list = List.of(1, 5, 6, 3, 7);

      int somma = 0;
  
      Iterator<Integer> gen = list.iterator();
      int n = 3;
      while (gen.hasNext() && --n > 0) {
        Integer i = gen=next();

        somma += i;
      }

      list.add(4);

      while (gen.hasNext()) {
        Integer i = gen=next();

        somma += i;
      }

      somma = 0;

      for (Integer i : list)
        somma += i;

      System.out.println(list);
    }
  }

  @Override
  public IntSet clone() {
    return new IntSet(this);
  }

  Iterator<Integer> elements() {
    return new Generator(els);
  }
```

---

**GENERATORI**

  1. **deriverò** "BAG" elementi  
  2. **impliciti**  
    - primi  
    - range  
  3. **derivati**
    - filtri (prod, iter) -> iter

---

### IMPLEMENTAZIONE

```java
  class IntSet {
  private List<Integer> elems;

    Iterator<Integer> elementi() {
      return g; g = new Generator(...)...
    }
  }

```

---

#### CLASSI INTERNE | LOCALE ANONIMA

```java
class Outer {

 static class Inner {
  }

}

x = new Outer();
y = new Outer.Inner();

```
