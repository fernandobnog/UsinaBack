package faj.poo.usina.model;

public class Usinas {

	private int id;
	private String nome;
	private int capacidadeEnergetica;
	private String tipo;
	private Boolean status;

	public Usinas() {
		this.id = id;
		this.nome = nome;
		this.capacidadeEnergetica = capacidadeEnergetica;
		this.tipo = tipo;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidadeEnergetica() {
		return capacidadeEnergetica;
	}

	public void setCapacidadeEnergetica(int capacidadeEnergetica) {
		this.capacidadeEnergetica = capacidadeEnergetica;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
