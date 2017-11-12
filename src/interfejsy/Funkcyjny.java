package interfejsy;

import wyjatki.WyjatekONP;

/**
 * interfejs funkcji
 */
public interface Funkcyjny extends Obliczalny {
    /**
     *
     * @return arność funkcji
     * @throws WyjatekONP
     */
    int arnosc () throws WyjatekONP;

    /**
     *
     * @return ilość brakujących elementów
     */
    int brakujaceArgumenty();

    /**
     * Dodaje argument
     * @param arg dodawany argument
     * @throws WyjatekONP
     */
    void dodajArgument (double arg) throws WyjatekONP;
}
