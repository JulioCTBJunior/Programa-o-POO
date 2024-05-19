class ProdutoCustoMedio extends Produto {
	
	public ProdutoCustoMedio(int codigo, String nome, int quantidade, float custo)
		{super(codigo, nome, quantidade,custo);}
	
	public void repor(int quantidade, float custo)
		{super.setCusto(((super.getQuantidade()*super.getCusto())+(quantidade + custo))/(super.getQuantidade()+quantidade));
		super.repor(quantidade, custo);}	
}
