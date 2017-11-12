package interfejsy;

import wyjątki.WyjątekONP;

/**
 * interfejs obliczalny
 */
public interface Obliczalny {
    /**
     *
     * @return obliczona wartość
     * @throws WyjątekONP
     */
    double obliczWartość () throws WyjątekONP;
}
