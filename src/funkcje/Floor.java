package funkcje;

import wyjatki.WyjatekONP;

/**
 * Podłoga ( część całkowita)
 */
public class Floor extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.floor(argumenty[0]);
    }
}
