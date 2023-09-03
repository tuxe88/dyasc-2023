package ar.edu.untref.dyasc;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Fibo {

    Parser parser = new Parser();
    Printer printer = new Printer();
    Sorter sorter = new Sorter();
    String[] input;

    public Fibo(Parser parser, Printer printer, Sorter sorter, String[] args){
        this.parser = parser;
        this.printer = printer;
        this.sorter = sorter;
        this.input = args;
    }

    public void execute(){
        List<String> fiboList = new LinkedList();
        int fibo = 0;
        char order = '0';
        char orientation = '0';

        if(this.input.length==0){
            System.out.println("Opciones no validas");
            return;
        } else if (this.input.length == 1) {
            try{
                fibo = Integer.parseInt(this.input[0]);
            }catch (Exception e){
                System.out.println("Opciones no validas");
                return;
            }
        }else if (this.input.length == 2) {
            String options = this.input[0];
            fibo = Integer.parseInt(this.input[1]);
            order = options.charAt(4);
            orientation = options.charAt(3);
            if(order!='i' && order!='d' || orientation!='v' && orientation!='h'){
                System.out.println("Opciones no validas");
                return;
            }
        }

        fillFiboList(fibo, fiboList);
        order(order, fiboList);
        print(orientation, fibo, fiboList);

    }

    private static void fillFiboList(int fibo, List<String> fiboList) {
        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= fibo; ++i) {

            fiboList.add(String.valueOf(primero));
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

    }

    private static void order(char order, List<String> fiboList) {
        if(order =='d'){
            //por defecto esta ordenada
        }else{
            Collections.reverse(fiboList);
        }
    }

    private static void print(char orientation, int fibo, List<String> fiboList) {
        if(orientation =='h'){
            System.out.print("fibo<"+ fibo +">: ");
            for (int i = 0; i < fiboList.size(); ++i) {
                System.out.print(fiboList.get(i) + " ");
            }
        }else{
            System.out.print("fibo<"+ fibo +">: \n");
            for (int i = 0; i < fiboList.size(); ++i) {
                System.out.println(fiboList.get(i));
            }
        }
    }
}



