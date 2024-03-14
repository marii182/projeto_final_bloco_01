package produtos.model;



public  class Produtos {
	
	private int idProduto;
	private String nomeProduto;
	private String categoriaProduto;
	private float precoProduto;
	private int quantidadeEstoque;
	
	public Produtos(int idProduto, String nomeProduto, String categoriaProduto, float precoProduto, int quantidadeEstoque) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.categoriaProduto = categoriaProduto;
		this.precoProduto = precoProduto;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCategoriaProduto() {
		return categoriaProduto;
	}
	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Id do Produto: " + this.idProduto);
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("Categoria do Produto: " + this.categoriaProduto);
		System.out.println("Preço do Produto: " + this.precoProduto);
		System.out.println("Quantidade em Estoque: " + this.quantidadeEstoque);
	
		
	
	}
	
	
	
	
}
