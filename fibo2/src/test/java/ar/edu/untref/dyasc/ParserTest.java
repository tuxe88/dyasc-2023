package ar.edu.untref.dyasc;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ParserTest {

    @Test
    public void getFiboNumber(){
        Parser p = new Parser();
        String[] args = {"-o=vd","2"};
        assertThat(p.getFiboNumber(args)).isEqualTo(2);
    }

    @Test
    public void getOrientation(){
        Parser p = new Parser();
        String[] args = {"-o=vd","2"};
        assertThat(p.getOrientation(args)).isEqualTo('v');
    }

    @Test
    public void getOrder(){
        Parser p = new Parser();
        String[] args = {"-o=vd","2"};
        assertThat(p.getOrder(args)).isEqualTo('d');
    }

}
