package funkcje;

import wyjątki.ONP_DzieleniePrzez0;
import wyjątki.WyjątekONP;

/**
 * Logarytm
 */
public class Log extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        if(Math.log(argumenty[1]) == 0.0)throw new ONP_DzieleniePrzez0();
        return Math.log(argumenty[0])/Math.log(argumenty[1]);
    }
}
