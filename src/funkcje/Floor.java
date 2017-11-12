package funkcje;

import wyjątki.WyjątekONP;

/**
 * Podłoga ( część całkowita)
 */
public class Floor extends Unary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return Math.floor(argumenty[0]);
    }
}
