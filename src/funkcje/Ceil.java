package funkcje;

import wyjatki.WyjatekONP;

/**
 * Sufit
 */
public class Ceil extends Unary{
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.ceil(argumenty[0]);
    }
}
