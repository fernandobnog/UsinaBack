package faj.poo.usina.model;

import java.util.Date;

public class Ministro extends Pessoa {

	private Date inicioMandato;

	private Date terminoMandato;

	public void alteraStatus() {

	}

	public Ministro(Date inicioMandato, Date terminoMandato) {
		super();
		this.inicioMandato = inicioMandato;
		this.terminoMandato = terminoMandato;
	}

	public Date getInicioMandato() {
		return inicioMandato;
	}

	public void setInicioMandato(Date inicioMandato) {
		this.inicioMandato = inicioMandato;
	}

	public Date getTerminoMandato() {
		return terminoMandato;
	}

	public void setTerminoMandato(Date terminoMandato) {
		this.terminoMandato = terminoMandato;
	}
}
