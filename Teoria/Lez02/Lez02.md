# Lez02

## JAVA

> **JVM**: Java Virtual Machine
>
> **Bytecode**: codice della macchina
>
> **SRC**: codice sorgente
>
> **JAVAC**: java compiler (compilatore codice sorgente)
>
> **JSHELL**: interprete CLI (shell)
>
> **JDK**: Java Developer Kit
>
> **API**: Application Programming Interface

SRC -> JAVAC -> JVM (bytecode) <-> JAVA


Nuovo paradigma da **JAVA** -> Paradigma **OO** (***Object Oriented***)

Package
: Suddivisione (gerarchia) in Java


| LING. | F.S. |
| --- | --- |
| JAVA.NET   | .../JAVA/NET/... |
| JAVA.LANG. | /ANT/... |
|            | /LANG/STRING |

ClassPath
: Percorso delle classi

Documentazione software Java all’interno del codice sorgente, in modo anche da produrre documentazione più semplicemente

|OBJECTS | VARS |
| --- | --- |
| Stato | Dati |
| Metodi | Funzioni / Procedure |

CLASSE


**TIPO**

> PRIMITIVO (nello STACK, un indirizzo)
>
> char 1
>
> int 2	long 4
>
> double 8	float 4       IEEE754
>
> boolean

```java
int x = 7;
double y = 6.3;
boolean z = true;
```

---

RIFERIMENTO (nello HEAP, un indirizzo)

> `string I = “PIPPO”;`

**ASSEGNAMENTO**

> PRIMITIVO
>
> > int x = 3;
> > int y; (inizializzato di default a 0 per i tipi int)  
> > y = x;

**RIFERIMENTO**
string s = “pippo”;
str t; (inizializzato a null di default per i tipi di riferimento)
t = s; -> nuovo riferimento che va a pippo

### COMPARAZIONE

  **UGUAGLIANZA** `==`
  **PRIMITIVO**

```java
    int x = 3;
    int y = 2;
    x == y -> FALSE
```

  **RIFERIMENTO**

```java
    Matrix m = (…)
    Matrix n = (…)
    m == n ?
```

**Garbage Collection**
: Si occupa Java della gestione della memoria e dell’utilizzo
dello heap e dei suoi elementi


**Stato**
  ***Cambia*** -> Mutabile

  ***Non Cambia*** -> Immutabile

SHARING / MUTABILITÀ

**INVOCAZIONE METODI**
: Viene valutato l’oggetto (se il metodo esiste per l’oggetto) poi gli argomenti

```java
  string s = “PIPPO”
  s.lenght()
  e.deposit(37*2)
```

