/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.util.LinkedHashMap;

/**
 *
 * @author guillaume
 */
public class MyExperimentData {
    public LinkedHashMap<String,Object> values;
    
    public MyExperimentData(String operation, String strategy, int blockSize, long fileSizeInBytes, long durationInMs ){
        values = new LinkedHashMap<String,Object>();
        values.put("operation", operation);
        values.put("strategy", strategy);
        values.put("blockSize", blockSize);
        values.put("fileSizeInBytes", fileSizeInBytes);
        values.put("durationInMs", durationInMs);
    }
}
