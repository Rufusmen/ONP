package funkcje;

import wyjątki.WyjątekONP;

/**
 * Dodawanie
 */
public class Add extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        return argumenty[0] + argumenty[1];
    }
}
