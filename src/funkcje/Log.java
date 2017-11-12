package funkcje;

import wyjatki.ONP_DzieleniePrzez0;
import wyjatki.WyjatekONP;

/**
 * Logarytm
 */
public class Log extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        if(Math.log(argumenty[1]) == 0.0)throw new ONP_DzieleniePrzez0();
        return Math.log(argumenty[0])/Math.log(argumenty[1]);
    }
}
