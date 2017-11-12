package funkcje;

import wyjatki.WyjatekONP;

/**
 * Do potęgi e
 */
public class Exp extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.exp(argumenty[0]);
    }
}
