package funkcje;

import wyjatki.WyjatekONP;

/**
 * Arkuscotangens
 */
public class Acot extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.atan(1/argumenty[0]);
    }
}
