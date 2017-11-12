package funkcje;

import wyjątki.WyjątekONP;

/**
 * Cosinus
 */
public class Cos extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.cos(argumenty[0]);
    }
}
