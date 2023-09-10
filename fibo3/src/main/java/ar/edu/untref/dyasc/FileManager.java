package ar.edu.untref.dyasc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void write(String fileName,String input) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(input);
        writer.close();
    }

}
