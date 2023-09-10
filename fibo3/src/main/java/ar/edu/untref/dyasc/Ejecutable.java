package ar.edu.untref.dyasc;

public class Ejecutable {

    public static void main(String[] args) {
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        Fibo f = new Fibo(p, pr, s, args);
        f.execute();
    }
}
