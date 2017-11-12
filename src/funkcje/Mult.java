package funkcje;

import wyjatki.WyjatekONP;

/**
 * Mnożenie
 */
public class Mult extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return argumenty[0]*argumenty[1];
    }
}
