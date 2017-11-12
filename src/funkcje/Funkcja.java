package funkcje;

import interfejsy.Funkcyjny;
import symbole.Symbol;
import wyjatki.ONP_ZaDuzoArgumentow;
import wyjatki.ONP_ZlaArnosc;
import wyjatki.WyjatekONP;

/**
 * Abstrakcyjna klasa funcji
 */
abstract public class Funkcja extends Symbol implements Funkcyjny {
    public final static int MAX_Args = 10;
    protected int arn = -1;

    protected int last = 0;
    protected double[] argumenty = new double[MAX_Args];

    @Override
    public int arnosc() throws WyjatekONP {
        if (arn < 0 || arn >= MAX_Args) throw new ONP_ZlaArnosc();
        return arn;
    }

    @Override
    public int brakujaceArgumenty() {
        return arn - last;
    }

    @Override
    public void dodajArgument(double arg) throws WyjatekONP {
        if (last >= arn) {
            throw new ONP_ZaDuzoArgumentow();
        }
        argumenty[last++] = arg;
    }

    protected void sprArnosc() throws WyjatekONP {
        if (last != arn) {
            throw new ONP_ZlaArnosc();
        }
    }
}
