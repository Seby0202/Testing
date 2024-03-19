package com.elis.aeroportoprivato.model;

public enum Ruolo {
	CLIENTE("Cliente"),
	HOSTESS("Hostess"),
	PILOTA("Pilota"),
	ADMIN("Admin");
	
	private String nome;

	private Ruolo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}
