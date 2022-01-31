/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientecrudrest;

import java.util.ArrayList;
import java.util.Map;
import modelo.Hotel;
import ws.Banda;
import ws.JerseyClient;

/**
 *
 * @author Ivan
 */
public class ClienteCRUDRest {
    
    
    public ArrayList listahoteis(Hotel hotel) {
            
        ArrayList lista = new ArrayList();
        JerseyClient client = new JerseyClient();
            

          Banda b1 = new Banda(); 
          Banda resp = client.getBanda(Banda.class, "2");
           //System.out.println(resp.getNome());
          
          b1.setId(2);
          b1.setNome("Sinal de Alerta");
          b1.setAnoDeFormacao(2000);
          
          lista.add(b1);
        //  client.atualizaBanda(b1,"2");

           client.close();
           return lista;
             }
     
}
