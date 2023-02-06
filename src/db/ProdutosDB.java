package db;
import models.Produtos;
import java.util.List;
import java.util.ArrayList;


public class ProdutosDB {
	
	private List<Produtos>produtosList = new ArrayList<>();
	
	public void addNovoProduto(Produtos produtos) {
		produtosList.add(produtos);
	}
	
	
	
	public List<Produtos> getProdutosList() {
		return produtosList;
	}

	public void setProdutosList(List<Produtos> produtosList) {
		this.produtosList = produtosList;
	}
	

	
	

}
