package Modelo.DAO;

import Entities.OrdemFabricacao;
import Entities.StatusOrdemFabricacao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I9482086
 */
public class OrdemDAO {
    
    public void IncluiOrdem ( String numpedido, URL caminho) throws FileNotFoundException, IOException {
        
        
        Calendar calendar = new GregorianCalendar();
	Date date = new Date();
	calendar.setTime(date);
    
   List<OrdemFabricacao> ordens = new ArrayList();
    
    OrdemFabricacao o = new OrdemFabricacao();
    
    
    o.setIdOrdemFabricacao(1);
    o.setNumPedido(numpedido);
    o.setDataStatus(calendar.getTime());
    o.setStatusOrdemFabricacao(StatusOrdemFabricacao.getGerada());
    ordens.add(o);
   
    Properties props;
        try ( //salva no BD properties
                FileInputStream in = new FileInputStream(caminho.getPath())) {
            props = new Properties();
            props.load(in);
        }
   
   int idordem = (Integer.parseInt(props.getProperty("ordem.id"))+1);
           
    props.setProperty("ordem.id", String.valueOf(idordem));
    props.setProperty("ordem.numpedido"+idordem, o.getNumPedido());
    props.setProperty("ordem.datastatus"+idordem, String.valueOf(o.getDataStatus()));
    props.setProperty("ordem.status"+idordem, String.valueOf(o.getStatusOrdemFabricacao()));
   
        try (FileOutputStream out = new FileOutputStream(caminho.getPath())) {
            props.store(out,"---ORDENS ----");
            out.close();
        }  
        
    }
            
        public void AlteraStatusOrdem(int id, String newstatus, URL caminho) throws FileNotFoundException, IOException{
        
        Calendar calendar = new GregorianCalendar();
	Date date = new Date();
	calendar.setTime(date);   
        List<OrdemFabricacao> ordens = new ArrayList();
    
        OrdemFabricacao o = new OrdemFabricacao();
    
    
       o.setDataStatus(calendar.getTime());
        
        if(newstatus == "iniciar" ) { 
            o.setStatusOrdemFabricacao(StatusOrdemFabricacao.getIniciada());
        } else if (newstatus == "concluir") {
            o.setStatusOrdemFabricacao(StatusOrdemFabricacao.getConcluida());
        }
        o.setDataStatus(calendar.getTime());
        ordens.add(o);
        Properties props;
        try ( //salva no BD properties
            FileInputStream in = new FileInputStream(caminho.getPath())) {
            props = new Properties();
            props.load(in);
            in.close();
        }
        
          
            //Salva no BD
            props.setProperty("ordem.datastatus"+id, String.valueOf(o.getDataStatus()));
            props.setProperty("ordem.status"+id, String.valueOf(o.getStatusOrdemFabricacao()));

             try (FileOutputStream out = new FileOutputStream(caminho.getPath())) {
                 props.store(out,"---ORDENS ----");
                 out.close();
        }  
            
        }
}
