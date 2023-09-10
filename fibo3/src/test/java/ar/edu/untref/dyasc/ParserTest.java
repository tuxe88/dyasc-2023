package ar.edu.untref.dyasc;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ParserTest {

    @Test
    public void getFiboNumber(){
        String[] args = {"-o=vd","2"};
        Parser p = new Parser(args);
        assertThat(p.getFiboNumber()).isEqualTo(2);
    }

    @Test
    public void getOrientation(){
        String[] args = {"-o=vd","2"};
        Parser p = new Parser(args);
        assertThat(p.getOrientation()).isEqualTo('v');
    }

    @Test
    public void getOrder(){
        String[] args = {"-o=vd","2"};
        Parser p = new Parser(args);
        assertThat(p.getOrder()).isEqualTo('d');
    }

}
