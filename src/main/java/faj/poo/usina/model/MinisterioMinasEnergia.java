package faj.poo.usina.model;

public class MinisterioMinasEnergia {

	private Ministro ministro;

	private Secretaria secretaria;

	public void analisaUsinas() {

	}

	public MinisterioMinasEnergia(Ministro ministro, Secretaria secretaria) {
		this.ministro = ministro;
		this.secretaria = secretaria;
	}

	public Ministro getMinistro() {
		return ministro;
	}

	public void setMinistro(Ministro ministro) {
		this.ministro = ministro;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
}
