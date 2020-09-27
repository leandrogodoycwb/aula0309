package com.github.leandrogodoycwb.aula05.classes;

public class Pessoa {
	private int id;
	private String nome;
	private String rg;
	private String email;
	
	public Pessoa(String nome, String rg, String email) {
		this.nome = nome;
		this.rg = rg;
		this.email = email;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
		
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------");
		//sb.append("Nome: " + getNome() + "\n");
		//sb.append("RG: " + getRg() + "\n");
		sb.append(getNome() + "," + getRg() + "," + getEmail() + "\n");
		return sb.toString();
	}

	}


