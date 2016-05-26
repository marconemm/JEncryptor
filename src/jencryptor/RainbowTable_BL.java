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
import java.util.zip.DataFormatException;

/**
 * @author Marcone Melo Mendonça
 * @version 1.1
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "RainbowTable Basic Layer", destined to make records in some
 * specified text file.
 */
class RainbowTable_BL {
    
    private final File myRainbowTableFile;

    public RainbowTable_BL(File myRainbowTableFile) {
        
        this.myRainbowTableFile = myRainbowTableFile;
        
    }

    public void write(String myHashCode) throws IOException {
        
        if (!myRainbowTableFile.exists()) {
            myRainbowTableFile.createNewFile();
        }
        
        FileWriter outPath = new FileWriter(myRainbowTableFile, true);
        try (PrintWriter pw = new PrintWriter(outPath)) {

            pw.println(myHashCode);
            pw.flush();
            pw.close();
        }
    }

    public String read(String myHashCode) throws IOException, DataFormatException {

        //FileReader file = new FileReader(filePath);
        FileReader file = new FileReader(myRainbowTableFile.getPath());
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();

        //if (line.equals("true")) {

            while (line != null) {
                if (myHashCode.equals(line)) {
                    return br.readLine();
                } else {
                    line = br.readLine();
                }
            }
       // } else {
       //     String msg = "O arquivo\n" + myRainbowTableFile.getPath() + "\né invalido.";
        //    throw new DataFormatException(msg);
       // }
        return null;
    }
}
