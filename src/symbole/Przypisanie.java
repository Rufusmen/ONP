package symbole;

import narzedzia.Stos;
import wyjatki.ONP_BladZmiennej;
import wyjatki.WyjatekONP;

/**
 * Klasa przypisania
 */
public class Przypisanie extends Symbol {

    public static void przypisz(Stos<Symbol> stos) throws WyjatekONP {
        Symbol s1 = stos.getBack();
        stos.popBack();
        Symbol s2 = stos.getBack();
        stos.popBack();

        if(s2 instanceof Zmienna){
            ((Zmienna)s2).ustaw(s1.obliczWartosc());
            stos.pushBack(new Liczba(s1.obliczWartosc()));
        }
        else if (s1 instanceof Zmienna){
            ((Zmienna)s1).ustaw(s2.obliczWartosc());
            stos.pushBack(new Liczba(s2.obliczWartosc()));
        }
        else throw new ONP_BladZmiennej();
    }


    @Override
    public double obliczWartosc() throws WyjatekONP {
        throw new UnsupportedOperationException("");
    }
}
