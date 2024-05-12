public class ListaDuplaIterator implements Iterator {
    private ListaDuplaInteiros listaDuplaInteiros;
    private NoListaDupla atual;
    int index;

    public ListaDuplaIterator(ListaDuplaInteiros listaDuplaInteiros) {
        this.listaDuplaInteiros = listaDuplaInteiros;
        this.atual = listaDuplaInteiros.getHead();
    }

    @Override
    public void first() {
        this.atual = listaDuplaInteiros.getHead();
        index = 0;
    }

    @Override
    public void last() {
        this.atual = listaDuplaInteiros.getTail();
        this.index = listaDuplaInteiros.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index < listaDuplaInteiros.size();
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            Integer info = atual.getInfo();
            atual = atual.getProx();
            index++;
            return info;
        }

        return null;
    }

    @Override
    public int nextIndex() {
        return index + 1;
    }

    @Override
    public Integer previous() {
        if (hasPrevious()) {
            Integer info = atual.getInfo();
            atual = atual.getAnt();
            index--;
            return info;
        }

        return null;
    }

    @Override
    public int previousIndex() {
        return index - 1;
    }
}
