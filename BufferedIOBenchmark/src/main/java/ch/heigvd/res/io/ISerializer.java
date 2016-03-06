/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.FileWriter;

/**
 *
 * @author guillaume
 */
public interface ISerializer {
    void serialize(MyExperimentData data, FileWriter fw);
}
