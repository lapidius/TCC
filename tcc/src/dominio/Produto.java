package dominio;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/* 
 * Entidade de cadastramento de produto
 * 
 * */

public class Produto {
//	@Id
//	@GeneratedValue(generator="seqGenerator")
//	@GenericGenerator(name="seqGenerator", strategy="br.ufrn.arq.dao.SequenceStyleGenerator",
//	           parameters={ @Parameter(name="sequence_name", value="estagio.hibernate_sequence") })	
//	@Column(name = "id")
	private int id;
	
//	@Column(name = "nome")
	private String nome;
	
//	@Column(name="quantidade")
	private int quantidade;
	
//	@Column(name="categoria")
	private String categoria;
	
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
