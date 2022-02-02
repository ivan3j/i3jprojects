/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author I9482086
 */
public class Pedido {
    
private int idPedido;
private String alteradoPor;
private String nomeCliente;
private String dataStatus;
private String dataVenda;
private String qtdeChips;
private StatusPedido status;
private String valorVenda;
private String nomeVendedor;

    public Pedido() {
    }

    public int getIdPedido(){
     return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNumPedido(){
    return idPedido;
    }
    
    public String getAlteradoPor() {
        return alteradoPor;
    }

    public void setAlteradoPor(String alteradoPor) {
        this.alteradoPor = alteradoPor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getQtdeChips() {
        return qtdeChips;
    }

    public void setQtdeChips(String qtdeChips) {
        this.qtdeChips = qtdeChips;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

   
    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
   
}
