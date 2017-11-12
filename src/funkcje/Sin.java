package funkcje;

import wyjatki.WyjatekONP;

/**
 * Sinus
 */
public class Sin extends Unary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.sin(argumenty[0]);
    }
}
