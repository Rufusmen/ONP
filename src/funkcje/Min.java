package funkcje;

import wyjatki.WyjatekONP;

/**
 * Minimum
 */
public class Min extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.min(argumenty[0],argumenty[1]);
    }
}
