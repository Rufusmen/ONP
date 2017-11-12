package funkcje;

import wyjatki.ONP_DzieleniePrzez0;
import wyjatki.WyjatekONP;

/**
 * Dzielenie
 */
public class Div extends Binary {
    @Override
    public double obliczWartosc() throws WyjatekONP {
        sprArnosc();
        if(argumenty[0] == 0.0) throw new ONP_DzieleniePrzez0();
        return argumenty[1]/argumenty[0];
    }
}
