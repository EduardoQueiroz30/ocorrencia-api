package com.eduardo.ocorrencia.domain;

public class Agente extends Pessoa {

	private Integer rc;

	public Agente() {
		super();
	}

	public Agente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	public Agente(Integer rc) {
		super();
		this.rc = rc;
	}

	public Integer getRc() {
		return rc;
	}

	public void setRc(Integer rc) {
		this.rc = rc;
	}

}
