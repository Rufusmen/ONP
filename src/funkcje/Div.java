package funkcje;

import wyjątki.ONP_DzieleniePrzez0;
import wyjątki.WyjątekONP;

/**
 * Dzielenie
 */
public class Div extends Binary {
    @Override
    public double obliczWartość() throws WyjątekONP {
        sprArnosc();
        if(argumenty[0] == 0.0) throw new ONP_DzieleniePrzez0();
        return argumenty[1]/argumenty[0];
    }
}
