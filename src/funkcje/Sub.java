package funkcje;

import wyjątki.WyjątekONP;

/**
 * Odejmowanie
 */
public class Sub extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return argumenty[1] - argumenty[0];
    }
}
