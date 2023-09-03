package ar.edu.untref.dyasc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ejecutable {

    public static void main(String[] args) {
        int fibo = Integer.parseInt(args[0]);

        System.out.println(args[1]);

        String options = System.getProperty("-o");
        if(options == null || options.length()<2){
            System.out.println("Opciones no validas.");
            return;
        }
        char orientation = options.charAt(0);
        char direction = options.charAt(1);

        List<Integer> result = new LinkedList();
        System.out.print("fibo<"+fibo+">: ");

        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= fibo; ++i) {
            //System.out.print(primero + " ");
            result.add(primero);
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        Printer printer = new Printer();
        Sorter sorter = new Sorter();
        sorter.sort(result,direction);
        printer.print(result,orientation);
    }
}
