package ar.edu.untref.dyasc;

import java.util.LinkedList;
import java.util.List;

public class Parser {

    public List<String> getFiboList(int fibo) {
        List<String> fiboList = new LinkedList<>();
        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= fibo; ++i) {

            fiboList.add(String.valueOf(primero));
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        return fiboList;
    }

    public int getFiboNumber(String[] input) {
        return input.length == 1 ? Integer.parseInt(input[0]) :Integer.parseInt( input[1]);
    }

    public char getOrder(String[] input) {
        return input[0].charAt(4);
    }

    public char getOrientation(String[] input) {
        return input[0].charAt(3);
    }
}
