package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public void order(char order, List<String> fiboList) {
        if(order =='d'){
            //por defecto esta ordenada
        }else{
            Collections.reverse(fiboList);
        }
    }

}
