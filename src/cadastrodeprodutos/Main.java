package cadastrodeprodutos;
import models.Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main (String [] args) throws Exception {
		
		System.out.println("--- Pedido de Vendas ---");
	
		Integer option = new Integer(0);
		// instanciar classe Scanner para pegar dados de entrada
		Scanner scanner = new Scanner (System.in);
		
		do {
			System.out.println("1 - Cadastrar produto");
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
				Integer id = scanner.nextInt();
				
				System.out.println("Digite o preço do produto: ");
				Double preco = scanner.nextDouble();
				
				System.out.println("Digite a data de validade: ");
				String dataString = scanner.next();
				
				Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
				// Instranciar classe produtos e jogar id e descrição que o usuario digitou
				Produtos novoProduto = new Produtos(id, descricao, preco, dataValidade);
				//novoProduto.setId (id);
				//novoProduto.setDescricao(descricao);
				System.out.println("Produto criado com sucesso!");
				
				// Mostrar na tela id e descrição coletados
				System.out.println("--- Id: " + novoProduto.getId());
				System.out.println("--- Descricao: " + novoProduto.getDescricao());
				System.out.println("--- Preço: " + novoProduto.getPreco());
				System.out.println("--- Data de validade: " + novoProduto.getDataValidade());
			}
		}
	}
}
