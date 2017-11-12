package funkcje;

import wyjątki.WyjątekONP;

/**
 * Sufit
 */
public class Ceil extends Unary{
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.ceil(argumenty[0]);
    }
}
