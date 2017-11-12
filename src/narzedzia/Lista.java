package narzedzia;

/**
 * Lista
 */
public class Lista extends ListaDwukierunkowa<Para<String, Double>> {
    public Lista() {
        super();
    }


    public Node<Para<String, Double>> find(String key) {
        Node<Para<String, Double>> x = head.getRight();
        while (x.getValue() != null) {
            if (x.getValue().getKey().equals(key)) {
                return x;
            }
            x = x.getRight();
        }
        return null;
    }

    /**
     * Dodaje Parę(klucz,wartość) do listy lub jeśli dany klucz istnieje zamienia jego wartość
     *
     * @param key klucz
     * @param value wartość
     */
    public void add(String key, Double value) {
        Node<Para<String, Double>> x = find(key);
        if (x == null) {
            new Node(new Para(key, value)).attachToFrontOf(tail);
        } else x.getValue().setValue(value);
    }

    /**
     * Usuwa węzeł o danym kluczu
     * @param key klucz węzła do usunięcia
     */
    public void delete(String key) {
        Node<Para<String, Double>> x = find(key);
        if (x != null) {
            x.delete();
        }
    }
}
