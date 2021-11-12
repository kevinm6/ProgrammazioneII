# Lab03

---

 | **Gestione** | **Dichiarazione** | Quando? | Pro (se ben utilizzate) | contro <br> (abusi) 
 --- | --- | --- | --- | --- | --- | --- 
 ***NON CONTROLLATE*** | **Catch**  | specificazioni | - anomalie "interne" <br> - violazione precondizioni <br> - errori di programmazione | - defensive program => robustezza <br> - separazione flusso esecuzione | - modifiche al flusso di esecuzione <br> - peggiore leggibilità 
 ***CONTROLLATE*** | specify | specificazioni <br>+<br> throws | - recoverable conditions <br> - chiamate esterne | - robustezza <br> - separazione c.f <br> - reminder per il programmatore <br> - maggiore leggibilità | - modifiche al flusso di esecuzione <br> - peggiore leggibilità <br> - rendere più difficile l'uso 

---

[Kaprekar.java](file:///Users/Kevin/Documents/Informatica/2°Anno/1°Semestre/Programmazione%20II/Laboratorio/Lab03/Kaprekar.java)

