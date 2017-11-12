package funkcje;

import wyjątki.WyjątekONP;

/**
 * Mnożenie
 */
public class Mult extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return argumenty[0]*argumenty[1];
    }
}
