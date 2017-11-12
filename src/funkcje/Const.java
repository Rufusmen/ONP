package funkcje;

import wyjątki.WyjątekONP;

/**
 * Klasa Stałych
 */
abstract public class Const extends Funkcja {

    public Const(double value){
        arn = 0;
        argumenty[0] = value;
    }


    @Override
    public double obliczWartość() throws WyjątekONP {
        return argumenty[0];
    }
}
