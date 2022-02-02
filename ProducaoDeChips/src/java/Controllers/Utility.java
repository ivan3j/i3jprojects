/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author I9482086
 */
public class Utility {
    Properties properties=null;
    public void load() throws IOException{
        properties.load(getClass().getResourceAsStream("teste.properties"));
    }
    public Object get(String key) throws IOException{
        if (properties==null){
            load();
        }
        return properties.get(key); 
    }
}
