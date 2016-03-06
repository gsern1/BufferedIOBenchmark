/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author guillaume
 */
public class FileRecorder implements IRecorder{
    
    private String fileName;
    private CsvSerializer serializer;
    public FileWriter outputStream;
    
    public FileRecorder(String fileName, CsvSerializer serializer){
        this.fileName = fileName;
        this.serializer = serializer;
    }
    public void init() {
        try {
            outputStream = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try{
            outputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void record(MyExperimentData data){
        serializer.serialize(data, outputStream);
    }

}
