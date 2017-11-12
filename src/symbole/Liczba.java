package symbole;

import narzedzia.Lista;
import wyjątki.WyjątekONP;

/**
 * Klasa Liczby przechowuje jej wartość
 */
public class Liczba extends Operanda {
    private final double value;

    public Liczba(double value){
        this.value = value;
    }

    @Override
    public double obliczWartość() throws WyjątekONP {
        return value;
    }

}
