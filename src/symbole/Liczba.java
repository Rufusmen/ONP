package symbole;

import wyjatki.WyjatekONP;

/**
 * Klasa Liczby przechowuje jej wartość
 */
public class Liczba extends Operanda {
    private final double value;

    public Liczba(double value){
        this.value = value;
    }

    @Override
    public double obliczWartosc() throws WyjatekONP {
        return value;
    }

}
