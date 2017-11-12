package funkcje;

import wyjatki.WyjatekONP;

/**
 * Maximum
 */
public class Max extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.max(argumenty[0],argumenty[1]);
    }
}
