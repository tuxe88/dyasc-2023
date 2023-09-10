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
    private int fiboSum;
    final List<String> fiboList;

    public Parser(String[] args) {

        this.order = 0;
        this.orientation = 0;
        this.file = null;
        this.modo = 0;
        this.fiboNumber = -1;
        this.fiboSum = 0;

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

        if(orientation==0){
            orientation = 'h';
            order = 'd';
        }

        this.fiboList = new LinkedList<>();
        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= this.fiboNumber; ++i) {
            this.fiboList.add(String.valueOf(primero));
            this.fiboSum = this.fiboSum + primero;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

    }

    public boolean isInputValid(){

        if(this.fiboNumber == -1){
            return false;
        }

        if(orientation!=0 && order!=0){
            if ((this.order != 'i' && this.order != 'd') || (this.orientation != 'v' && this.orientation != 'h')) return false;
        }

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

    public char getModo() {
        return this.modo;
    }

    public int getFiboSum(){
        return this.fiboSum;
    }
}
