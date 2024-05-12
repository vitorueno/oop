public class ListaDuplaInteiros implements Iterable {
	private NoListaDupla head;
	private NoListaDupla tail;

	private int n;

	public NoListaDupla getHead() {
		return head;
	}

	public NoListaDupla getTail() {
		return tail;
	}

	public ListaDuplaInteiros() {
		head = null;
		tail = null;
		n = 0;
	}

	public void inserirInicio(int valor) {
		NoListaDupla novoNo = new NoListaDupla(valor);
		if (head == null) {
			head = novoNo;
			tail = novoNo;
		} else {
			novoNo.setProx(head);
			head.setAnt(novoNo);
			head = novoNo;
		}

		n++;
	}

	public void inserirFim(int valor) {
		NoListaDupla novoNo = new NoListaDupla(valor);

		if (tail == null) {
			head = novoNo;
			tail = novoNo;
		} else {
			novoNo.setAnt(tail);
			tail.setProx(novoNo);
			tail = novoNo;
		}

		n++;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public void clear() {
		NoListaDupla atual = head;

		Iterator listaDuplaIterator = this.iterator();
		while (listaDuplaIterator.hasNext()) {
			NoListaDupla prox = head.getProx();
			atual.setAnt(null);
			atual.setProx(null);
			atual = prox;
		}

		head = null;
		tail = null;

		n = 0;
	}

	public int size() {
		return n;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		Iterator listaDuplaIterator = this.iterator();
		while (listaDuplaIterator.hasNext()) {
			s.append(String.valueOf(listaDuplaIterator.next())).append(" ");
		}
        return s.toString();
	}

	public Iterator iterator() {
		return new ListaDuplaIterator(this);
	}
}
