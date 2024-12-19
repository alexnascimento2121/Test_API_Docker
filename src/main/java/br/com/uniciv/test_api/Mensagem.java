package br.com.uniciv.test_api;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="mensagem")
public class Mensagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1588804460128475313L;
	
	@Id
	private UUID id;
	
	private String mensagem;

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
