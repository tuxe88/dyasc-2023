package ar.edu.untref.dyasc;

public class Ejecutable {

    public static void main(String[] args) {
        Validator v = new Validator();
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        Fibo f = new Fibo(v, p, pr, s, args);
        f.execute();
    }
}
