package ar.edu.untref.dyasc;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ValidatorTest {

    @Test
    public void argsVacio(){
        Validator v = new Validator();
        String[] empty = new String[0];
        assertThat(v.isInputValid(empty)).isEqualTo(false);
    }

    @Test
    public void argsTamano1NoNumerico(){
        Validator v = new Validator();
        String[] _1 = {"24dsa"};
        assertThat(v.isInputValid(_1)).isEqualTo(false);
    }

    @Test
    public void argsTamano1Numerico(){
        Validator v = new Validator();
        String[] _1 = {"24dsa"};
        assertThat(v.isInputValid(_1)).isEqualTo(false);
    }

    @Test
    public void argsTamano2parametro1SOrderErroneo(){
        Validator v = new Validator();
        String[] _2 = {"-o=vx","2"};
        assertThat(v.isInputValid(_2)).isEqualTo(false);
    }

    @Test
    public void argsTamano2parametro1SOrientationErroneo(){
        Validator v = new Validator();
        String[] _2 = {"-o=xi","2"};
        assertThat(v.isInputValid(_2)).isEqualTo(false);
    }

    @Test
    public void argsTamano2parametro1SOrderOk(){
        Validator v = new Validator();
        String[] _2 = {"-o=vd","2"};
        assertThat(v.isInputValid(_2)).isEqualTo(true);
    }

    @Test
    public void argsTamano2parametro1SOrientationOk(){
        Validator v = new Validator();
        String[] _2 = {"-o=vi","2"};
        assertThat(v.isInputValid(_2)).isEqualTo(true);
    }

    @Test
    public void argsTamano2parametro2SNotNumber(){
        Validator v = new Validator();
        String[] _2 = {"-o=vd","ds"};
        assertThat(v.isInputValid(_2)).isEqualTo(false);
    }

    @Test
    public void argsTamano2parametro2Ok(){
        Validator v = new Validator();
        String[] _2 = {"-o=vd","2"};
        assertThat(v.isInputValid(_2)).isEqualTo(true);
    }

}
