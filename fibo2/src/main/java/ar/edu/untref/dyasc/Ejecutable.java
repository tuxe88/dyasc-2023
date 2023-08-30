package ar.edu.untref.dyasc;

import java.util.LinkedList;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        int fibo = Integer.parseInt(args[0]);
        System.out.print("fibo<"+fibo+">: ");

        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= fibo; ++i) {
            System.out.print(primero + " ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

    }



}
