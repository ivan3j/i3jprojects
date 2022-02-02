/*
 * To change this license header, choose License Headers in Project ManipulaDados.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
/**
 *
 * @author I9482086
 */
public class ManipulaDados {
   
    public ManipulaDados(){  
    
        
}
    public FileInputStream getLoad(String fileName) throws FileNotFoundException, IOException{
        
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    URL url = classLoader.getResource(fileName);
        try (FileInputStream in = new FileInputStream(url.getPath())) {
           // Properties props = new Properties();
           // props.load(in);
           return in;
       }
              
    }
}
