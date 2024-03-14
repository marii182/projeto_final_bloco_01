package produtos.repository;

import produtos.model.Produtos;

public interface ProdutosRepository {

	//CRUD da conta
	public void procurarporId(int idProduto);
	public void listarTodos();
	public void cadastrar(Produtos produtos);
	public void atualizar(Produtos produtos);
	public void deletar(int idProduto);
	
	
}
