/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.netbeans.saas.google.GoogleMapService;
import org.netbeans.saas.RestResponse;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author I000080
 */
@XmlRootElement
public class Rotas {

    private int id;
    private String cidadeDe;
    private String cidadePara;
    private String dataPartida;
    private String dataRetorno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

//Cidade de Saída
    public String getCidadeDe() {
        return cidadeDe;
    }

    public void setCidadeDe(String cidadeDe) {
        this.cidadeDe = cidadeDe;
    }

    //Cidade de Destino


    public String getCidadePara() {
        return cidadePara;
    }

    public void setCidadePara(String cidadePara) {
        this.cidadePara = cidadePara;
    }

    //------------------------------------------------------------//
    //Data de Partida
    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    //Data de Retorno
    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
    //------------------------------------------------------------//
}
