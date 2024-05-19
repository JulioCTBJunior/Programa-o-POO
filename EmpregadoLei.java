class EmpregadoLei extends Empregado{

public EmpregadoLei(int matricula, String nome, float salarioBase){
super(matricula, nome, salarioBase);}

public void setSalarioBase(float salarioBase){
if (super.getSalarioBase() <= salarioBase)
{super.setSalarioBase(salarioBase);
}else{
System.out.println("O salario nao pode ser menor!\n	");}
}
}