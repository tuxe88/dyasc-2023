package ar.edu.untref.dyasc;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ejecutable {

    public static void main(String[] args) {
        Validator v = new Validator();
        Parser p = new Parser();
        Printer pr = new Printer();
        Sorter s = new Sorter();
        Fibo f = new Fibo(v,p,pr,s,args);
        f.execute();
    }
}
