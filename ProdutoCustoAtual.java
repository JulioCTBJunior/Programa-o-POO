class ProdutoCustoAtual extends Produto {

public ProdutoCustoAtual(int codigo, String nome, int quantidade, float custo)
	{
	super(codigo,nome,quantidade,custo);
	}

public void repor(int quantidade, float custo)
	{super.setCusto(custo);
	 super.repor(quantidade, custo);}
}