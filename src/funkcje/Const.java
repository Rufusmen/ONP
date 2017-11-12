package funkcje;

import wyjatki.WyjatekONP;

/**
 * Klasa Stałych
 */
abstract public class Const extends Funkcja {

    public Const(double value){
        arn = 0;
        argumenty[0] = value;
    }


    @Override
    public double obliczWartosc() throws WyjatekONP {
        return argumenty[0];
    }
}
