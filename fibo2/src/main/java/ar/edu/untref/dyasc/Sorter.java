package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public List<Integer> sort(List<Integer> list, char direccion){

        if(direccion=='i'){
            List<Integer> copy = new ArrayList<>(list);
            copy.sort(Collections.reverseOrder());
            return copy;
        }

        return  list;
    }

}
