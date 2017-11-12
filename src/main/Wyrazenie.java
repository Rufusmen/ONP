package main;

import funkcje.Funkcja;
import narzedzia.Kolejka;
import narzedzia.Stos;
import symbole.Operanda;
import symbole.Przypisanie;
import symbole.Symbol;
import wyjatki.WyjatekONP;

import java.io.IOException;
import java.util.logging.*;

/**
 * Klasa wyrażenia
 * Każde Wyrażenie zapisuje w logach wraz z obliczoną wartością lub błędem
 */
public class Wyrazenie {
    private Stos<Symbol> stos;
    private Kolejka<Symbol> kolejka;

    private static final Logger logger = Logger.getLogger(Wyrazenie.class.getName());
    //private Lista lista;

    public Wyrazenie(String onp) {
        if(logger.getHandlers().length==0) {
            try {
                Handler handler = new FileHandler("calc.log", true);
                handler.setFormatter(new SimpleFormatter());
                logger.addHandler(handler);
            } catch (IOException e) {
                e.printStackTrace();
            }
            logger.entering(Wyrazenie.class.getName(), "Wyrazenie");
        }
        logger.log(Level.INFO,"Nowe wyrażenie:" + onp);
        stos = new Stos<>();
        kolejka = new Kolejka<>();
        //lista = Zmienna.lista;

        int index = 0;
        onp = " " + onp;
        while (index < onp.length()) {
            int end = onp.indexOf(' ', index+1);
            if (end == -1) end = onp.length();
            if(end - index == 1){
                index = end;
                continue;
            }
            kolejka.pushBack(Symbol.getType(onp.substring(index + 1, end)));
            index = end;
        }
    }

    /**
     * Oblicza wartość wyrażenia
     * @return obliczona wartość lub null w wypadku błędu obliczeń
     */
    public Double oblicz() {
        try {
            while (!kolejka.empty()) {
                Symbol s = kolejka.getFront();
                kolejka.popFront();
                if (s instanceof Przypisanie) {
                    Przypisanie.przypisz(stos);
                } else if (s instanceof Operanda) {
                    stos.pushBack(s);
                } else if (s instanceof Funkcja) {
                    Funkcja f = (Funkcja) s;
                    while (f.brakujaceArgumenty() > 0) {
                        f.dodajArgument(stos.getBack().obliczWartosc());
                        stos.popBack();
                    }
                    stos.pushBack(f);
                }
            }
            Double wyn = new Double(stos.getBack().obliczWartosc());
            logger.log(Level.INFO,"Wynik: " + wyn);
            return wyn;
        } catch (WyjatekONP wyjatekONP) {
            logger.log(Level.WARNING, "Błąd w obliczeniach " + wyjatekONP);
            wyjatekONP.printStackTrace();
        }
        return null;
    }
}
