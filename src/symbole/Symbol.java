package symbole;

import funkcje.*;
import interfejsy.Obliczalny;

/**
 * Klasa symboli
 */
abstract public class Symbol implements Obliczalny {

    /**
     * Sprawdza znaczenie wyrażenia
     * @param s sprawdzane wyrażenie
     * @return typ wyrażenia
     */
    static public Symbol getType(String s){
        if(s.equals("+"))
            return new Add();
        if(s.equals("-"))
            return new Sub();
        if(s.equals("*"))
            return new Mult();
        if(s.equals("/"))
            return new Div();

        try{
            double num = Double.parseDouble(s);
            return new Liczba(num);
        } catch (NumberFormatException e) {
        }

        if(s.equals("="))
            return new Przypisanie();
        if(s.equals("Pi"))
            return new Pi();
        if(s.equals("E"))
            return new E();
        if(s.equals("Abs"))
            return new Abs();
        if(s.equals("Acot"))
            return new Acot();
        if(s.equals("Atan"))
            return new Atan();
        if(s.equals("Ceil"))
            return new Ceil();
        if(s.equals("Cos"))
            return new Cos();
        if(s.equals("Exp"))
            return new Exp();
        if(s.equals("Floor"))
            return new Floor();
        if(s.equals("Frac"))
            return new Frac();
        if(s.equals("Ln"))
            return new Ln();
        if(s.equals("Log"))
            return new Log();
        if(s.equals("Max"))
            return new Max();
        if(s.equals("Min"))
            return new Min();
        if(s.equals("Pow"))
            return new Pow();
        if(s.equals("Sgn"))
            return new Sgn();
        if(s.equals("Sin"))
            return new Sin();
        return new Zmienna(s);
    }
}
