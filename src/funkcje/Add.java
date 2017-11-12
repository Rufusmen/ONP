package funkcje;

import wyjatki.WyjatekONP;

/**
 * Dodawanie
 */
public class Add extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return argumenty[0] + argumenty[1];
    }
}
