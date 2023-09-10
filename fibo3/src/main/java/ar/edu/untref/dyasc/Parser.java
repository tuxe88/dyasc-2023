package ar.edu.untref.dyasc;

import java.util.LinkedList;
import java.util.List;

public class Parser {

    private String[] args;
    private int fiboNumber;
    private char orientation;
    private char order;
    private String file;
    private char modo;
    final List<String> fiboList;

    public Parser(String[] args) {

        this.order = 0;
        this.orientation = 0;
        this.file = null;
        this.modo = 0;
        this.fiboNumber = -1;

        this.args = args;
        for (String s : args) {
            if (s.contains("-o=")) {
                this.order = s.charAt(4);
                this.orientation = s.charAt(3);
            }
            if (s.contains("-f=")) {
                this.file = s.substring(3);
            }
            if (s.contains("-m=")) {
                this.modo = s.charAt(3);
            }
            try {
                this.fiboNumber = Integer.parseInt(s);
            } catch (Exception e) {
                //System.out.println(e);
            }
        }

        this.fiboList = new LinkedList<>();
        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= this.fiboNumber; ++i) {
            this.fiboList.add(String.valueOf(primero));
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }

    public boolean isInputValid(){

        if (
                this.fiboNumber == -1 ||
                (this.order != 'i' && this.order != 'd') || (this.orientation != 'v' && this.orientation != 'h') ||
                this.file == null
        ) return false;


        return true;
    }

    public List<String> getFiboList() {
        return fiboList;
    }

    public int getFiboNumber() {
        return this.fiboNumber;
    }

    public char getOrder() {
        return this.order;
    }

    public char getOrientation() {
        return this.orientation;
    }

    public String getFile() {
        return this.file;
    }

    public char modo() {
        return this.modo;
    }
}
