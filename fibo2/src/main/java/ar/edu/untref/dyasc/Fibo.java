package ar.edu.untref.dyasc;

import java.util.List;

public class Fibo {

    Validator validator;
    Parser parser;
    Printer printer;
    Sorter sorter;
    String[] input;

    public Fibo(Validator validator, Parser parser, Printer printer, Sorter sorter, String[] args) {
        this.validator = validator;
        this.parser = parser;
        this.printer = printer;
        this.sorter = sorter;
        this.input = args;
    }

    public void execute() {

        //valido el input
        if (!validator.isInputValid(this.input)) {
            System.out.println("Opciones no validas");
            return;
        }

        //con el parser obtengo los parametros necesarios
        int fibo = parser.getFiboNumber(this.input);
        List<String> fiboList = parser.getFiboList(fibo);
        char order = parser.getOrder(this.input);
        char orientation = parser.getOrientation(this.input);

        //con el sorter ordeno la lista dependiendo de lo que me pidan
        sorter.order(order, fiboList);

        //con el printer imprimo
        printer.print(orientation, fibo, fiboList);

    }

}



