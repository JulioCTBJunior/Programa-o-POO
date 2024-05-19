abstract class Produto
{
private int codigo;
private String nome;
private int quantidade;
private float custo;

public Produto(int codigo, String nome, int quantidade, float custo)
	{
	this.codigo = codigo;
	this.nome = nome;
	this.quantidade = quantidade;
	this.custo = custo;
	}

public int getCodigo()
	{return(this.codigo);}

public void setCodigo(int codigo)
	{this.codigo = codigo;}

public String getNome()
	{return(this.nome);}

public void setNome(String nome)
	{this.nome = nome;}

public int getQuantidade()
	{return(this.quantidade);}

public float getCusto()
	{return(this.custo);}

public void setCusto(float custo)
	{this.custo = custo;}

public float getValorEstoque()
	{return(this.quantidade*this.custo);}

public void repor(int quantidade, float custo)
	{this.quantidade += this.custo; }

public boolean validarSaldo(int quantidade)
	{return(this.quantidade >= quantidade);}

public void baixar(int quantidade)
	{if (this.validarSaldo(quantidade))
	{this.quantidade-=quantidade;
	}
else{System.out.println("Erro: Saldo insuficiente para a baixa.");
	}
	}

public void mostrarDados()
	{System.out.println("O codigo :"+this.codigo);
	 System.out.println("O nome :"+this.nome);
	 System.out.println("A quantidade :"+this.quantidade);
	 System.out.println("O custo :"+this.custo);
	 System.out.println("O valor do estoque :" + this.getValorEstoque());}


}