/**
 *	OVERVIEW: Le istanze di questa classe rappresentano code di interi.
 *						Una coda tipica è [x_1, x_2, ..., x_k] dove x_1 è il primo 
 *						elemento inserito nella coda e x_k è l'ultimo
 *						Dato che è una struttura dati con accesso FIFO,
 *						dopo un'operazione di enqueue, la coda sarà [x_1, ..., x_k + 1] 
 *						mentre
 *						dopo un operazione di dequeue, la coda sarà [x_2, ..., x_k].
 *
 * */


public class IntQueue {
	// Attributi
	// Array di interi che conterrà gli elementi della coda
	int[] elems;
	// Gli indici di testa e di coda.
	// head è l'indice del primo elemento
	// tail è l'indice della prima posizione nella quale effettuare un inserimento
	int head, tail;

	/**
	 * Funzione di astrazione:
	 *	AF(elems, head, tail) = [elems[head], elems[head+1], ..., elems[(tail % elems.lenght)-1] se head ≥ 0, altrimenti [] se head == -1]
	 * 
	 * */

	// Costruttori

	// Metodi

}
