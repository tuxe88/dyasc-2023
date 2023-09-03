package ar.edu.untref.dyasc;

import java.util.List;

public class Printer {

    public void print(List<Integer> list,char orientation){
        if(orientation=='v'){
            for (int i: list){
                System.out.println(i);
            }
        }if(orientation=='h'){
            for (int i: list){
                System.out.print(i+" ");
            }
        }
    }

}
