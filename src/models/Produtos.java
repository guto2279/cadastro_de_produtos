package models;
import java.util.Date;

public class Produtos {
	private Integer id;
	private String descricao;
	private Double preco;
	private Date dataValidade;
	
	public Produtos (Integer id, String descricao, Double preco, Date dataValidade) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setDescricao (String descricao) {
		
		this.descricao = descricao;
	}
	
	public Integer getId () {
		return id;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}

}
