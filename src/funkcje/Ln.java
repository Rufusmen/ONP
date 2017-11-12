package funkcje;

import wyjątki.WyjątekONP;

/**
 * Logarytm naturalny
 */
public class Ln extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.log(argumenty[0]);
    }
}
