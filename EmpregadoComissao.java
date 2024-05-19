class EmpregadoComissao extends EmpregadoLei{
private double comissao;

public EmpregadoComissao(int matricula, String nome, float salarioBase, double comissao){
super(matricula, nome, salarioBase);
this.comissao = comissao;}

public void setComissao(float comissao){
this.comissao = comissao;}

public double getComissao(){
return(this.comissao);}

public double salarioLiquido(float vendas){
return(super.salarioLiquido() + (vendas * (getComissao()/100.0)));}

public void mostrarDados(){
System.out.println("A matricula : "+super.getMatricula());
System.out.println("O nome e : "+super.getNome());
System.out.println("O salario base e : "+super.getSalarioBase());
System.out.println("A comissao e de "+this.comissao);
System.out.println("");
}
}