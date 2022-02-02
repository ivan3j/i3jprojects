package modelo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReservaModel {

	private int id;
	private StatusReserva status;
	private String nomeCliente;
	private int cpf;
	private int qtdeAdultos;
	private int qtdeCriancas;
	private int qtdeColo;
	private Date dataIda;
	private Date dataVolta;
	private Boolean hotel=false;
	private Boolean carro=false;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StatusReserva getStatus() {
		return status;
	}
	public void setStatus(StatusReserva status) {
		this.status = status;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getQtdeAdultos() {
		return qtdeAdultos;
	}
	public void setQtdeAdultos(int qtdeAdultos) {
		this.qtdeAdultos = qtdeAdultos;
	}
	public int getQtdeCriancas() {
		return qtdeCriancas;
	}
	public void setQtdeCriancas(int qtdeCriancas) {
		this.qtdeCriancas = qtdeCriancas;
	}
	public int getQtdeColo() {
		return qtdeColo;
	}
	public void setQtdeColo(int qtdeColo) {
		this.qtdeColo = qtdeColo;
	}
	public Date getDataIda() {
		return dataIda;
	}
	public void setDataIda(Date dataIda) {
		this.dataIda = dataIda;
	}
	public Date getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(Date dataVolta) {
		this.dataVolta = dataVolta;
	}
	public Boolean getHotel() {
		return hotel;
	}
	public void setHotel(Boolean hotel) {
		this.hotel = hotel;
	}
	public Boolean getCarro() {
		return carro;
	}
	public void setCarro(Boolean carro) {
		this.carro = carro;
	}
	
	
}
