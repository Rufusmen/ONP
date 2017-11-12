package funkcje;

import wyjątki.WyjątekONP;

/**
 * Arkustangens
 */
public class Atan extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.atan(argumenty[0]);
    }
}
