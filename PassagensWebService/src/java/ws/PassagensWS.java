/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

//import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Rotas;


/**
 * REST Web Service
 *
 * @author I000080
 */
@Path("passagens")
public class PassagensWS {

    @Context
    private UriInfo context;
    static private Map<Integer, Rotas> rotasMap;
    
    static {
rotasMap = new HashMap<Integer, Rotas>();

Rotas r = new Rotas();
        r.setCidadeDe("Belo Horizonte");
        r.setCidadePara("Rio de Janeiro");
        r.setDataPartida("13/04/2017");
        r.setDataRetorno("16/04/2017");

rotasMap.put(r.getId(),r);

    /**
     * Creates a new instance of PassagensWS
     */
    }  
    public PassagensWS() {
    }

    /**
     * Retrieves representation of an instance of ws.PassagensWS
     * @return an instance of java.lang.String
     */
//    @GET
//    //@Produces(MediaType.APPLICATION_JSON)
//    @Produces("aplication/text")
//    public String getJson() {
//        //TODO return proper representation object
//        //throw new UnsupportedOperationException();
//        return "Teste de WS";
//    }
    @GET
   // @Produces("aplication/json")
    @Produces("text/plain")
    @Path("rotas/get")
    public List<Rotas> getRotas()
    {
        return new ArrayList<Rotas>(rotasMap.values());

    }
    
    @GET
  //  @Produces("aplication/json")
    @Produces("text/plain")
    @Path("rotas/list")
    public String listaRotas()
    {
        List<Rotas> listas = new ArrayList<Rotas>();        
        Rotas r = new Rotas();
        r.setId(0);
        r.setCidadeDe("Belo Horizonte");
        r.setCidadePara("Rio de Janeiro");
        r.setDataPartida("13/04/2017");
        r.setDataRetorno("16/04/2017");
        
        listas.add(r);
        
        Rotas r1 = new Rotas();
        r1.setId(1);
        r1.setCidadeDe("São Paulo");
        r1.setCidadePara("Manaus");
        r1.setDataPartida("14/04/2017");
        r1.setDataRetorno("18/04/2017");
        
        listas.add(r1);
        
        
        //Gson g = new Gson();
       // return g.toJson(listas);
       return r1.getCidadeDe();
    }
    

    /**
     * PUT method for updating or creating an instance of PassagensWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
