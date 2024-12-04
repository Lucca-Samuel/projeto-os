package com.lucca.os.domain.enuns;

public enum Status {
	ABERTO(0, "BAIXA"), ANDAMENTO(1, "MEDIA"), ENCERRADO(2, "ALTA");

	private Integer cod;
	private String descricao;

	private Status(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == 0) {
			return null;
		}
		
		for(Status x : Status.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		
		throw new IllegalArgumentException("Status Inválida! " + cod);
	}
}
