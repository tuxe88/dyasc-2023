package ar.edu.untref.dyasc;

import java.util.List;

public class Printer {

    public void print(char orientation, int fibo, List<String> fiboList,char modo,int fiboSum) {

        if(modo=='s'){
            if(orientation=='h'){
                System.out.print("fibo<" + fibo + ">s: "+fiboSum);
            }else {
                System.out.print("fibo<" + fibo + ">s: \n"+fiboSum);
            }

        }else{
            if (orientation == 'h') {
                System.out.print("fibo<" + fibo + ">:");
                for (int i = 0; i < fiboList.size(); ++i) {
                    System.out.print(" "+fiboList.get(i));
                }
            } else {
                System.out.print("fibo<" + fibo + ">:");
                for (int i = 0; i < fiboList.size(); ++i) {
                    System.out.print("\n"+fiboList.get(i));
                }
            }
        }
    }

    public String getOutput(char orientation, int fibo, List<String> fiboList,int modo,int fiboSum) {
        String output = "";

        if(modo=='s'){
            if(orientation=='h'){
                output = output.concat("fibo<" + fibo + ">s: "+fiboSum);
            }else{
                output = output.concat("fibo<" + fibo + ">s: \n"+fiboSum);
            }

        }else {
            if (orientation == 'h') {
                output = output.concat("fibo<" + fibo + ">: ");
                for (int i = 0; i < fiboList.size(); ++i) {
                    output = output.concat(fiboList.get(i) + " ");
                }
            } else {
                output = output.concat("fibo<" + fibo + ">:");
                for (int i = 0; i < fiboList.size(); ++i) {
                    output = output.concat("\n"+fiboList.get(i));
                }
            }
        }

        return output;
    }
}
