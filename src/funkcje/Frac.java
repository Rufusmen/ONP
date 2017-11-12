package funkcje;

import wyjątki.WyjątekONP;

/**
 * Część ułamkowa
 */
public class Frac extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return argumenty[0] - Math.floor(argumenty[0]);
    }
}
