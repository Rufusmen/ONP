package funkcje;

import wyjatki.WyjatekONP;

/**
 * Logarytm naturalny
 */
public class Ln extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.log(argumenty[0]);
    }
}
