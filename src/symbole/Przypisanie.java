package symbole;

import narzedzia.Stos;
import wyjątki.ONP_BłądZmiennej;
import wyjątki.WyjątekONP;

/**
 * Klasa przypisania
 */
public class Przypisanie extends Symbol {

    public static void przypisz(Stos<Symbol> stos) throws WyjątekONP{
        Symbol s1 = stos.getBack();
        stos.popBack();
        Symbol s2 = stos.getBack();
        stos.popBack();

        if(s2 instanceof Zmienna){
            ((Zmienna)s2).ustaw(s1.obliczWartość());
            stos.pushBack(new Liczba(s1.obliczWartość()));
        }
        else if (s1 instanceof Zmienna){
            ((Zmienna)s1).ustaw(s2.obliczWartość());
            stos.pushBack(new Liczba(s2.obliczWartość()));
        }
        else throw new ONP_BłądZmiennej();
    }


    @Override
    public double obliczWartość() throws WyjątekONP {
        throw new UnsupportedOperationException("");
    }
}
