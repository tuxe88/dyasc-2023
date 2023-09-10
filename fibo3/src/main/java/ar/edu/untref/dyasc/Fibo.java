package ar.edu.untref.dyasc;

import java.io.IOException;
import java.util.List;

public class Fibo {

    Parser parser;
    Printer printer;
    Sorter sorter;
    FileManager fileManager;
    String[] input;

    public Fibo(Parser parser, Printer printer, Sorter sorter, FileManager fileManager, String[] args) {
        this.parser = parser;
        this.printer = printer;
        this.sorter = sorter;
        this.fileManager = fileManager;
        this.input = args;
    }

    public void execute() {

        //valido el input
        if (!parser.isInputValid()) {
            System.out.print("Opciones no validas.");
            return;
        }

        //con el parser obtengo los parametros necesarios
        int fibo = parser.getFiboNumber();
        List<String> fiboList = parser.getFiboList();
        char order = parser.getOrder();
        char orientation = parser.getOrientation();
        String fileName = parser.getFile();
        char modo = parser.getModo();
        int fiboSum = parser.getFiboSum();

        //con el sorter ordeno la lista dependiendo de lo que me pidan
        sorter.order(order, fiboList);

        //si se mando un filename, imprimo el archivo
        if(fileName!=null){
            try {
                this.fileManager.write(fileName,printer.getOutput(orientation, fibo, fiboList,modo,fiboSum));
            } catch (IOException e) {
                System.out.println("Ocurrió un error escribiendo el archivo "+ fileName+"\n: "+e.getMessage());
            }
            System.out.print("fibo<" + fibo + "> guardado en "+fileName);
        }else{//si no lo imprimo en cosola
            printer.print(orientation, fibo, fiboList,modo,fiboSum);
        }

    }

}



