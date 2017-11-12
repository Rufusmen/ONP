package funkcje;

import wyjątki.WyjątekONP;

/**
 * Do potęgi e
 */
public class Exp extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.exp(argumenty[0]);
    }
}
