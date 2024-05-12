public class ExercicioIterator {

	public static void main(String[] args) {
		ListaDuplaInteiros lista = new ListaDuplaInteiros();
		lista.inserirFim(1);
		lista.inserirFim(2);
		lista.inserirFim(3);

		System.out.println("Teste: " + lista);

		System.out.println("Iterando: ");

		Iterator iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
