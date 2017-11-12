package funkcje;

import wyjatki.WyjatekONP;

/**
 * Arkustangens
 */
public class Atan extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.atan(argumenty[0]);
    }
}
