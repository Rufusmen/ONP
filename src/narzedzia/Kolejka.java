package narzedzia;

import wyjatki.ONP_PustaKolejka;

/**
 * Kolejka
 * @param <T> typ który trzyma kolejka
 */
public class Kolejka<T> extends ListaDwukierunkowa<T> {
    public Kolejka(){super();}

    /**
     *
     * @return wartość z początku kolejki
     * @throws ONP_PustaKolejka kiedy pusta
     */
    public T getFront() throws ONP_PustaKolejka{
        if(empty()){
            throw new ONP_PustaKolejka();
        }

        return (T)head.getRight().getValue();
    }

    /**
     * Usuwa wartość początkową
     * @throws ONP_PustaKolejka kiedy pusta
     */
    public void popFront() throws ONP_PustaKolejka{
        if(empty()){
            throw new ONP_PustaKolejka();
        }

        head.getRight().delete();
    }

    /**
     * Dodaje wartość na koniec kolejki
     * @param s dodawana wartość
     */
    public void pushBack(T s){
        Node node = new Node(s);
        node.attachToFrontOf(tail);
    }
}
