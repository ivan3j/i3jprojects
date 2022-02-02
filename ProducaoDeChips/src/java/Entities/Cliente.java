/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Ivan
 */
public class Cliente {
    
    private int idCliente;
    private String nome;
    private String cpf;
    private String cnpj;
    private String logradouro;
    private static Cliente instance = null;

    public void Cliente(){
        
    }

    public int getIdCliente() {
          return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public static Cliente getInstance() {
        if (instance == null){
            instance = new Cliente();
        }
        return instance;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
      
    
    public void CadastrarCliente(){
        
        
    }
}

