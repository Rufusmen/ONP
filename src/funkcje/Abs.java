package funkcje;

import wyjątki.WyjątekONP;

/**
 * Wartość bezwzględna
 */
public class Abs extends Unary {

    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.abs(argumenty[0]);
    }
}
