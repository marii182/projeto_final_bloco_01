package produtos.model;

public class FaixaEtaria extends Produtos {
	
	private String faixaEtaria;

	public FaixaEtaria(int idProduto, String nomeProduto, String categoriaProduto, float precoProduto,
			int quantidadeEstoque, String faixaEtaria) {
		super(idProduto, nomeProduto, categoriaProduto, precoProduto, quantidadeEstoque);
		this.faixaEtaria = faixaEtaria;

}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Faixa Etária: " + this.faixaEtaria);
	}
	
	
	
}
