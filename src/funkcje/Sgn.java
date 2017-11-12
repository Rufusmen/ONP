package funkcje;

import wyjatki.WyjatekONP;

/**
 * Znak +/-
 */
public class Sgn extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.signum(argumenty[0]);
    }
}
