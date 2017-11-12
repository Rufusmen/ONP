package funkcje;

import wyjątki.WyjątekONP;

/**
 * Maximum
 */
public class Max extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.max(argumenty[0],argumenty[1]);
    }
}
