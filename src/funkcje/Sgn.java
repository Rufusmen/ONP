package funkcje;

import wyjątki.WyjątekONP;

/**
 * Znak +/-
 */
public class Sgn extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.signum(argumenty[0]);
    }
}
