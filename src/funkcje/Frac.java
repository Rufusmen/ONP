package funkcje;

import wyjatki.WyjatekONP;

/**
 * Część ułamkowa
 */
public class Frac extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return argumenty[0] - Math.floor(argumenty[0]);
    }
}
