package funkcje;

import wyjatki.WyjatekONP;

/**
 * Cosinus
 */
public class Cos extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.cos(argumenty[0]);
    }
}
