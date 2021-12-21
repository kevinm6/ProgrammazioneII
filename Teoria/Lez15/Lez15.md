# Lez15.md

---

## Collections Framework Java  

### API Java 

--- 

**Collezioni**  

+ Strumento  
+ Esempio di GERARCHIA "RICCA"  
  + Interfacce (metodo default)  
  + Classi Astratte  
  + Classi  

---

**Collezione elementi T**

  + Aggiungi/Rimuovi  
  + E  
  + Iterare  
  + Riuso del codice  
  + Interfacce / Implementazioni "generali"  
  + Implementazioni parziali  

> BLOCH (autore progettuale di tante collection)  

---

**COLLECTION**  
  **INSIEMI**  
    + no duplicati  
    + no "ordine"  

  **LISTE
    + "indice"  

**MAP**
  + <k, v>  
	
---

##### Esempi


``` java
	public interface Collection<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element);           // Optional
    boolean remove(E element);        // Optional
    Iterator<E> iterator();

    Object[] toArray();
    T[] toArray(T a[]);

    // Bulk Operations
    boolean containsAll(Collection<?> c);           // Optional
    boolean add(Collection<? Extends> c);           // Optional
    boolean add(Collection<?> c);                   // Optional
    boolean add(Collection<?> c);                   // Optional
    void clear();                                   // Optional
  }

  public static boolean removeNulls(Collection<?> c) {
    for (Iterator<?> i = c.iterator(); i.hasNext(); ) {
      if (i.next() == null)
        i.remove();
    }
  }
```

---

**MAP**   
: insieme di coppie  

---

```java
	List<..> l = nome ArrayList<...> ();
	List<..> lro = Collections.unmodifiableList(l);
```

