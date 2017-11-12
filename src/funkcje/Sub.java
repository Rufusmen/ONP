package funkcje;

import wyjatki.WyjatekONP;

/**
 * Odejmowanie
 */
public class Sub extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        return argumenty[1] - argumenty[0];
    }
}
