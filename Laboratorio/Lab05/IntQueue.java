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

import java.util.*;
import java.StringBuilder;


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
	 *	RI(elems, head, tail) = -1 ≤ head < elems.lenght,
	 *													0 ≤ tail < elems.lenght,
	 *													head = - 1 tail = 0
	 *													elems not null,
	 *													la coda non contiene mai più elementi della sua dimensione
	 *
	 * */

	// Costruttori
	/**
	 * Pre-condizioni: size > 0
	 * Post-condition: costruisce una istanza che rappresenta una coda vuota di dimensione size
	 *	
	 *
	 * */
	public IntQueue(int size) {
		elems = new int[size];
		head = -1;
		tail = 0;


	}

	
	// Metodi
	
	/**
	 *	Post-condizioni:	aggiunge un elemento a this se la coda non è piena.
	 *									this_pos = this + [n], altrimenti solleva un eccezione di tipo FullQueueException
	 *	Effetti collaterali:	modifica this nel caso in cui la coda non è piena
	 * */
	public void enqueue(int n) {
		if (!isFull()) throw new FullQueueException("Impossibile inserire elemento. Coda piena");
		
			elems[tail] = n;
			tail = (tail + 1) % elems.length;

	}


	/**
	 *	Post-condizioni: restituisce l'elemento in testa alla coda nel caso in cui la coda ne contenga almeno uno, altrimenti solleva un eccezione di tipo EmptyQueueException
	 *	Effetti collaterali: modifica this nel caso in cui la coda non è vuota
	 * */
	public int dequeue() {
		if (!isEmpty()) throw new EmptyQueueException("Impossibile estrarre elemento. Coda vuota");

		int r = elems[head];
		head = (head + 1) % elems.length;
		if (head == tail) {
			head = -1;
			tail = 0;
		}
		assert repOK();

		return r;
	}


	/**
	 *	Post-condizioni: Resistuisce true se la coda non contiene elementi, false altrimenti
	 * */
	public boolean isEmpty() {
		return head == -1;
	}


	/**
	 *	Post-condizioni: Resistuisce true se la coda è piena, false altrimenti
	 * */
	public isFull() {
		return head == tail;
	}


	/**
	 *	Post-condizioni:  Resistuisce il numero di elementi presenti nella coda
	 *	*/
	public int size() {
		if (isEmpty()) return 0;
		if (isFull()) return elems.length;
		return (elems.length + tail - head) % elems.length;
	}

	private boolean repOK() {
		return head >= -1 <= && head < elems.length &&
									tail >= 0 && tail < elems.length &&
									head = -1 -> tail = 0
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");

		if (!isEmpty())
			int i;
			for (i = 0; i < size() - 1; i++)
				sb.append(elems[head + 1 % elems.length]).append(',');
			sb.append(elems[(head + 1) % elems.length]);
		sb.append(']');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof IntQueue) {
			 IntQueue other = (IntQueue)o;
			 if (this.size() != other.size()) return false;

			 for (int i = 0, j = 0; i < size(); i++, j++)
				 if ( this.elems[(this.head + i) % this.elems.length] != other.elems[(other.head + j) % other.elems.length] )
					 return false;
			 return true;
		}
		 return false;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.hashCode();
		
	}


}
