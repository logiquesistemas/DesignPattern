package br.com.logique.padroes.abstractfactory.domain;

public class Pessoa {

	private long id;
	
	private String nome;
	
	public Pessoa() {
	}

	public Pessoa(long id , String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
