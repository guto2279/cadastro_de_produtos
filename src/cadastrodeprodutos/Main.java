package cadastrodeprodutos;
import models.Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import db.ProdutosDB;

public class Main {
	
	static ProdutosDB produtosDB = new ProdutosDB();

	public static void main (String [] args) throws Exception {
		System.out.println("--- Pedido de Vendas ---");
	
		int option = 0;
		// instanciar classe Scanner para pegar dados de entrada
		Scanner scanner = new Scanner (System.in);
		
		do {
			System.out.println("1 - Cadastrar produtos");
			System.out.println("2 - Listar produtos cadastrados");
			System.out.println("0 - Sair");
			
			System.out.println("Digite a operação que deseja realizar: ");
			option = scanner.nextInt();
			process(option);
		} while(option != 0);
	
	}
	
	
	
	
		public static void process(int option) throws Exception{
			Scanner scanner = new Scanner(System.in);
			
			switch (option){
			case 1:{
				// Pedir descrição e id do produto
				System.out.print("Digite a descrição do produto: ");
				String descricao = scanner.nextLine();
				
				System.out.print("Digite o id do produto: ");
				int id = scanner.nextInt();
				
				System.out.println("Digite o preço do produto: ");
				double preco = scanner.nextDouble();
				
				System.out.println("Digite a data de validade: ");
				String dataString = scanner.next();
				
				Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
				// Instranciar classe produtos e jogar id e descrição que o usuario digitou
				Produtos novoProduto = new Produtos(id, descricao, preco, dataValidade);
				//novoProduto.setId (id);
				//novoProduto.setDescricao(descricao);
				System.out.println("Produto criado com sucesso!");
				
				
				produtosDB.addNovoProduto(novoProduto);
				break;
				
			}
			
			case 2: {
				List<Produtos> listaDeProdutos = produtosDB.getProdutosList();
				
				for (Produtos produtos : listaDeProdutos) {
					System.out.println("--- Id: " + produtos.getId());
					System.out.println("--- Descricao: " + produtos.getDescricao());
					System.out.println("--- Preço: " + produtos.getPreco());
					System.out.println("--- Data de validade: " + produtos.getDataValidade());
					System.out.println("----------------------------------------------");
					break;
				}
			}
			
		}
	}
}
