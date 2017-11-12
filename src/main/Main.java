package main;

import symbole.Zmienna;

import java.util.Scanner;

/**
 * Główna klasa interaktywnego kalkulatora
 */
public class Main {
    private static String input;
    private static int index;

    /**
     *
     * @return Kolejny podciąg rozpoczęty i zakończony znakiem : ' '
     */
    private static String next(){
        if(index>=input.length())return null;
        int end = input.indexOf(' ',index+1);
        if(end == -1) end = input.length();
        if(end - index == 1)return next();
        String wyn = input.substring(index+1,end);
        index = end;
        return wyn;
    }

    /**
     * Główna pętla programu
     * @param args
     */
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (true){
            input = in.nextLine();
            input = " " + input;
            index = 0;
            assert (input.contains("exit")||input.contains("calc")||input.contains("clear"));
            if(input.contains("exit")){
                break;
            }
            if(input.contains("calc")){
                next();
                Wyrazenie w = new Wyrazenie(input.substring(index));
                System.out.println(w.oblicz());
                continue;
            }
            if(input.contains("clear")){
                String s = next();
                if(s == null) Zmienna.getLista().clear();
                while (s != null){
                    Zmienna.usun(s);
                    s = next();
                }
            }
        }
    }
}
