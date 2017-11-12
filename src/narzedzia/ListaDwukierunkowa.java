package narzedzia;

public class ListaDwukierunkowa<T> {
    protected Node<T> head, tail;

    public ListaDwukierunkowa(){
        clear();
    }

    /**
     * Czyści listę
     */
    public final void clear() {
        head = new Node<>(null);
        tail = new Node<>(null);
        head.attachToFrontOf(tail);
    }

    /**
     * Sprawcza czy lista jest pusta
     * @return true jeśli pusta
     */
    public boolean empty(){
        return  head.getRight()==tail;
    }
}
