package ar.edu.untref.dyasc;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

//la clase sorter acepta ya una lista ordenada por la manera en q se generan los numeros ed la sucesion
public class SorterTest {

    @Test
    public void getDirectOrder(){
        Sorter s= new Sorter();
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");
        list.add("8");
        List<String> expected = new LinkedList<>();
        expected.add("1");
        expected.add("2");
        expected.add("4");
        expected.add("5");
        expected.add("8");
        s.order('d',list);
        assertThat(list).isEqualTo(expected);
    }

    @Test
    public void getInverseOrder(){
        Sorter s= new Sorter();
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");
        list.add("8");
        List<String> expected = new LinkedList<>();
        expected.add("8");
        expected.add("5");
        expected.add("4");
        expected.add("2");
        expected.add("1");
        s.order('i',list);
        assertThat(list).isEqualTo(expected);
    }

}
