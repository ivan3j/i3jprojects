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
public enum StatusOrdemFabricacao {
    
    Gerada, Autorizada, Programada, Iniciada, Concluida, Cancelada;

    public static StatusOrdemFabricacao getGerada() {
        return Gerada;
    }

    public static StatusOrdemFabricacao getAutorizada() {
        return Autorizada;
    }

    public static StatusOrdemFabricacao getProgramada() {
        return Programada;
    }

    public static StatusOrdemFabricacao getIniciada() {
        return Iniciada;
    }

    public static StatusOrdemFabricacao getConcluida() {
        return Concluida;
    }

    public static StatusOrdemFabricacao getCancelada() {
        return Cancelada;
    }
    
    
}
