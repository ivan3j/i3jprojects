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
public enum StatusPedido {
    aguardandoPgto, pgtoEfetuado, ordemGerada,ordemConcluida,cancelado, aguardandoEnvio;

    public static StatusPedido getAguardandoPgto() {
        return aguardandoPgto;
    }

    public static StatusPedido getPgtoEfetuado() {
        return pgtoEfetuado;
    }

    public static StatusPedido getOrdemGerada() {
        return ordemGerada;
    }

    public static StatusPedido getOrdemConcluida() {
        return ordemConcluida;
    }

    public static StatusPedido getCancelado() {
        return cancelado;
    }

    public static StatusPedido getAguardandoEnvio() {
        return aguardandoEnvio;
    }
    
    
}
