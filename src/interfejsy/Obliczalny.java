package interfejsy;

import wyjatki.WyjatekONP;

/**
 * interfejs obliczalny
 */
public interface Obliczalny {
    /**
     *
     * @return obliczona wartość
     * @throws WyjatekONP
     */
    double obliczWartosc() throws WyjatekONP;
}
