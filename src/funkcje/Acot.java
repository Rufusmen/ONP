package funkcje;

import wyjątki.WyjątekONP;

/**
 * Arkuscotangens
 */
public class Acot extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.atan(1/argumenty[0]);
    }
}
