/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entities.Cliente;
import Entities.Pedido;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import sun.security.util.Length;

/**
 *
 * @author Ivan
 */
public class Testecadastro {
  
    /**
    public static void main(String[] args) throws IOException {
        
    List<Cliente> clientes = new ArrayList();
    
Properties props = new Properties();  
FileInputStream in = new FileInputStream("C:\\temp\\Trab-OO-100217\\ProducaoDeChips0702\\ProducaoDeChips\\src\\java\\BD\\teste.properties");  
props.load(in);  
in.close();
    
    for ( int i=0; i<=100; i++ ){
    
    Cliente c = new Cliente();
    
 
  c.setNome("Cliente "+i);
  c.setLogradouro("Endereço "+i);
  clientes.add(c);
     }
   
  for(int i=0;i<200;i++){
   props.setProperty("cliente.id", String.valueOf(i));
   String var = props.getProperty("cliente.id");
   System.out.println(var);
   
   // }
   
  
// Cria objeto de configuracao, com os valores padrao  
//Properties applicationProps = new Properties(defaultProps);   
  
// Carrega as propriedades configuradas na ultima execussao  
//in = new FileInputStream("salvas.properties");  
//props.load(in);  
//in.close();  
  
// Utilizamos as propriedades quando precisarmos  
//String nome = applicationProps.getProperty("nome.usuario");  
//String servidor = applicationProps.getProperty("servidor.ip");  
  
//. . .  
// Modificamos os valores das (ou criamos novas) propriedades  
//applicationProps.setProperty("nome.usuario", "Bruno JavaMan");  
//applicationProps.setProperty("nova.propriedade", "12345");  
  
//. . .  
// Salvamos para uma proxima execussao  
FileOutputStream out = new FileOutputStream("C:\\temp\\Trab-OO-100217\\ProducaoDeChips0702\\ProducaoDeChips\\src\\java\\BD\\cliente.properties");  
props.store(out, "---TESTE ---");  
out.close();  

///PrintWriter lerArq = new PrintWriter("\\d:\\temp\\teste-java2.txt"); 

 
//int tam = clientes.size(); 

//for (int i = 0; i < tam; i++) { 
//if(clientes.get(i).getNome() == "Cliente 8"){
 //   System.out.printf(clientes.get(i).getNome()); 
  //  System.out.printf(clientes.get(i).getLogradouro()); 
//}
//}

//lerArq.close(); 

    }   
*/
static public void main(String args[]) throws IOException {

//ecrita de arquivo UTF8

/**
		OutputStreamWriter bufferOut = new OutputStreamWriter(new FileOutputStream("C:\\temp\\Trab-OO-100217\\ProducaoDeChips0702\\ProducaoDeChips\\src\\java\\BD\\teste.properties"),"UTF-8");
				
		bufferOut.write("acento agudo: áéíóú\n");
		bufferOut.write("acento circunflexo: âêîôû\n");
		bufferOut.write("fim");
		
		bufferOut.close();

// abertura do arquivo UTF8

		BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\temp\\Trab-OO-100217\\ProducaoDeChips0702\\ProducaoDeChips\\src\\java\\BD\\teste.properties"), "UTF-8"));
		
		// loop que lê e imprime todas as linhas do arquivo
		String linha = myBuffer.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = myBuffer.readLine();
		}

		myBuffer.close();
*/

     ArrayList lista = new ArrayList();
        try{
          
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    URL url = classLoader.getResource("/src/java/Modelo.BD/pedido.properties");
    FileInputStream in = new FileInputStream("C:\\temp\\Trab-OO-100217\\ProducaoDeChips1002\\ProducaoDeChips\\src\\java\\Modelo\\BD\\pedido.properties");
    Properties props = new Properties();
    props.load(in);
     //       BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(url.getPath()), "UTF-8"));
		
		// loop que lê e imprime todas as linhas do arquivo
		//String linha = myBuffer.readLine();
                
                int i=1;
                
                for(i=0;i<100;i++){
                    
    props.setProperty("pedido.id", String.valueOf(i));
    props.setProperty("pedido.cliente"+i, "Cliente"+i);
    props.setProperty("pedido.datavenda"+i,"DataVenda"+i);
    props.setProperty("pedido.vendedor"+i, "NomeVendedor"+i);
    props.setProperty("pedido.qtdechips"+i, "QtdeChips"+i);
    props.setProperty("pedido.valorvenda"+i, "ValorVenda"+i);
    
    
                }
                
                 FileOutputStream out = new FileOutputStream("C:\\temp\\Trab-OO-100217\\ProducaoDeChips1002\\ProducaoDeChips\\src\\java\\Modelo\\BD\\pedido.properties");
    
   props.store(out, "--- PEDIDOS ----");  
   out.close(); 
                int size = Integer.parseInt(props.getProperty("pedido.id"));
		while ( i<size) {
                    Pedido p = new Pedido();
                    p.setIdPedido(i);
                    p.setNomeCliente(props.getProperty("pedido.cliente"+i));
                    p.setDataVenda(props.getProperty("pedido.datavenda"+i));
                    p.setNomeVendedor(props.getProperty("pedido.vendedor"+i));
                    p.setQtdeChips(props.getProperty("pedido.qtdechips"+i));
                    p.setValorVenda(props.getProperty("pedido.valorvenda"+i));

                    lista.add(p);
                        //linha = myBuffer.readLine();
                        i++;
                }
                System.out.println(lista);
                System.out.println(url.getPath());
                //myBuffer.close();
                in.close();
        }catch(Exception e){
            e.printStackTrace();
        }

	}

	
}


      
        