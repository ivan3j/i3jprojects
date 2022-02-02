/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author I9482086
 */
public class OrdemFabricacao {
    
    private int idOrdemFabricacao;
    private String numPedido;
    private StatusOrdemFabricacao status;
    private Date dataStatus;
        
    
    public void OrdemFabricacao(){
        
    }

    public int getIdOrdemFabricacao() {
          return idOrdemFabricacao;
    }
    
    

    public void setIdOrdemFabricacao(int idOrdemFabricacao) {
        this.idOrdemFabricacao = idOrdemFabricacao;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public StatusOrdemFabricacao getStatusOrdemFabricacao() {
        return status;
    }

    public void setStatusOrdemFabricacao(StatusOrdemFabricacao status) {
        this.status = status;
    }

    public Date getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Date dataStatus) {
        this.dataStatus = dataStatus;
    }

   
  
    
}
