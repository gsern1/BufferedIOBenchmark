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
public class CsvSerializer implements ISerializer{
    
    private static boolean initialized = false;
    //(String operation, String strategy, int blockSize, int fileSizeInBytes, int durationInMs )
    public void serialize(MyExperimentData data, FileWriter fw){
        //Initialisation du fichier si nécessaire
        if(!initialized){
            String csvHeader = "";
            for(String key : data.values.keySet()){
                csvHeader += key;
                csvHeader += ",";
            }
            csvHeader = csvHeader.substring(0,csvHeader.length()-1); //Retirer la dernière vigule
            csvHeader+= "\n";
            try{
                fw.write(csvHeader);
            }catch(IOException e){
                e.printStackTrace();
            }
            initialized = true;
                            
        }
        //Sérialisation des données
        String csvData =    data.values.get("operation").toString() + "," +
                            data.values.get("strategy").toString() + "," +
                            data.values.get("blockSize").toString() + "," +
                            data.values.get("fileSizeInBytes").toString() + "," +
                            data.values.get("durationInMs").toString() + "\n";
        try{
            fw.write(csvData);
         }catch(IOException e){
                e.printStackTrace();
         }
        
    }

    
}
