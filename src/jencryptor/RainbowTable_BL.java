/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jencryptor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Marcone Melo Mendon�a
 * @version 1.0
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "RainbowTable Basic Layer", destined to make records in some
 * specified text file.
 */
class RainbowTable_BL {

    private final String path = "F:/Usu�rios/CoNe/Documents/ADS_UNIBRATEC/2�Per�odo/SIO/JEncryptor/src/jencryptor/myRainbowTable.txt";

    public void write(String myHashCode) throws IOException {

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter outPath = new FileWriter(file, true);
        try (PrintWriter pw = new PrintWriter(outPath)) {

            pw.println(myHashCode);
            pw.flush();
            pw.close();
        }
    }

    public String read(String myHashCode) throws IOException {

        FileReader file = new FileReader(path);
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();

        while (line != null) {
            if (myHashCode.equals(line)) {
                return br.readLine();
            } else {
                br.readLine(); // jump one row.
                line = br.readLine();
            }
        }

        return null;
    }
}
