package symbole;

import narzedzia.*;
import wyjatki.ONP_BladZmiennej;
import wyjatki.WyjatekONP;

/**
 * Klaza zmiennej
 */
public class Zmienna extends Operanda {
    public static Lista lista;

    static {
        lista = new Lista();
    }

    private final String key;

    public Zmienna(String key) {
        this.key = key;
        if (lista.find(key) == null) {
            ustaw(null);
        }
    }

    /**
     * Wstawia do listy zmienną i jej wartość
     * @deprecated
     * @param key nazwa zmiennej
     * @param value jej wartość
     */
    public static void ustaw(String key, Double value) {
        lista.add(key, value);
    }

    /**
     * Usuwa zmienną o danej nazwie
     * @param key nazwa zmiennej
     */
    public static void usun(String key) {
        lista.delete(key);
    }

    /**
     * Ustawia wartość zmiennej
     * @param value wartość
     */
    void ustaw(Double value) {
        lista.add(key, value);
    }

    @Override
    public double obliczWartosc() throws WyjatekONP {
        Node<Para<String, Double>> node = lista.find(key);
        if (node.getValue() == null || node.getValue().getValue() == null) {
            throw new ONP_BladZmiennej();
        }
        return node.getValue().getValue();
    }

    /**
     * @return Zwraca listę zmiennych
     */
    public static Lista getLista() {
        return lista;
    }
}
