package faj.poo.usina.model;

public class InfraEstrutura {

	private int areaOcupada;

	private String localizacao;

	private int capacidadeOperacional;

	private int qtdOperando;

	private int qtdManutencao;

	public InfraEstrutura(int areaOcupada, String localizacao, int capacidadeOperacional, int qtdOperando, int qtdManutencao) {
		this.areaOcupada = areaOcupada;
		this.localizacao = localizacao;
		this.capacidadeOperacional = capacidadeOperacional;
		this.qtdOperando = qtdOperando;
		this.qtdManutencao = qtdManutencao;
	}

	public int getAreaOcupada() {
		return areaOcupada;
	}

	public void setAreaOcupada(int areaOcupada) {
		this.areaOcupada = areaOcupada;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getCapacidadeOperacional() {
		return capacidadeOperacional;
	}

	public void setCapacidadeOperacional(int capacidadeOperacional) {
		this.capacidadeOperacional = capacidadeOperacional;
	}

	public int getQtdOperando() {
		return qtdOperando;
	}

	public void setQtdOperando(int qtdOperando) {
		this.qtdOperando = qtdOperando;
	}

	public int getQtdManutencao() {
		return qtdManutencao;
	}

	public void setQtdManutencao(int qtdManutencao) {
		this.qtdManutencao = qtdManutencao;
	}
}
