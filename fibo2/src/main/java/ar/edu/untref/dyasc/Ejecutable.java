package ar.edu.untref.dyasc;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ejecutable {

    public static void main(String[] args) {
        Parser p = new Parser();
        Printer pr = new Printer();
        Sorter s = new Sorter();
        Fibo f = new Fibo(p,pr,s,args);
        f.execute();
    }
}
