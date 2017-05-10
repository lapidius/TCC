package jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dominio.Produto;

@ManagedBean
@SessionScoped
public class GerenciamentoMbean implements Serializable {
	private Produto produto;
	private List<Produto> produtos;
	
	public GerenciamentoMbean(){
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void Cadastrar(){
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
}
