package ar.edu.untref.dyasc;

import java.util.List;

public class Printer {

    public void print(char orientation, int fibo, List<String> fiboList) {
        if (orientation == 'h') {
            System.out.print("fibo<" + fibo + ">: ");
            for (int i = 0; i < fiboList.size(); ++i) {
                System.out.print(fiboList.get(i) + " ");
            }
        } else {
            System.out.print("fibo<" + fibo + ">: \n");
            for (int i = 0; i < fiboList.size(); ++i) {
                System.out.println(fiboList.get(i));
            }
        }
    }

}
