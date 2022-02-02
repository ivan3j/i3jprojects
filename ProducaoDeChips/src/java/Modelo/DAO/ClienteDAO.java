/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Entities.Cliente;
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
public class ClienteDAO {
    
  /**  public ArrayList listaClientes(Cliente cliente) {
        ArrayList lista = new ArrayList();
        try{
             ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
             URL url = classLoader.getResource("/Modelo/BD/cliente.properties");
          
            try (FileInputStream in = new FileInputStream(url.getPath())) {
                Properties props = new Properties();
                props.load(in);
                // BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(url.getPath()), "UTF-8"));
                // loop que lê e imprime todas as linhas do arquivo
                //String linha = myBuffer.readLine();
                int size = Integer.parseInt(props.getProperty("cliente.id"));
                int i=0;
                while (i<size) {
                    Cliente c = new Cliente();
                    c.setIdCliente(i);
                    c.setNome(props.getProperty("cliente.nome"+i));
                    c.setDataVenda(props.getProperty("cliente.datavenda"+i));
                    c.setNomeVendedor(props.getProperty("cliente.vendedor"+i));
                    c.setQtdeChips(props.getProperty("cliente.qtdechips"+i));
                    c.setValorVenda(props.getProperty("cliente.valorvenda"+i));

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
     * @param nome}
     * @param logradouro
     * @param cnpj
     * @param cpf
     * @param caminho
     * @throws java.io.FileNotFoundException*/
    
    public void IncluiCliente(String nome, String logradouro, String cnpj, String cpf, URL caminho) throws FileNotFoundException, IOException{
        
    //Cria instancia do objeto Cliente e armazena em uma Lista
    List<Cliente> clientes = new ArrayList();
    
    Cliente c = new Cliente();
    
    c.setIdCliente(1);
    c.setNome(nome);
    c.setLogradouro(logradouro);
    c.setCnpj(cnpj);
    c.setCpf(cpf);
    
    clientes.add(c);
    
    //Grava no BD
     Properties props;
        try (FileInputStream in = new FileInputStream(caminho.getPath())) {
            props = new Properties();
            props.load(in);
            in.close();
        }
    
     
    int idcliente = (Integer.parseInt(props.getProperty("cliente.id"))+1);
    props.setProperty("cliente.id", String.valueOf(idcliente));
    props.setProperty("cliente.nome"+idcliente, c.getNome());
    props.setProperty("cliente.logradouro"+idcliente, c.getLogradouro());
    props.setProperty("cliente.cnpj"+idcliente, c.getCnpj());
    props.setProperty("cliente.cpf"+idcliente, c.getCpf());
    
        try (FileOutputStream out = new FileOutputStream(caminho.getPath())) {
            props.store(out, "---CLIENTES ---");
        }  
        
    }
}
