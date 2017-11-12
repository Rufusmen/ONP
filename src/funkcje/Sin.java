package funkcje;

import wyjątki.WyjątekONP;

/**
 * Sinus
 */
public class Sin extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.sin(argumenty[0]);
    }
}
