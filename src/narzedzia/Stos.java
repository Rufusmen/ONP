package narzedzia;

import wyjatki.ONP_PustyStos;

/**
 * Stos
 * @param <T> typ który trzyma stos
 */
public class Stos<T> extends ListaDwukierunkowa<T> {
    public Stos() {
        super();
    }

    /**
     * Dodaje element na stos
     * @param x vartość jaka ma być dodana
     */
    public void pushBack(T x) {
        Node node = new Node(x);
        node.attachToFrontOf(tail);
    }

    /**
     *
     * @return Zwraca wartość z czubka stosu
     * @throws ONP_PustyStos kiedy pusty
     */
    public T getBack() throws ONP_PustyStos {
        if (empty()) {
            throw new ONP_PustyStos();
        }

        return (T) tail.getLeft().getValue();
    }

    /**
     * Usuwa element z czubka stosu
     * @throws ONP_PustyStos pusty
     */
    public void popBack() throws ONP_PustyStos{
        if(empty()){
            throw new ONP_PustyStos();
        }

        tail.getLeft().delete();
    }

}
