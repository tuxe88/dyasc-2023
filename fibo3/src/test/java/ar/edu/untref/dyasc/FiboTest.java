package ar.edu.untref.dyasc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiboTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void ejemploFibo1_1() {
        String[] args = {"5"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<5>: 0 1 1 2 3", outContent.toString());
    }

    @Test
    public void ejemploFibo1_2() {
        String[] args = {"8"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", outContent.toString());
    }

    @Test
    public void ejemploFibo2_1() {
        String[] args = {"-o=vd","5"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<5>:\n" +
                "0\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "3", outContent.toString());
    }

    @Test
    public void ejemploFibo2_2() {
        String[] args = {"-o=hi","8"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<8>: 13 8 5 3 2 1 1 0", outContent.toString());
    }

    @Test
    public void ejemploFibo2_3() {
        String[] args = {"-o=vi","8"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<8>:\n" +
                "13\n" +
                "8\n" +
                "5\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "0", outContent.toString());
    }

    @Test
    public void ejemploFibo2_3_no_valido() {
        String[] args = {"-o=xy","8"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("Opciones no validas.", outContent.toString());
    }

    @Test
    public void ejemploFibo2_4() {
        String[] args = {"8"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", outContent.toString());
    }

    @Test
    public void ejemploFibo3_1() {
        String[] args = {"-o=vd", "-f=salida.txt", "5"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<5> guardado en salida.txt", outContent.toString());
        File file = new File("salida.txt");
        try {
            Assert.assertEquals("fibo<5>:\n" +
                    "0\n" +
                    "1\n" +
                    "1\n" +
                    "2\n" +
                    "3", new String(Files.readAllBytes(file.toPath())));
        } catch (IOException e) {

        }
    }

    @Test
    public void ejemploFibo3_2() {
        String[] args = {"-o=hd", "-m=s", "5"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<5>s: 7", outContent.toString());
    }

    @Test
    public void ejemploFibo3_3() {
        String[] args = {"-o=vd", "-f=salida.txt", "-m=s", "5"};
        Parser p = new Parser(args);
        Printer pr = new Printer();
        Sorter s = new Sorter();
        FileManager fm = new FileManager();
        Fibo f = new Fibo(p, pr, s, fm,args);
        f.execute();

        assertEquals("fibo<5> guardado en salida.txt", outContent.toString());
        File file = new File("salida.txt");
        try {
            Assert.assertEquals("fibo<5>s: \n7", new String(Files.readAllBytes(file.toPath())));
        } catch (IOException e) {

        }
    }

}
