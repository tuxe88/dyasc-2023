package ar.edu.untref.dyasc;

import java.util.List;

public class Fibo {

    Parser parser;
    Printer printer;
    Sorter sorter;
    String[] input;

    public Fibo(Parser parser, Printer printer, Sorter sorter, String[] args) {
        this.parser = parser;
        this.printer = printer;
        this.sorter = sorter;
        this.input = args;
    }

    public void execute() {

        //valido el input
        if (!parser.isInputValid()) {
            System.out.println("Opciones no validas");
            return;
        }

        //con el parser obtengo los parametros necesarios
        int fibo = parser.getFiboNumber();
        List<String> fiboList = parser.getFiboList();
        char order = parser.getOrder();
        char orientation = parser.getOrientation();

        //con el sorter ordeno la lista dependiendo de lo que me pidan
        sorter.order(order, fiboList);

        //con el printer imprimo
        printer.print(orientation, fibo, fiboList);

    }

}



