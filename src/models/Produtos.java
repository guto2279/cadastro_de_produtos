package models;
import java.util.Date;

public class Produtos {
	private int id;
	private String descricao;
	private double preco;
	private Date dataValidade;
	
	public Produtos (int id, String descricao, double preco, Date dataValidade) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescricao (String descricao) {
		
		this.descricao = descricao;
	}
	
	public int getId () {
		return id;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}

}
