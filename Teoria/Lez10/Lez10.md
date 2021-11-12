# Lez10

| ENTITÀ ASTRATTA | IMPLEMENTAZIONE |
| --- | --- |
| Pre <= | Info (IR) |
| POST | |

---

## INDUZIONE sui DATI

---

### Guida "PROGETTO"

> **MUTABILE** - **IMMUTABILE**
>
> `int età` - `FINAL String name`
`FINAL List<Integer> lista;`

---

#### Categorie "OPERAZIONI"

- CREAZIONE           *costruttori metodi statici*
  - Fabbricazione
- PRODUZIONE          ***(MUTABILE) IMMUTABILE***   *restituiscono non statici (di grado d)*
- MODIFICAZIONE          ***MUTABILE***       *alterate this*
- OSSERVAZIONE                          *accedere a inf. su this*

=> **COMPLETO POPOLAMENTO**

---

##### ADEGUATEZZA

- ABBASTANZA
- NON TROPPE

---

##### Località

> Rappresentazione **NON MODIFICABILE** all'**esterno**


##### MODFICABILITÀ

> Rappresentazione **NON SI LEGGA** dall'**esterno**

---

``` java

  private String.name;
  public final String.name;

  // GETTER
  String name() {
    /*
    . . .
    return name;
    */
  }

  // SETTER
  void name(String name) {
    /*
    . . .
    */
  }

  // --- ---

  List<Integer> elems;

  List<Integer> elementi() {
    return elems;
  }

  Integer[] elems() {
    // Inter[] returnvalue [...]
    // for(i:) return[i]...
    // return .
  }


```

