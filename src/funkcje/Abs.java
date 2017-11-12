package funkcje;

import wyjatki.WyjatekONP;

/**
 * Wartość bezwzględna
 */
public class Abs extends Unary {

    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.abs(argumenty[0]);
    }
}
