package produtos.controller;

import java.util.ArrayList;

import produtos.model.Produtos;
import produtos.repository.ProdutosRepository;

public class ProdutosController implements ProdutosRepository {
	
	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int idProduto = 0;

	@Override
	public void procurarporId(int idProduto) {
		var produtos = buscarNaCollection(idProduto);
		
		if (produtos != null)
			produtos.visualizar();
		else
			System.out.println("\nO Produto Id Número: " + idProduto + " não foi encontrado!");
		
		
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produtos produtos) {
		listaProdutos.add(produtos);
	    System.out.println("\nO Produto Id " + produtos.getIdProduto() + " foi criado com sucesso!");
		
	}

	@Override
	public void atualizar(Produtos produtos) {
		var buscaProduto = buscarNaCollection(produtos.getIdProduto());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produtos);
			System.out.println("\nO Produto Id Número: " + produtos.getIdProduto() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO Produto Id Número: " + produtos.getIdProduto() + " não foi encontrado!");
		
	}

	@Override
	public void deletar(int idProduto) {
		var produto = buscarNaCollection(idProduto);
		
		if(produto != null) {
			if(listaProdutos.remove(produto) == true)
				System.out.println("\nO produto com Id número: " + idProduto + " foi deletado com sucesso!");
		}else
			System.out.println("\nO produto com Id número: " + idProduto + " não foi encontrado!");
		
	}

	
	
	public int gerarId() {
		return ++ idProduto;
	}
	
	public Produtos buscarNaCollection(int idProduto) {
		for (var produtos : listaProdutos) {
			if (produtos.getIdProduto() == idProduto) {
				return produtos;
			}
		}
		return null;
	}

	

}
