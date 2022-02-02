/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Entities.Pedido;
import Entities.StatusPedido;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author I9482086
 */
public class PedidoDAO {
 
   
    public ArrayList listaPedidos(Pedido pedido) {
        ArrayList lista = new ArrayList();
        try{
             ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
             URL url = classLoader.getResource("/Modelo/BD/pedido.properties");
          
            try (FileInputStream in = new FileInputStream(url.getPath())) {
                Properties props = new Properties();
                props.load(in);
                // BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(url.getPath()), "UTF-8"));
                // loop que lê e imprime todas as linhas do arquivo
                //String linha = myBuffer.readLine();
                int size = Integer.parseInt(props.getProperty("pedido.id"));
                int i=0;
                while (i<size) {
                    Pedido p = new Pedido();
                    p.setIdPedido(i);
                    p.setNomeCliente(props.getProperty("pedido.cliente"+i));
                    p.setDataVenda(props.getProperty("pedido.datavenda"+i));
                    p.setNomeVendedor(props.getProperty("pedido.vendedor"+i));
                    p.setQtdeChips(props.getProperty("pedido.qtdechips"+i));
                    p.setValorVenda(props.getProperty("pedido.valorvenda"+i));
                    //p.setStatus(StatusPedido.pgtoEfetuado);

                    lista.add(p);
                    //     linha = myBuffer.readLine();
                    i++;
                }
                // myBuffer.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public void IncluiPedido(String cliente, String datavenda, String vendedor, String qtdechips, String valorvenda, URL caminho) throws FileNotFoundException, IOException{
        
    List<Pedido> pedidos = new ArrayList();
    
    Pedido p = new Pedido();
    
    p.setIdPedido(1);
    p.setNomeCliente(cliente);
    p.setDataVenda(datavenda);
    p.setNomeVendedor(vendedor);
    p.setQtdeChips(qtdechips);
    p.setValorVenda(valorvenda);
    p.setStatus(StatusPedido.pgtoEfetuado);
    pedidos.add(p);
    
       
    Properties props;
        try (FileInputStream in = new FileInputStream(caminho.getPath())) {
            props = new Properties();
            props.load(in);
            in.close();
        }
    
   int idpedido=1;
   idpedido = (Integer.parseInt(props.getProperty("pedido.id"))+1);
    
    props.setProperty("pedido.id", String.valueOf(idpedido));
    props.setProperty("pedido.cliente"+idpedido, p.getNomeCliente());
    props.setProperty("pedido.datavenda"+idpedido, p.getDataVenda());
    props.setProperty("pedido.vendedor"+idpedido, p.getNomeVendedor());
    props.setProperty("pedido.qtdechips"+idpedido, p.getQtdeChips());
    props.setProperty("pedido.valorvenda"+idpedido, p.getValorVenda());
    props.setProperty("pedido.status"+idpedido, String.valueOf(p.getStatus()));
    
        try (FileOutputStream out = new FileOutputStream(caminho.getPath())) {
            props.store(out, "--- PEDIDOS ----");
        }  
    
        
    }

}


