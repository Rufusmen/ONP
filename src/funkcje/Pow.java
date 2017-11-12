package funkcje;

import wyjątki.WyjątekONP;

/**
 * Potęga
 */
public class Pow extends Binary {

    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.pow(argumenty[1],argumenty[0]);
    }
}
