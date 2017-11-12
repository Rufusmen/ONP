package funkcje;

import wyjatki.WyjatekONP;

/**
 * Potęga
 */
public class Pow extends Binary {

    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return Math.pow(argumenty[1],argumenty[0]);
    }
}
