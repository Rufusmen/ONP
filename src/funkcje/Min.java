package funkcje;

import wyjątki.WyjątekONP;

/**
 * Minimum
 */
public class Min extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.min(argumenty[0],argumenty[1]);
    }
}
