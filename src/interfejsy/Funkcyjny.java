package interfejsy;

import wyjątki.WyjątekONP;

/**
 * interfejs funkcji
 */
public interface Funkcyjny extends Obliczalny {
    /**
     *
     * @return arność funkcji
     * @throws WyjątekONP
     */
    int arnosc () throws WyjątekONP;

    /**
     *
     * @return ilość brakujących elementów
     */
    int brakująceArgumenty ();

    /**
     * Dodaje argument
     * @param arg dodawany argument
     * @throws WyjątekONP
     */
    void dodajArgument (double arg) throws WyjątekONP;
}
